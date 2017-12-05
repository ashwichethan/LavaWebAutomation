package com.lava.holdadjustmenttables;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 02/06/17.
 */
public class DeleteHoldAdjustmentTablePage extends Base {
    DeleteHoldAdjustmentTableRepo dHDt;
    public DeleteHoldAdjustmentTablePage(){ dHDt = new DeleteHoldAdjustmentTableRepo(driver);}



    HoldAdjustmentTableCreationPage cHat = new HoldAdjustmentTableCreationPage();
    public boolean deleteTables(){
        refreshPage();
        if(isElementVisible(dHDt.spinnerOverlay)==true){
            waitForElementToBeInvisible(dHDt.spinnerOverlay);
        }

       cHat.navigateToHoldAdjustment();
        delete();
        return true;
    }

    public void delete(){
        int count =0;
        List<WebElement> HoldAdjustTablesInList = DeleteHoldAdjustmentTableRepo.HoldAdjustTablesInList;
        for(int index =0; index<HoldAdjustTablesInList.size(); index++ ) {
            WebElement holdAdjust = HoldAdjustTablesInList.get(index);
            String TableName = holdAdjust.getText();
            scrollToElement(holdAdjust);
            if(TableName.contains("Automation")||TableName.contains("Test status of table")){
                holdAdjust.click();
                sleep(1000);
                if(isElementVisible(DeleteHoldAdjustmentTableRepo.availableState)==true) {
                    clickDeleteButton();
                    ++count;
                    --index;
                }


            }


        }

        System.out.println("Total hold adjustment table deleted "+count);
    }
    public boolean waitUntilDeleteModal() {
        waitUntilElementIsVisible(DeleteHoldAdjustmentTableRepo.deleteBtnInDialog);
        return true;
    }

    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(DeleteHoldAdjustmentTableRepo.spinnerOverlay);
    }
    public void clickDeleteButton(){
        DeleteHoldAdjustmentTableRepo.deleteBtn.click();
        waitUntilDeleteModal();
        if(isElementVisible(DeleteHoldAdjustmentTableRepo.modalDialog)) {
            scrollToElement(DeleteHoldAdjustmentTableRepo.modalDialog);
            mouseHoverOnElement(DeleteHoldAdjustmentTableRepo.modalDialog);
            DeleteHoldAdjustmentTableRepo.modalDialog.click();
        }
        scrollToElement(DeleteHoldAdjustmentTableRepo.deleteBtnInDialog);
        mouseHoverOnElement(DeleteHoldAdjustmentTableRepo.deleteBtnInDialog);
        DeleteHoldAdjustmentTableRepo.deleteBtnInDialog.click();
        sleep(2000);
        waitUntilElementIsVisible(DeleteHoldAdjustmentTableRepo.successToastMessage);
        String successmsg = DeleteHoldAdjustmentTableRepo.getSuccessToastMessage.getText();
        System.out.println("Delete success toast message is : " + successmsg);
        waitForElementToBeInvisible(DeleteHoldAdjustmentTableRepo.getSuccessToastMessage);
    }


}
