package com.lava.rebatetable;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 02/06/17.
 */
public class DeleteRebateTablePage extends Base {
    DeleteRebateTableRepo dRTr;
    public DeleteRebateTablePage(){dRTr = new DeleteRebateTableRepo(driver);}
 CreateRebatePage cRp =new CreateRebatePage();

    public boolean deleteRebate(){
        refreshPage();
        if(isElementVisible(dRTr.spinnerOverlay)==true){
            waitForElementToBeInvisible(dRTr.spinnerOverlay);
        }

        cRp.navigateToRebateTable();
    int count =0;
        List<WebElement> rebateTables = DeleteRebateTableRepo.rebateTablesInList;
        for(int index =0; index<rebateTables.size(); index++ ) {
            WebElement rebate = rebateTables.get(index);
            scrollToElement(rebate);
            String rebateTableName = rebate.getText();
            if(rebateTableName.contains("Automation")){
                rebate.click();

               if(isElementVisible(DeleteRebateTableRepo.availableState)==true) {
                   clickDeleteButton();
                   ++count;
                   --index;
               }

            }
        }
        System.out.println("Total rebate table deleted "+count);
        return  (successmsg.contains("deleted"));
    }
    public boolean waitUntilDeleteModal() {
        waitUntilElementIsVisible(DeleteRebateTableRepo.deleteBtnInDialog);
        return true;
    }
    String successmsg;
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(DeleteRebateTableRepo.spinnerOverlay);
    }
    public void clickDeleteButton(){
        DeleteRebateTableRepo.deleteBtn.click();
        sleep(500);
       // waitUntilDeleteModal();
        scrollToElement(DeleteRebateTableRepo.deleteBtnInDialog);
      //  mouseHoverOnElement(DeleteRebateTableRepo.deleteBtnInDialog);
        DeleteRebateTableRepo.deleteBtnInDialog.click();
        sleep(2000);
        waitUntilElementIsVisible(DeleteRebateTableRepo.successToastMessage);
        successmsg = DeleteRebateTableRepo.getSuccessToastMessage.getText();
        System.out.println("Delete success toast message is : " + successmsg);
        waitForElementToBeInvisible(DeleteRebateTableRepo.successToastMessage);
    }

}
