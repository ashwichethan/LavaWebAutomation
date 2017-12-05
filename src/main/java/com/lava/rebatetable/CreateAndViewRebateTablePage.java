package com.lava.rebatetable;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 02/06/17.
 */
public class CreateAndViewRebateTablePage extends Base {
    CreateAndViewRebateTableRepo cVRt;
    public CreateAndViewRebateTablePage(){cVRt = new CreateAndViewRebateTableRepo(driver);}

    CreateRebatePage createRebateTable = new CreateRebatePage();
    public void waitUntilModalDisplayed(){
    waitUntilElementIsVisible(CreateAndViewRebateTableRepo.viewModal);
    }
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(CreateAndViewRebateTableRepo.spinnerOverlay);
    }
CreateRebatePage cRp = new CreateRebatePage();

    public boolean CreateAndView(){
        refreshPage();
        if(isElementVisible(cVRt.spinnerOverlay)==true){
            waitForElementToBeInvisible(cVRt.spinnerOverlay);
        }

        cRp.navigateToRebateTable();
        createRebateTable.createRebateTables();

        List<WebElement> rebateTables = CreateAndViewRebateTableRepo.rebateTablesInList;
        for(int index =0; index<rebateTables.size(); index++) {
            WebElement table = rebateTables.get(index);
            table.click();
            String rebateTableName = CreateAndViewRebateTableRepo.tableName.getText();
            System.out.println("Rebate table name is " + rebateTableName);
            CreateAndViewRebateTableRepo.viewBtn.click();
            waitUntilModalDisplayed();
            String tablenameinmodal = CreateAndViewRebateTableRepo.tableNameInView.getText();
            System.out.println("Table name in view modal is  "+tablenameinmodal);

            List<WebElement> rebateTableValues = CreateAndViewRebateTableRepo.rebateTableValues;
            for(int value = 0; value<rebateTableValues.size(); value++)
            {
                WebElement rebatevalue = rebateTableValues.get(value);
                System.out.println("table values "+rebatevalue.getText());
            }

            CreateAndViewRebateTableRepo.closeBtn.click();
            break;
        }
        return true;
    }



}
