package com.lava.holdadjustmenttables;

import com.lava.Pages;
import com.lava.engagementbuilderpage.EngagementsCreationPage;
import com.lava.utils.Base;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 23/06/17.
 */
public class HoldAdjustmentTableInDraftPage extends Base {
    HoldAdjustmentTableInDraftRepo hAtD;
    public HoldAdjustmentTableInDraftPage(){hAtD= new HoldAdjustmentTableInDraftRepo(driver);}

    HoldAdjustmentTableCreationPage hTc = new HoldAdjustmentTableCreationPage();
    EngagementsCreationPage eCp = new EngagementsCreationPage();

    static String e = RandomStringUtils.randomAlphanumeric(12).toLowerCase();
    static String holdEng = "Automation_"+e;
    static String getEngName= holdEng;


    static String s = RandomStringUtils.randomAlphanumeric(12).toLowerCase();
    static String holdName = "Automation_"+s;
    static String getHoldName= holdName;

//This test case is to check for Hold adjustment table's change of status when used by engagements

    public boolean tableStatus(){
        refreshPage();
        if(isElementVisible(hAtD.spinnerOverlay)==true){
            waitForElementToBeInvisible(hAtD.spinnerOverlay);
        }

        hTc.navigateToHoldAdjustment();
        hTc.createTables();
        sleep(3000);
        hAtD.tableNamesInList.get(0).click();
        return (isElementVisible(HoldAdjustmentTableInDraftRepo.statusAvailable));
    }

public boolean namechange(){
    hTc.navigateToHoldAdjustment();
    hAtD.tableNamesInList.get(0).click();
    hAtD.editBtn.click();
    waitUntilElementIsVisible(hAtD.modalDialog);
    hAtD.tableName.clear();
    hAtD.tableName.sendKeys(getHoldName);
    hAtD.saveBtn.click();
    toastMessage();
    return true;
}
    public void toastMessage() {
    sleep(2000);
        waitUntilElementIsVisible(hAtD.successToastMessage);
        String successMessage = hAtD.getSuccessToastMessage.getText();
        waitForElementToBeInvisible(hAtD.successToastMessage);
        System.out.println("Success toast message is: " + successMessage);
        System.out.println();
    }



    public  boolean createEngagementUsingHoldTable(){
        eCp.goToEngagementPage();
        HoldAdjustmentTableInDraftRepo.gamingAwardPlayer.click();
        Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
        sleep(100);
        eCp.limit("98", "86");

        HoldAdjustmentTableInDraftRepo.engagementName.sendKeys(getEngName);
        HoldAdjustmentTableInDraftRepo.awardType.click();
        HoldAdjustmentTableInDraftRepo.selectAwardType.get(0).click();
        HoldAdjustmentTableInDraftRepo.awardValue.sendKeys("200");
        HoldAdjustmentTableInDraftRepo.holdAdjustmentTable.click();
        List<WebElement> tableNamesInDropdown = HoldAdjustmentTableInDraftRepo.tableNamesInDropdown;

        for(int index=0; index<tableNamesInDropdown.size();index++){
            WebElement nameIndex = tableNamesInDropdown.get(index);
            scrollToElement(nameIndex);
            String name = nameIndex.getText();
            if(name.equalsIgnoreCase(getHoldName)){
                nameIndex.click();
            }
        }
        sleep(1000);
        eCp.clickSetEngagementButton();
        toastMessage();
        return true;
    }
    public boolean tableStatusDraft(){
        hTc.navigateToHoldAdjustment();
        List<WebElement> tableNames = hAtD.tableNamesInList;
        for(int index =0; index<tableNames.size();index++){
            WebElement table = tableNames.get(index);
            scrollToElement(table);
            String tName = table.getText();
            if(tName.equalsIgnoreCase(getHoldName)){
                table.click();
                break;
            }
        }
        return (isElementVisible(HoldAdjustmentTableInDraftRepo.statusDraft));
    }

    public boolean deleteEngagementandHoldTable(){
        eCp.goToEngagementPage();
        List<WebElement> engNames = hAtD.engNames;
        for(int index=0; index<engNames.size(); index++){
            WebElement names = engNames.get(index);
            String enagagement = names.getText();
            if(enagagement.equalsIgnoreCase(getEngName)){
                names.click();
                hAtD.delete.click();
                waitUntilElementIsVisible(hAtD.deleteBtnInDialog);
                hAtD.deleteBtnInDialog.click();
                toastMessage();
                break;
            }
        }
        hTc.navigateToHoldAdjustment();
        List<WebElement> tableNames = hAtD.tableNamesInList;
        for(int index =0; index<tableNames.size();index++){
            WebElement table = tableNames.get(index);
            scrollToElement(table);
            String tName = table.getText();
            System.out.println(tName);
            if(tName.equalsIgnoreCase(getHoldName)){
                table.click();
                hAtD.deleteHold.click();
                waitUntilElementIsVisible(hAtD.deleteBtnInHoldDialog);
                hAtD.deleteBtnInHoldDialog.click();
                toastMessage();
                break;
            }
        }


        return true;
    }


}
