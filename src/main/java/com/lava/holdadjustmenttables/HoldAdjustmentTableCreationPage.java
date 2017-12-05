package com.lava.holdadjustmenttables;

import com.lava.utils.Base;

/**
 * Created by jenkins on 10/05/17.
 */
public class HoldAdjustmentTableCreationPage extends Base {

    HoldAdjustmentTableCreationRepo HatC;
    public HoldAdjustmentTableCreationPage(){HatC = new HoldAdjustmentTableCreationRepo(driver);}
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(HoldAdjustmentTableCreationRepo.spinnerOverlay);
    }
    public void waitForModalToBeVisible() {
        waitUntilElementIsVisible(HoldAdjustmentTableCreationRepo.modalDailog);
    }


    public void navigateToHoldAdjustment(){
        if(isElementVisible(HoldAdjustmentTableCreationRepo.holdAdjustmentTableTitle)==false) {
            waitUntilElementIsVisible(HoldAdjustmentTableCreationRepo.resourceTab);
            HoldAdjustmentTableCreationRepo.resourceTab.click();
            sleep(1000);
            HoldAdjustmentTableCreationRepo.holdAdjustmentTables.click();
            waitForSpinnerToBeInVisible();

        }


    }

    public boolean holdAdjustmentCreate(){
        refreshPage();
        if(isElementVisible(HatC.spinnerOverlay)==true){
            waitForElementToBeInvisible(HatC.spinnerOverlay);
        }

        navigateToHoldAdjustment();
        for(int j=1;j<5;j++) {
            createTables();
        }
        return true;
    }


    public void createTables() {
            scrollToElement(HoldAdjustmentTableCreationRepo.createHoldAdjustmentTables);
            HoldAdjustmentTableCreationRepo.createHoldAdjustmentTables.click();
            waitForModalToBeVisible();

           HoldAdjustmentTableCreationRepo.tableName.sendKeys(generateRandomName());
            HoldAdjustmentTableCreationRepo.AWPSmin.sendKeys("0.0");
            HoldAdjustmentTableCreationRepo.AWPSmax.get(0).sendKeys("3");
            HoldAdjustmentTableCreationRepo.holdPercentage.sendKeys("10");

            HoldAdjustmentTableCreationRepo.addNewRow.click();
            HoldAdjustmentTableCreationRepo.AWPSmax.get(1).sendKeys("4");
            HoldAdjustmentTableCreationRepo.addButtonToCreateTable.click();
            sleep(2000);
            waitUntilElementIsVisible(HatC.successToastMessage);
            String successmsg = HatC.getSuccessToastMessage.getText();
            System.out.println("Create success toast message is : " + successmsg);
            waitForElementToBeInvisible(HatC.getSuccessToastMessage);

    }

}
