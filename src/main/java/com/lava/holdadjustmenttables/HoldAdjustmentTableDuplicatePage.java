package com.lava.holdadjustmenttables;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 05/07/17.
 */
public class HoldAdjustmentTableDuplicatePage extends Base {
    HoldAdjustmentTableDuplicateRepo hAtR;
    public HoldAdjustmentTableDuplicatePage(){ hAtR = new HoldAdjustmentTableDuplicateRepo(driver);}

    HoldAdjustmentTableCreationPage hTc = new HoldAdjustmentTableCreationPage();


     public boolean duplicateTest(){
         refreshPage();
         if(isElementVisible(hAtR.spinnerOverlay)==true){
             waitForElementToBeInvisible(hAtR.spinnerOverlay);
         }

         hTc.navigateToHoldAdjustment();
         hTc.createTables();

         String tableName = HoldAdjustmentTableDuplicateRepo.tableNames.get(0).getText();
        HoldAdjustmentTableDuplicateRepo.tableNames.get(0).click();
        String newName = "Copy of "+tableName;
        waitUntilElementIsVisible(HoldAdjustmentTableDuplicateRepo.duplicateBtn);
        HoldAdjustmentTableDuplicateRepo.duplicateBtn.click();
        waitUntilElementIsVisible(HoldAdjustmentTableDuplicateRepo.getSuccessToastMessage);
         String successmsg = HoldAdjustmentTableDuplicateRepo.getSuccessToastMessage.getText();
         System.out.println("Duplicate success toast message is : " + successmsg);
        waitForElementToBeInvisible(HoldAdjustmentTableDuplicateRepo.getSuccessToastMessage);
         String tableNameDuplicate = HoldAdjustmentTableDuplicateRepo.tableNames.get(0).getText();
         return newName.equals(tableNameDuplicate);
     }
    public boolean addRowInEdit(){
        hTc.navigateToHoldAdjustment();
        hTc.createTables();
        HoldAdjustmentTableDuplicateRepo.tableNames.get(0).click();
        waitUntilElementIsVisible(HoldAdjustmentTableDuplicateRepo.editBtn);
        HoldAdjustmentTableDuplicateRepo.editBtn.click();
        waitUntilElementIsVisible(HoldAdjustmentTableDuplicateRepo.modalDialog);
        int initRows = HoldAdjustmentTableDuplicateRepo.noOfRows.size();
        List<WebElement> addRow = HoldAdjustmentTableDuplicateRepo.addBtn;
        for(int index =addRow.size()-1; index>=0; index-- ) {
            addRow.get(index).click();
            break;
        }
        int finalRows = HoldAdjustmentTableDuplicateRepo.noOfRows.size();
        if(finalRows==initRows+1){
       HoldAdjustmentTableDuplicateRepo.closeBtn.click();
        return true;
   }
        HoldAdjustmentTableDuplicateRepo.closeBtn.click();
         return false;
     }

    public boolean editTableError(){
    hTc.navigateToHoldAdjustment();
    hTc.createTables();
    HoldAdjustmentTableDuplicateRepo.tableNames.get(0).click();
    waitUntilElementIsVisible(HoldAdjustmentTableDuplicateRepo.editBtn);
    HoldAdjustmentTableDuplicateRepo.editBtn.click();
    waitUntilElementIsVisible(HoldAdjustmentTableDuplicateRepo.modalDialog);
    List<WebElement> addRow = HoldAdjustmentTableDuplicateRepo.addBtn;
    for(int index =addRow.size()-1; index>=0; index-- ) {
        addRow.get(index).click();
        break;
    }
    HoldAdjustmentTableDuplicateRepo.saveBtn.click();
    mouseHoverOnElement(HoldAdjustmentTableDuplicateRepo.erroricon);
    String error = HoldAdjustmentTableDuplicateRepo.errorMsg.getText();
    System.out.println("Error message: "+error);
    HoldAdjustmentTableDuplicateRepo.closeBtn.click();
        return true;
}
    public boolean editTableSuccess(){
        hTc.navigateToHoldAdjustment();
        hTc.createTables();
        HoldAdjustmentTableDuplicateRepo.tableNames.get(0).click();
        waitUntilElementIsVisible(HoldAdjustmentTableDuplicateRepo.editBtn);
        HoldAdjustmentTableDuplicateRepo.editBtn.click();
        waitUntilElementIsVisible(HoldAdjustmentTableDuplicateRepo.modalDialog);
        List<WebElement> addRow = HoldAdjustmentTableDuplicateRepo.addBtn;
        for(int index =addRow.size()-1; index>=0; index-- ) {
            addRow.get(index).click();
            sleep(2000);
            String s = HoldAdjustmentTableDuplicateRepo.maxAvg.get(index-1).getText();
            System.out.println("min "+s);
           // String min = hAtR.minAvg.get(index).getText();

            HoldAdjustmentTableDuplicateRepo.maxAvg.get(index).sendKeys(String.valueOf(s+1));
            break;
        }
        HoldAdjustmentTableDuplicateRepo.saveBtn.click();
        if(isElementVisible(HoldAdjustmentTableDuplicateRepo.closeBtn)){
            HoldAdjustmentTableDuplicateRepo.closeBtn.click();
        }
        else {
            waitUntilElementIsVisible(HoldAdjustmentTableDuplicateRepo.getSuccessToastMessage);
            String successmsg = HoldAdjustmentTableDuplicateRepo.getSuccessToastMessage.getText();
            System.out.println("Edited success toast message is : " + successmsg);
            waitForElementToBeInvisible(HoldAdjustmentTableDuplicateRepo.getSuccessToastMessage);
        }
        return true;
    }

}
