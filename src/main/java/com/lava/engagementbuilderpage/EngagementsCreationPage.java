package com.lava.engagementbuilderpage;

import com.lava.Pages;
import com.lava.utils.Base;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by jenkins on 22/03/17.
 */
public class EngagementsCreationPage  extends Base{
    EngagementsCreationRepo enRp;
    String engagementName;
    WebElement engagements;

    public EngagementsCreationPage(){
        enRp= new EngagementsCreationRepo(driver);

    }
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(DeleteEngagementsRepo.spinnerOverlay);
    }
    public boolean isDesignTabVisible() {
        waitUntilElementIsVisible(EngagementsCreationRepo.designTab);
        return true;
    }

    public boolean isEngagementsTabVisible() {
        waitUntilElementIsVisible(EngagementsCreationRepo.engagementsTab);
        return true;
    }

    public void clickDesignTab() {
        EngagementsCreationRepo.designTab.click();
    }

    public void clickEngagementsTab() {
        EngagementsCreationRepo.engagementsTab.click();
    }

    public boolean isDiscountOfferNodeVisible() {
        waitUntilElementIsVisible(EngagementsCreationRepo.discountOfferNode);
        return true;
    }

    public void clickCancelButton() {
        EngagementsCreationRepo.cancelButton.click();
    }

    public void clickSetEngagementBtn1() {
        EngagementsCreationRepo.setEngagementsButton.click();
    }

    public void clickCloseButton() {
        EngagementsCreationRepo.closeButton.click();
    }

    public void getEngagementTitle() {
        EngagementsCreationRepo.engagementTitle.getText();
    }

    public void getEngagementNameText() {
        EngagementsCreationRepo.engagementName.getText();
    }

    public void enterEngagementName() {
        String engagementRandomName = generateRandomName();
        EngagementsCreationRepo.engagementName.sendKeys(engagementRandomName);
    }




    public void clickSetEngagementBtn2() {
        EngagementsCreationRepo.setEngagementsButton2.click();
    }



    public void enterDiscountOffer() {
        EngagementsCreationRepo.discountTextMsg.sendKeys("10");
    }

    public void enterSMSOffer() {
        EngagementsCreationRepo.smsTextMsg.sendKeys(generateRandomName());
    }

    public void enterURLValue() {
        EngagementsCreationRepo.enterUrl.sendKeys(generateRandomName());
    }

    public void enterSponsorEngagementTitle() {
        EngagementsCreationRepo.enterSponsorOrSurveyTitle.sendKeys(generateRandomName());
    }

    public void enterSponsorEngagementName() {
        EngagementsCreationRepo.enterSponsorName.sendKeys(generateRandomName());
    }

    public void enterSponsorEngagementQuestion() {
        EngagementsCreationRepo.enterSponsorQuestion.sendKeys(generateRandomName());
    }

    public void clickIfYesDropdown() {
        EngagementsCreationRepo.ifYesDropdown.click();
    }

    public void clickIfNoDropdown() {
        EngagementsCreationRepo.ifNoDropdown.click();
    }

    public void enterSurveyID() {
        EngagementsCreationRepo.enterSurveyID.sendKeys(generateRandomName());
    }

    public void enterSurveyQuestion() {
        EngagementsCreationRepo.enterSurveyQuestion.sendKeys(generateRandomName());
    }

    public void waitUntilEngagementPageIsDisplayed(){
        waitUntilElementIsVisible(EngagementsCreationRepo.engagementsPage);
    }

    public void enterMobileInAppBannerTitle() {
        EngagementsCreationRepo.enterMobileInAppBannerTitle.sendKeys(generateRandomName());
    }

    public boolean createEngagements(){
        refreshPage();
        if(isElementVisible(enRp.spinnerOverlay)==true){
            waitUntilElementIsVisible(enRp.spinnerOverlay);
        }
        goToEngagementPage();
        selectEngagementTemplate();
        return true;
    }

    public void goToEngagementPage(){
        if(isElementVisible(EngagementsCreationRepo.isNodesVisibleEngagement)==false) {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            EngagementsCreationRepo.designTab.click();
            waitUntilElementIsVisible(EngagementsCreationRepo.engagementsTab);
            EngagementsCreationRepo.engagementsTab.click();
            waitUntilElementIsVisible(EngagementsCreationRepo.engagementsPage);
            sleep(3000);
        }

    }



    public void selectEngagementTemplate() {

        List<WebElement> selectEngagement = EngagementsCreationRepo.engagementslist;
        int engagamenttypes = selectEngagement.size();
        System.out.println("Total engagements in list "+engagamenttypes);
        for (int engagementIndex = 0; engagementIndex <engagamenttypes; engagementIndex++) {
            engagements = selectEngagement.get(engagementIndex);
            scrollToElement(engagements);
            waitUntilElementIsVisible(engagements);
            engagementName = engagements.getText();
            System.out.println("engagement name "+ engagementName);
            switch (engagementName) {
                case "Discount Offer" :
                    clickOnEngagementNode();
                    discountOffer();
                    sleep(2000);
                    break;
                case "SMS Text"  :
                    clickOnEngagementNode();
                    smsOffer();
                    sleep(2000);
                    break;
                case "Return Personalized Content":
                    clickOnEngagementNode();
                    returnPersonalizedContent();
                    sleep(2000);
                    break;
                case "Sponsor Opt-in Notification":
                    clickOnEngagementNode();
                    sponsorOptInNotification();
                    sleep(2000);
                    break;
                case "Survey":
                    clickOnEngagementNode();
                    survey();
                    sleep(2000);
                    break;
                case "Mobile in app notification":
                    clickOnEngagementNode();
                    mobileInAppNotification();
                    sleep(2000);
                    break;
                case "Gaming award player":
                    clickOnEngagementNode();
                    gamingAwardPlayer();
                    sleep(2000);
                    break;
                case "Rebate Percentage Award":
                    clickOnEngagementNode();
                    rebatePercentageAward();
                    sleep(2000);
                    break;
                case "Rebate Table Award":
                    clickOnEngagementNode();
                    rebateTableAward();
                    sleep(2000);
                    break;
                case "Personal Pay Table Award":
                    clickOnEngagementNode();
                    personalPaytableAward();
                    sleep(2000);
                    break;
                case "Tables Rebate Percentage Award":
                    clickOnEngagementNode();
                    tablesRebatePercentageAward();
                    sleep(2000);
                    break;
                case "Distribute passes":
                    clickOnEngagementNode();
                    distrubutePasses();
                    sleep(2000);
                    break;
                case "Astor Test Engagement":
                    clickOnEngagementNode();
                    astorTestEngagement();
                    sleep(2000);
                    break;
                default: break;
            }
        }
    }
    public void clickOnEngagementNode(){
       // Boolean isEngagementTemplateVisible = isElementVisible(engagements);
        if (isElementVisible(engagements)) {
            engagements.click();
        }
            //Else method is to make sure element is visible since cursor will remain in the list and tooltip of engagement will be covering the nodes and we get exceptions
            else{
                mouseHoverOnElement(EngagementsCreationRepo.engagementsPage);
                sleep(1000);
                engagements.click();
            }

        }


    public void clickSetEngagementButton(){
        Boolean isSetEngagementBtnVisible = isElementVisible(EngagementsCreationRepo.setEngagementsButton);
     //Set engagement button is different for Return Personalized Content and Gaming Player Award engagement, hence we use condition.
     if (isSetEngagementBtnVisible  == true) {
         clickSetEngagementBtn1();
     } else {
         clickSetEngagementBtn2();
     }


 }

    public void toastMessage() {
        waitUntilElementIsVisible(EngagementsCreationRepo.successToastMessage);
        String successMessage = EngagementsCreationRepo.getSuccessToastMessage.getText();
        waitForElementToBeInvisible(EngagementsCreationRepo.successToastMessage);
        System.out.println("Success toast message is: " + successMessage);
        System.out.println();
    }

public void discountOffer(){
    engagementName = engagements.getText();
    System.out.println("Engagement node: " + engagementName);
    Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
    System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
    sleep(1000);
    limit("40", "50");
    enterEngagementName();
    enterDiscountOffer();
    sleep(1000);
    clickSetEngagementButton();
    toastMessage();

}
public void smsOffer(){
    engagementName = engagements.getText();
    System.out.println("Engagement node: " + engagementName);
    Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
    System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
    sleep(100);
    limit("30", "80");
    enterEngagementName();
    enterSMSOffer();
    sleep(1000);
    clickSetEngagementButton();
    toastMessage();

}


public void returnPersonalizedContent(){
    engagementName = engagements.getText();
    System.out.println("Engagement node: " + engagementName);
    Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
    System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
    sleep(100);
    limit("10", "76");
    enterEngagementName();
   // clicklistRadioButtonReturnPersonalized();
    clickUrlRadioButtonReturnPersonalized();
    sleep(1000);
    clickSetEngagementButton();
    toastMessage();


}
    public void clicklistRadioButtonReturnPersonalized(){
        EngagementsCreationRepo.listRadioButton.click();
        EngagementsCreationRepo.clickSelectUrlFromList.click();
        EngagementsCreationRepo.selectUrlFromList.get(2).click();
    }

    public void clickUrlRadioButtonReturnPersonalized(){
        EngagementsCreationRepo.urlRadioButton.click();
        enterURLValue();
        EngagementsCreationRepo.clickSelectTypeUrl.click();
        EngagementsCreationRepo.selectTypeUrl.get(1).click();
    }


public void sponsorOptInNotification(){
    engagementName = engagements.getText();
    System.out.println("Engagement node: " + engagementName);
    Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
    System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
    sleep(100);
    limit("140", "89");
    enterEngagementName();
    enterSponsorEngagementTitle();
    enterSponsorEngagementName();
    enterSponsorEngagementQuestion();
    clickIfYesDropdown();
    sleep(2000);
   // List<WebElement> size1 = EngagementsCreationRepo.selectIfYesMedia;
    //System.out.println("If yes size "+EngagementsCreationRepo.selectIfYesMedia.size());
    List<WebElement> allSuggestions = EngagementsCreationRepo.selectIfYesMedia;
//    for (WebElement suggestion : allSuggestions)
//    {
//        System.out.println(suggestion.getText());
//
//    }
System.out.println("List length"+allSuggestions.size());
    allSuggestions.get(2).click();
    clickIfNoDropdown();
    EngagementsCreationRepo.selectIfYNoMedia.get(2).click();
    sleep(1000);
    clickSetEngagementButton();
    toastMessage();
}

    public void survey(){
        engagementName = engagements.getText();
        System.out.println("Engagement node: " + engagementName);
        Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
        System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
        sleep(100);
        limit("51", "098");
        enterEngagementName();
        enterSponsorEngagementTitle();
        enterSurveyID();
        enterSurveyQuestion();
        clickIfYesDropdown();
        EngagementsCreationRepo.selectIfYesMedia.get(2).click();
        clickIfNoDropdown();
        EngagementsCreationRepo.selectIfYNoMedia.get(1).click();
        sleep(1000);
        clickSetEngagementButton();
        toastMessage();
    }

    public void inAppAction(){

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    //Header
    EngagementsCreationRepo.mobileInAppHeader.click();
    EngagementsCreationRepo.headerTextMsg.click();
    EngagementsCreationRepo.textArea.get(0).sendKeys("header");
    EngagementsCreationRepo.mobileInAppHeader.click();


    EngagementsCreationRepo.headerImage.click();
    EngagementsCreationRepo.selectHeaderImage.click();
    EngagementsCreationRepo.selectHeaderImageFromList.get(0).click();
    EngagementsCreationRepo.doNothingRadioButton.get(0).click();
    EngagementsCreationRepo.openURLRadioButton.get(0).click();
    EngagementsCreationRepo.enlargeRadioButton.get(0).click();


    EngagementsCreationRepo.mobileInAppHeader.click();
    EngagementsCreationRepo.headerVideo.click();
    EngagementsCreationRepo.selectHeaderVideo.click();
    EngagementsCreationRepo.selectHeaderVideoFromList.get(0).click();

    //Body
    EngagementsCreationRepo.mobileInAppBody.click();
    EngagementsCreationRepo.bodyTextMsg.click();
    EngagementsCreationRepo.textArea.get(1).sendKeys("body");
    EngagementsCreationRepo.mobileInAppBody.click();


    EngagementsCreationRepo.bodyImage.click();
    EngagementsCreationRepo.selectBodyImage.click();
    EngagementsCreationRepo.selectBodyImageFromList.get(0).click();
    EngagementsCreationRepo.doNothingRadioButton.get(1).click();
    EngagementsCreationRepo.openURLRadioButton.get(1).click();
    EngagementsCreationRepo.enlargeRadioButton.get(1).click();

    EngagementsCreationRepo.mobileInAppBody.click();
    EngagementsCreationRepo.bodyVideo.click();
    EngagementsCreationRepo.selectBodyVideo.click();
    EngagementsCreationRepo.selectBodyVideoFromList.get(0).click();

    //Footer
    EngagementsCreationRepo.mobileInAppFooter.click();
    EngagementsCreationRepo.footerTextMsg.click();
    EngagementsCreationRepo.textArea.get(2).sendKeys("footer");
    EngagementsCreationRepo.mobileInAppFooter.click();

    EngagementsCreationRepo.footerImage.click();
    EngagementsCreationRepo.selectFooterImage.click();
    EngagementsCreationRepo.selectFooterImageFromList.get(0).click();
    EngagementsCreationRepo.doNothingRadioButton.get(2).click();
    EngagementsCreationRepo.openURLRadioButton.get(2).click();
    EngagementsCreationRepo.enlargeRadioButton.get(2).click();
    EngagementsCreationRepo.mobileInAppFooter.click();

    EngagementsCreationRepo.footerVideo.click();
    EngagementsCreationRepo.selectFooterVideo.click();
    EngagementsCreationRepo.selectFooterVideoFromList.get(0).click();
    }


    public void mobileInAppNotification(){
//        engagementName = engagements.getText();
//        System.out.println("Engagement node: " + engagementName);
//        Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
//           System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
        sleep(3000);
           limit("98", "76");
        enterEngagementName();
        enterMobileInAppBannerTitle();

           inAppAction();

           EngagementsCreationRepo.loadingTextMessage.sendKeys("loading");

           //Always keep sleep before clicking on set engagement button
        sleep(1000);
        clickSetEngagementButton();
        toastMessage();}




public void gamingAwardPlayer(){

       engagementName = engagements.getText();
       System.out.println("Engagement node: " + engagementName);
       //sleep(2000);
       Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
       System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
       sleep(100);
       limit("98", "86");
       enterEngagementName();
       EngagementsCreationRepo.awardType.click();
EngagementsCreationRepo.selectAwardType.get(0).click();
EngagementsCreationRepo.awardValue.sendKeys("200");
EngagementsCreationRepo.holdAdjustmentTable.click();
EngagementsCreationRepo.selectHoldAdjustmentTable.get(0).click();

       sleep(1000);
       clickSetEngagementButton();
       toastMessage();
}

public void limit(String limit, String IndividualValue){
if(isElementVisible(EngagementsCreationRepo.sandboxCheckButton)==true){
EngagementsCreationRepo.sandboxCheckButton.click();
EngagementsCreationRepo.addlimitButton.click();
sleep(1000);
EngagementsCreationRepo.limitInput.sendKeys(limit);
if(isElementVisible(EngagementsCreationRepo.overrideCheckButton)) {
    EngagementsCreationRepo.overrideCheckButton.click();
    EngagementsCreationRepo.individualValue.sendKeys(IndividualValue);
}
}}

    public void rebatePercentageAward(){

            engagementName = engagements.getText();
            System.out.println("Engagement node: " + engagementName);
            //sleep(2000);
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
            sleep(100);
            limit("98", "86");
            enterEngagementName();
            EngagementsCreationRepo.deliveryProbability.sendKeys("15");
            EngagementsCreationRepo.awardPercentage.sendKeys("65");
            EngagementsCreationRepo.rebateTypeCoinIn.click();
            EngagementsCreationRepo.rebatePercentage.sendKeys("71");
            EngagementsCreationRepo.awardTypeRebate.click();
            EngagementsCreationRepo.selectAwardTypeRebate.get(1).click();
            EngagementsCreationRepo.deliveryMode.get(2).click();

            sleep(1000);
            clickSetEngagementButton();
            toastMessage();

    }

    public void rebateTableAward(){

            engagementName = engagements.getText();
            System.out.println("Engagement node: " + engagementName);
            //sleep(2000);
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
            sleep(100);
            limit("98", "86");
            enterEngagementName();
            EngagementsCreationRepo.deliveryProbability.sendKeys("25");
            EngagementsCreationRepo.awardPercentage.sendKeys("65");
            EngagementsCreationRepo.rebateTable.click();
            EngagementsCreationRepo.selectRebateTable.get(1).click();

            EngagementsCreationRepo.awardTypeRebate.click();
            EngagementsCreationRepo.selectAwardTypeRebate.get(1).click();
            EngagementsCreationRepo.deliveryMode.get(2).click();

            sleep(1000);
            clickSetEngagementButton();
            toastMessage();
            sleep(3000);
    }

    public void personalPaytableAward(){

            engagementName = engagements.getText();
            System.out.println("Engagement node: " + engagementName);
            //sleep(2000);
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
            sleep(100);
            limit("98", "86");
            enterEngagementName();
            EngagementsCreationRepo.deliveryProbability.sendKeys("25");
            EngagementsCreationRepo.awardPercentage.sendKeys("65");
            EngagementsCreationRepo.rebateTable.click();

            EngagementsCreationRepo.selectHoldPercenatageTable.get(1).click();

            EngagementsCreationRepo.awardTypeRebate.click();
            EngagementsCreationRepo.selectAwardTypeRebate.get(1).click();
            EngagementsCreationRepo.deliveryMode.get(2).click();

            sleep(1000);
            clickSetEngagementButton();
            toastMessage();
            sleep(3000);

    }

    public void tablesRebatePercentageAward(){

            engagementName = engagements.getText();
            System.out.println("Engagement node: " + engagementName);
            //sleep(2000);
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
            sleep(100);
            limit("98", "86");
            enterEngagementName();
            EngagementsCreationRepo.deliveryProbability.sendKeys("15");
            EngagementsCreationRepo.awardPercentage.sendKeys("65");
            EngagementsCreationRepo.rebateTypeCoinIn.click();
            EngagementsCreationRepo.rebatePercentage.sendKeys("71");
            EngagementsCreationRepo.awardTypeRebate.click();
            EngagementsCreationRepo.selectAwardTypeRebate.get(1).click();
            EngagementsCreationRepo.deliveryMode.get(2).click();

            sleep(1000);
            clickSetEngagementButton();
            toastMessage();
            sleep(3000);
    }
    public void distrubutePasses(){

            engagementName = engagements.getText();
            System.out.println("Engagement node: " + engagementName);
            //sleep(2000);
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
            sleep(100);
            limit("98", "86");
            enterEngagementName();
            EngagementsCreationRepo.iosPassOfferURL.sendKeys("www.gmail.com");
            EngagementsCreationRepo.androidPassOfferURL.sendKeys("www.android.com");

            sleep(1000);
            clickSetEngagementButton();
            toastMessage();
        }

    public void astorTestEngagement(){
            engagementName = engagements.getText();
            System.out.println("Engagement node: " + engagementName);
            //sleep(2000);
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            System.out.println("Engagement Title: " + EngagementsCreationRepo.engagementTitle.getText());
            sleep(100);
            limit("98", "86");
            enterEngagementName();
            EngagementsCreationRepo.minValue.sendKeys("10");
            EngagementsCreationRepo.maxValue.sendKeys("20");
            EngagementsCreationRepo.minRangeValue.sendKeys("15");
            EngagementsCreationRepo.maxRangeValue.sendKeys("15");
            EngagementsCreationRepo.rangeValue.sendKeys("12");

            sleep(1000);
            clickSetEngagementButton();
            toastMessage();
        }



}
