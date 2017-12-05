package com.lava.rebatetable;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 02/06/17.
 */
public class EditRebateTablePage extends Base {
   EditRebateTableRepo eRTr;
    public EditRebateTablePage(){eRTr = new EditRebateTableRepo(driver);}

    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(EditRebateTableRepo.spinnerOverlay);
    }

CreateRebatePage cRp = new CreateRebatePage();

    public boolean editRebateTable() {
        refreshPage();
        if(isElementVisible(eRTr.spinnerOverlay)==true){
            waitForElementToBeInvisible(eRTr.spinnerOverlay);
        }

        cRp.navigateToRebateTable();
        List<WebElement> rebateTables = EditRebateTableRepo.rebateTablesInList;
        for (int index = 0; index < rebateTables.size(); index++) {
            WebElement table = rebateTables.get(index);
            table.click();
            String rebateTableName = EditRebateTableRepo.tableName.getText();
            System.out.println("Rebate table name is " + rebateTableName);
        if(isElementVisible(EditRebateTableRepo.statusOfRebateTable)==true) {
            EditRebateTableRepo.editBtn.click();
            waitUntilElementIsVisible(EditRebateTableRepo.dialogModal);
            List<WebElement> addRowBtn = EditRebateTableRepo.addRowBtn;
            int length = addRowBtn.size();
            EditRebateTableRepo.addRowBtn.get(length - 1).click();

            EditRebateTableRepo.savebtn.click();
            waitUntilElementIsVisible(EditRebateTableRepo.successToastMessage);
            String successmsg = EditRebateTableRepo.getSuccessToastMessage.getText();
            System.out.println("Edit success toast message is : " + successmsg);
            waitForElementToBeInvisible(EditRebateTableRepo.successToastMessage);
            break;
        }

        }
        return true;
    }


}
