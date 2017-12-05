package com.lava.rebatetable;

import com.lava.utils.Base;

/**
 * Created by jenkins on 29/05/17.
 */
public class CreateRebatePage extends Base{
    CreateRebateRepo CrBr;
    public CreateRebatePage(){ CrBr= new CreateRebateRepo(driver);}
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(CreateRebateRepo.spinnerOverlay);
    }


    public void navigateToRebateTable(){
       if(isElementVisible(CreateRebateRepo.rebateTablePageTitle)==false) {
           CreateRebateRepo.resourceTab.click();
           sleep(1000);
           CreateRebateRepo.rebateTableTab.click();
           sleep(3000);
           waitForSpinnerToBeInVisible();

       }

    }

    public boolean rebateTableCreate(){
        refreshPage();
        if(isElementVisible(CrBr.spinnerOverlay)==true){
            waitForElementToBeInvisible(CrBr.spinnerOverlay);
        }

        navigateToRebateTable();
        for(int j=1;j<5;j++) {
            createRebateTables();
        }
        return (successmsg.contains("created"));
    }
    String successmsg;
    public void createRebateTables() {

        CreateRebateRepo.createRabateTable.click();
        waitUntilElementIsVisible(CreateRebateRepo.modalDailog);
        CreateRebateRepo.tableName.sendKeys(generateRandomName());
        CreateRebateRepo.rebateDenomination.get(0).sendKeys("10");
        System.out.println("Rebate denomination 1st value is 10");
        CreateRebateRepo.rebatePercentage.get(0).sendKeys("12");
        System.out.println("Rebate percentage 1st value is 12");
        CreateRebateRepo.addRow.get(0).click();
        CreateRebateRepo.rebateDenomination.get(1).sendKeys("30");
        System.out.println("Rebate denomination 2nd value is 30");
        CreateRebateRepo.rebatePercentage.get(1).sendKeys("12");
        System.out.println("Rebate percentage 2nd value is 12");
        CreateRebateRepo.saveBtm.click();
        waitUntilElementIsVisible(CreateRebateRepo.successToastMessage);
        successmsg = CreateRebateRepo.getSuccessToastMessage.getText();
        System.out.println("Success toast message is : " + successmsg+"\n");
        waitForElementToBeInvisible(CreateRebateRepo.successToastMessage);




    }




}
