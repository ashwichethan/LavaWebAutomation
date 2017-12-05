package com.lava.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.net.URISyntaxException;
import java.util.*;

/**
 * Created by codecraft on 13/09/16.
 */
public class Base {
    public static long wait = 60;
    public static RemoteWebDriver driver;
    public static FileInputStream fileName = null;
    public static FileOutputStream output = null;
    public static XSSFWorkbook workBook = null;
    public static XSSFSheet sheet = null;
    public static XSSFRow row = null;
    public static XSSFCell cell = null;

    public static boolean isElementVisible(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }

    }

    public static void waitForElementToBeInvisible(WebElement element) {
        WebDriverWait wwait = new WebDriverWait(driver, wait);
        wwait.until(invisibilityOfWebElementLocated(element));
    }

    public static void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait wwait = new WebDriverWait(driver, wait);
        wwait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementHasText(WebElement element, String text) {
        WebDriverWait wwait = new WebDriverWait(driver, wait);
        wwait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    private static ExpectedCondition<Boolean> invisibilityOfWebElementLocated(final WebElement element) {
        return new ExpectedCondition<Boolean>() {
            //@Override
            public Boolean apply(WebDriver driver) {
                try {
                    return !element.isDisplayed();
                } catch (Exception e) {
                    return true;
                }
            }
        };
    }

    public static void waitUntilElementsAttributeHasChanged(WebElement element, String attribute, String initialValue) {
        WebDriverWait wwait = new WebDriverWait(driver, wait);
        wwait.until(attributeValueOfElementChanged(element, attribute, initialValue));
    }

    private static ExpectedCondition<Boolean> attributeValueOfElementChanged(final WebElement element, final String attribute, final String initialValue) {
        return new ExpectedCondition<Boolean>() {
            //@Override
            public Boolean apply(WebDriver driver) {
                try {
                    return !element.getAttribute(attribute).equalsIgnoreCase(initialValue);
                } catch (Exception e) {
                    return true;
                }
            }
        };

    }


    /**
     * get current location of the browser
     *
     * @return
     */
    public static String getCurrentLocation() {
        driver.executeScript("return document.readyState;").equals("complete");
        return driver.getCurrentUrl();
    }

    /**
     * return current window handles
     */
    public static Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    /**
     * return current window handle
     */
    public static String getWindowHandle() {
        return driver.getWindowHandle();
    }

    /**
     * return targert locator
     *
     * @return
     */
    public static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    /**
     * navigate to new page
     *
     * @return
     */
    public static WebDriver.Navigation navigateTo() {
        return driver.navigate();
    }

    public static void back() {
        driver.navigate().back();
    }

    public static void forward() {
        driver.navigate().forward();
    }

    public static void refreshPage() {
        driver.navigate().refresh();
    }

    /**
     * wait for page to load having given URL
     *
     * @param pageURL
     */
    public static boolean waitForPageToLoad(final String pageURL) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 45);
            return wait.until(new ExpectedCondition<Boolean>() {
                                  public Boolean apply(WebDriver d) {
                                      return (driver.getCurrentUrl().toLowerCase().contains(pageURL.toLowerCase())) && driver.executeScript("return document.readyState;").equals("complete");
                                  }
                              }
            );
        } catch (Exception e) {
            return false;
        }
    }

    public static void getElementintoView(WebElement element) {
        Coordinates coordinates = ((Locatable) element).getCoordinates();
        System.out.println(coordinates.inViewPort());
        sleep(3000);
    }

    public static void sleep(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollToElement(WebElement element) {

        JavascriptExecutor jse = driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollVerticallWithCords(int startValue, int endValue) {
        try {
            driver.executeScript("scroll(" + startValue + "," + endValue + " );");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void scrollToElementHorizontally(WebElement element) {
    WebElement  myElement = (new WebDriverWait(driver, 30))
            .until(ExpectedConditions.elementToBeClickable(element));
                myElement.click();
    Actions move = new Actions(driver);
                move.moveToElement(myElement).clickAndHold();
                move.moveByOffset(125,0);
                move.release();
                move.perform();
    }

    //Scroll Down
    public static void scrollDownVertical() {
        try {
            JavascriptExecutor js = driver;

            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mouseHoverAndClickElement(WebElement srcElement, WebElement targetElement) {
        Actions action = new Actions(driver);
        action.moveToElement(srcElement).perform();
        action.moveToElement(targetElement);
        action.click();
        action.perform();
    }

    public static void mouseHoverOnElement(WebElement srcElement) {
        Actions action = new Actions(driver);
        action.moveToElement(srcElement).perform();
    }

    public static void slideThroughSlider(WebElement element, int value) {
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(element, value, 0).build();
        action.perform();
    }

    //Should work on any Input Type
    // @Parameters: WebElement, String
    // Returns: boolean
    public static boolean enterTextInTextField(WebElement element, String text) {
        element.sendKeys(text);
        return getValueOfTextField(element).equalsIgnoreCase(text);

    }

    public static String getValueOfTextField(WebElement element) {
        return element.getAttribute("value");
    }

    public static String generateRandomString(int length) {
        String randomString = new String();
        randomString = RandomStringUtils.randomAlphabetic(length);
        return randomString;
    }

    public static String generateAlphaNumericString(int length) {
        String randomAlphaNumericString;
        randomAlphaNumericString = RandomStringUtils.randomAlphanumeric(length);
        return randomAlphaNumericString;
    }

    public static String generateRandomMobileNumber() {
        String mobileNumber = new String();
        mobileNumber = RandomStringUtils.random(1, "789");
        mobileNumber = mobileNumber + RandomStringUtils.randomNumeric(9);
        return mobileNumber;
    }

    public static String generateRandomLimitValue() {
        String limitValue;
        limitValue = RandomStringUtils.randomNumeric(2);
        System.out.println("LIMIT VALUE : " + limitValue);
        // limitValue=limitValue+RandomStringUtils.randomNumeric(2);
        return limitValue;
    }

    public static String generateRandomEmail() {
        String email = RandomStringUtils.randomAlphanumeric(12).toLowerCase();
        return email + "@mailinator.com";
    }

    public static String generateRandomNameforprofile() {
        String name = RandomStringUtils.randomAlphanumeric(12).toLowerCase();
        System.out.println("profile name is : Automation_" + name);
        return "Automation_" + name;
    }

    public static String generateRandomName() {
        String name = RandomStringUtils.randomAlphanumeric(12).toLowerCase();
        System.out.println("Random name is : Automation_" + name);
        return "Automation_" + name;
    }

    public static void scrollDown() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        action.sendKeys(Keys.PAGE_DOWN).release();
        sleep(3000);
    }

    //Method which will select the Tab in Carousel view
    public static void carouselCategorySelection(String tabName, List<WebElement> selectCategory, WebElement arrowBtn) {

        String categoryName;
        WebElement category;

        for (int categoryIndex = 0; categoryIndex < selectCategory.size(); categoryIndex++) {
            category = selectCategory.get(categoryIndex);
            sleep(1000);
            Boolean visibility = isElementVisible(category);
            if (visibility == true) {
                categoryName = category.getText();
            } else {
                Actions action = new Actions(driver);
                action.moveToElement(arrowBtn).doubleClick().perform();
                sleep(1000);
                categoryName = category.getText();
            }
            if (tabName.equalsIgnoreCase(categoryName)) {
                category.click();
                System.out.println("Clicked on the Category:" + categoryName);
                break;
            }
            System.out.println(categoryName);
        }

    }

    //Method which will select the Node in Inner Carousel view
    public static void carouselNodeSelection(String dragTrigger, List<WebElement> nodeToDrag, List<WebElement> innerCarouselArrowBtn, WebElement column) {

        String nodeName;
        WebElement node;

        for (int triggerIndex = 0; triggerIndex < nodeToDrag.size(); triggerIndex++) {
            node = nodeToDrag.get(triggerIndex);

            Boolean visibility = isElementVisible(node);
            if (visibility == true) {
                nodeName = node.getText();
            } else {
                clickArrowBtn(innerCarouselArrowBtn);
                waitUntilElementIsVisible(node);
                nodeName = node.getText();
            }
            if (dragTrigger.equalsIgnoreCase(nodeName)) {
                dragAndDropNodes(node, column);
                System.out.println("Node that is selected is: " + nodeName);
                break;
            }
            System.out.println("Node Names: " + nodeName);
        }
    }

    //Drag and Drop items
    public static void dragAndDropNodes(WebElement node, WebElement column) {

        Actions action = new Actions(driver);
        action.dragAndDrop(node, column).build().perform();
        sleep(1500);
//    action.release();
//    sleep(500);
    }

    //Check for Dialogues
    public static boolean checkForDialogs(WebElement element) {

        try {
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    // Generic Methods

    //Get the index of the Arrow button used as pagination for nodes
    public static void clickArrowBtn(List<WebElement> innerCarouselArrowBtn) {

        for (int indexCount = 0; indexCount < innerCarouselArrowBtn.size(); indexCount++) {
            WebElement arrowBtn = innerCarouselArrowBtn.get(indexCount);
            if (isElementVisible(arrowBtn)) {
                arrowBtn.click();

            }
        }

    }



    public static void updateTestResult(String keyword, String Result, String sheetName) throws IOException {


        FileInputStream file = new FileInputStream("Automation_MUI_TestReport.xlsx");
        workBook = new XSSFWorkbook(file);
        sheet = workBook.getSheet(sheetName);

        int col_num = 0, row_num = 1;
        row = sheet.getRow(0); //Fetch header name
        //Fetching columnNumber of "keyword"
        for (int i = 0; i <= row.getLastCellNum(); i++) {
            if (row.getCell(i).getStringCellValue().equals("TestCase Number")) {
                col_num = i;
                break;
            }
        }

        //Fetching rowNumber of Keyword and updating the cell value as Pass/Fail under Result column
        for (int j = row_num; j <= row.getLastCellNum(); row_num++) {
            row = sheet.getRow(row_num);
            if (row.getCell(col_num).getStringCellValue().equals(keyword)) {
                row = sheet.getRow(row_num);
                XSSFFont font = workBook.createFont();
                XSSFCellStyle style = workBook.createCellStyle();
                cell = row.createCell(6);
                cell = row.getCell(6);
                font.setFontName("TIMES NEW ROMAN");
                font.setFontHeight(12.0);
                font.setBold(true);
                style.setFont(font);
                cell.setCellStyle(style);
                if (Result.matches("PASS")) {
                    cell.setCellValue(Result);
                    style.setFillForegroundColor(new XSSFColor(java.awt.Color.green));
                } else {
                    cell.setCellValue(Result);
                    style.setFillForegroundColor(new XSSFColor(java.awt.Color.red));
                }

                file.close();

                output = new FileOutputStream("Automation_MUI_TestReport.xlsx");
                workBook.write(output);
                output.close();

                break;

            }
        }
    }

    /**
     * execute lava script
     *
     * @param script
     * @return
     */
    public Object executeScript(String script) {
        return driver.executeScript(script);
    }

    public Object executeScript(String script, WebElement element) {
        return driver.executeScript(script, element);

    }

    /**
     * get page source
     *
     * @return
     */
    public String getPageSource() {
        return driver.getPageSource();
    }

    /**
     * get title of page
     *
     * @return
     */
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * opens passed Url
     *
     * @param url
     */
    public void openUrl(String url) {
        driver.get(url);
    }

    /**
     * delete all cookies
     */
    public void deleteAllCookies() {

        driver.manage().deleteAllCookies();
    }

    /**
     * zoom out browser
     *
     * @param numberOfTimes
     */
    public void zoomOut(int numberOfTimes) {
        try {
            for (int i = 0; i < numberOfTimes; i++) {
                driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
            }
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    /**
     * reset zoom
     */
    public void resetZoom() {
        try {
            driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    /**
     * Generic method to Switch to Pop Up, enter element as parameter by which clicking on it pop up opens
     *
     * @param popup
     */
    public String switchtoPopup(WebElement popup) {
        String mainWindowHandle = driver.getWindowHandle();
        sleep(3000);
        //popup.click();
        Set s = driver.getWindowHandles();
        Iterator ite = s.iterator();
        while (ite.hasNext()) {
            String popupHandle = ite.next().toString();
            if (!popupHandle.contains(mainWindowHandle)) {
                driver.switchTo().window(popupHandle);
            }
        }

        return mainWindowHandle;
    }

    /**
     * Switch to Parent window with parameter value of Parent window
     *
     * @param Parentwindow
     */
    public void switchtoParentfromPopUp(String Parentwindow) {
        driver.switchTo().window(Parentwindow);
    }

    public void closeChildWindowofPopUp(String childwindow) {
        driver.switchTo().window(childwindow).close();
    }

    /**
     * This function is used to return currentwindow
     *
     * @return
     */
    public String returnCurrentWindowHandle() {
        return driver.getWindowHandle();
    }


    // delete method is incomplete
    public static void deleteFromTheList(List<WebElement> namesInTheList, WebElement deleteBtn, WebElement BtnInDialog) {
        String name;
        WebElement getIndex;
        for (int index = 0; index < namesInTheList.size(); index++) {
            getIndex = namesInTheList.get(index);
            name = getIndex.getText();
            if (name.equalsIgnoreCase("")) {
                System.out.println("Scroll down");
                scrollToElement(getIndex);
                --index;
            } else {
                System.out.println("Name is : " + name);
                if (name.contains("Automation")) {
                    System.out.println("Name contains text 'Automation'");
                    getIndex.click();

                    System.out.println("Check for status ");
//
//                    if(dp.isProfileinAvailableState()) {
//                        System.out.println("Element is in Available state and it will be deleted ");
//                        deleteBtn.click();
//                        waitUntilDeleteModal();
//                        BtnInDialog.click();
//                        pc.waitForSpinnerToBeInVisible();
//                        sleep(500);
//                        String successMessage = pc.successMessage();
//                        System.out.println("Success toast message is " + successMessage);
//                        System.out.println();
//                        sleep(3000);
////                        --index;
//                    } else {
//                        System.out.println("This element is not in Draft or In-use state and cannot be deleted");
//                        System.out.println();
//                    }


                } else {
                    System.out.println("This element name doesn't contain text 'Automation'");
                    System.out.println();
                }
            }

        }

    }


    public void tooltip(List<WebElement> hoverOnEngagement, List<WebElement> toolTipContents) {

        sleep(1000);
        WebElement eng;

        System.out.println("Total number in list is " + hoverOnEngagement.size());
        System.out.println();
        for (int j = 0; j < hoverOnEngagement.size(); j++) {
            mouseHoverOnElement(hoverOnEngagement.get(j));
            sleep(3000);
            //mouseHoverOnElement(EgTt.toolTipContent);

            for (int i = 0; i < toolTipContents.size(); i++) {
                eng = toolTipContents.get(i);
                String contents = eng.getText();
                System.out.println("Tooltip contents are " + contents);
                mouseHoverOnElement(hoverOnEngagement.get(j));
            }
            System.out.println();
        }


    }

}