package com.lava.rebatetable;

import com.lava.utils.Base;

/**
 * Created by jenkins on 02/06/17.
 */
public class CreateCopyOfRebateTable extends Base {
    CreateCopyOfRebateTableRepo cCRt;
    public CreateCopyOfRebateTable(){cCRt = new CreateCopyOfRebateTableRepo(driver);}
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(CreateCopyOfRebateTableRepo.spinnerOverlay);}

    CreateRebatePage cRp = new CreateRebatePage();


    public boolean copyRebateTable(){
        refreshPage();
        if(isElementVisible(cCRt.spinnerOverlay)==true){
            waitForElementToBeInvisible(cCRt.spinnerOverlay);
        }

        cRp.navigateToRebateTable();
        cCRt.rebateTablesInList.get(0).click();
        String initRebateTableName =  CreateCopyOfRebateTableRepo.tableName.getText();
        CreateCopyOfRebateTableRepo.duplicateBtn.click();
        waitUntilElementIsVisible(cCRt.successToastMessage);
        String successmsg = cCRt.getSuccessToastMessage.getText();
        System.out.println("Duplicate toast message is : " + successmsg);
        waitForElementToBeInvisible(cCRt.successToastMessage);
        CreateCopyOfRebateTableRepo.rebateTablesInList.get(0).click();
        String copiedRebateTableName =  CreateCopyOfRebateTableRepo.tableName.getText();
        return copiedRebateTableName.equals("Copy of " + initRebateTableName);

    }










}
