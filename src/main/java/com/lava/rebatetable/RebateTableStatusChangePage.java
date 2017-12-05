package com.lava.rebatetable;

import com.lava.Pages;
import com.lava.engagementbuilderpage.EngagementsCreationPage;
import com.lava.utils.Base;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

import java.util.List;


/**
 * Created by jenkins on 11/07/17.
 */
public class RebateTableStatusChangePage extends Base {
    RebateTableStatusChangeRepo rTsC;
    public RebateTableStatusChangePage(){rTsC = new RebateTableStatusChangeRepo(driver);}
    CreateRebatePage cRp = new CreateRebatePage();

    static String e = RandomStringUtils.randomAlphanumeric(12).toLowerCase();
    static String rebateEng = "Automation_"+e;
    static String getEngName= rebateEng;


    static String s = RandomStringUtils.randomAlphanumeric(12).toLowerCase();
    static String rebateName = "Automation_"+s;
    static String getRebateName= rebateName;


    public boolean status(){
        refreshPage();
        if(isElementVisible(rTsC.spinnerOverlay)==true){
            waitForElementToBeInvisible(rTsC.spinnerOverlay);
        }

       cRp.navigateToRebateTable();
       cRp.createRebateTables();
       rTsC.tableNamesInList.get(0).click();
       return (isElementVisible(rTsC.statusUnused));
    }

    public boolean nameChange(){
        cRp.navigateToRebateTable();
        rTsC.tableNamesInList.get(0).click();
        rTsC.editBtn.click();
        waitUntilElementIsVisible(rTsC.modalDialog);
        rTsC.tableName.clear();

       rTsC.tableName.sendKeys(getRebateName);
        rTsC.saveBtn.click();
        toastMessage();
        return true;
    }

    public void toastMessage() {
        waitUntilElementIsVisible(rTsC.successToastMessage);
        String successMessage = rTsC.getSuccessToastMessage.getText();
        waitForElementToBeInvisible(rTsC.successToastMessage);
        System.out.println("Success toast message is: " + successMessage);
        System.out.println();
    }
    EngagementsCreationPage eCp = new EngagementsCreationPage();

    public  boolean createEngagementUsingRebateTable(){
       // System.out.println("rebate name2 is :" +getRebateName);
        eCp.goToEngagementPage();
        rTsC.rebateTableNode.click();
        Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
        sleep(100);
        eCp.limit("98", "86");
        rTsC.engagementName.sendKeys(getEngName);
        rTsC.rebateTableSelect.click();

        List<WebElement> tableNamesInDropdown = rTsC.rebateTableSelectFromDropdown;
        for(int index=0; index<tableNamesInDropdown.size();index++){
            WebElement nameIndex = tableNamesInDropdown.get(index);
            scrollToElement(nameIndex);
            String name = nameIndex.getText();

            if(name.equalsIgnoreCase(getRebateName)){
                nameIndex.click();
            }

        }
        sleep(1000);
        eCp.clickSetEngagementButton();
        toastMessage();
        return true;
    }




    public boolean tableStatusDraft(){
        cRp.navigateToRebateTable();
        List<WebElement> tableNames = rTsC.tableNamesInList;
        for(int index =0; index<tableNames.size();index++){
            WebElement table = tableNames.get(index);
            scrollToElement(table);
            String tName = table.getText();
            System.out.println(tName);
            if(tName.equalsIgnoreCase(getRebateName)){
                table.click();
                break;
            }
        }
        return (isElementVisible(rTsC.statusDraft));
    }

public boolean deleteRebateTableAndEngagement(){
    eCp.goToEngagementPage();
List<WebElement> engNames = rTsC.engNames;
for(int index=0; index<engNames.size(); index++){
    WebElement names = engNames.get(index);
    String enagagement = names.getText();
    if(enagagement.equalsIgnoreCase(getEngName)){
        names.click();
        rTsC.delete.click();
        waitUntilElementIsVisible(rTsC.deleteBtnInDialog);
        rTsC.deleteBtnInDialog.click();
        toastMessage();
        break;
    }
}
    cRp.navigateToRebateTable();
    List<WebElement> tableNames = rTsC.tableNamesInList;
    for(int index =0; index<tableNames.size();index++){
        WebElement table = tableNames.get(index);
        scrollToElement(table);
        String tName = table.getText();
        System.out.println(tName);
        if(tName.equalsIgnoreCase(getRebateName)){
            table.click();
            rTsC.deleteRebate.click();
            waitUntilElementIsVisible(rTsC.deleteBtnInRebateDialog);
            rTsC.deleteBtnInRebateDialog.click();
            toastMessage();
            break;
        }
    }

        return true;
}

}
