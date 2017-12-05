package com.lava.holdadjustmenttables;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 06/07/17.
 */
public class HoldAdjustmentTableViewPage extends Base {
    HoldAdjustmentTableViewRepo hAtR ;
    public HoldAdjustmentTableViewPage(){hAtR = new HoldAdjustmentTableViewRepo(driver);}
    HoldAdjustmentTableCreationPage hAtC = new HoldAdjustmentTableCreationPage();
    String Name;
    public void viewTable(){
        hAtC.navigateToHoldAdjustment();
        sleep(2000);
        HoldAdjustmentTableViewRepo.createNewBtn.click();
        Name = generateRandomName();
        HoldAdjustmentTableViewRepo.EnterTableName.sendKeys(Name);
        HoldAdjustmentTableViewRepo.minValue.sendKeys("10");
        HoldAdjustmentTableViewRepo.maxValue.get(0).sendKeys("20");
        HoldAdjustmentTableViewRepo.holdPercentage.get(0).sendKeys("50");
        HoldAdjustmentTableViewRepo.addrow.get(0).click();
        HoldAdjustmentTableViewRepo.maxValue.get(1).sendKeys("30");
        HoldAdjustmentTableViewRepo.holdPercentage.get(1).sendKeys("40");
        HoldAdjustmentTableViewRepo.saveBtn.click();

        waitUntilElementIsVisible(HoldAdjustmentTableViewRepo.getSuccessToastMessage);
        String successmsg = HoldAdjustmentTableViewRepo.getSuccessToastMessage.getText();
        System.out.println("Create success toast message is : " + successmsg);
        waitForElementToBeInvisible(HoldAdjustmentTableViewRepo.getSuccessToastMessage);
        HoldAdjustmentTableViewRepo.tableNames.get(0).click();
        waitUntilElementIsVisible(HoldAdjustmentTableViewRepo.viewBtn);
        HoldAdjustmentTableViewRepo.viewBtn.click();
        waitUntilElementIsVisible(HoldAdjustmentTableViewRepo.viewModalDialog);

    }

    public boolean tableName(){
           viewTable();
           String name = HoldAdjustmentTableViewRepo.tabelNameInView.getText();
           hAtR.closeBtn.click();
           return name.equals(Name);
    }

    public boolean values(){
        viewTable();
    List<WebElement> values = HoldAdjustmentTableViewRepo.values;
    for(int i =0; i<values.size(); i++){
        WebElement in = values.get(i);
        String s = in.getText();
        System.out.println("Values "+s);
    }

        return values.get(0).equals(10) && values.get(1).equals(20) && values.get(3).equals(50) && values.get(5).equals(30) && values.get(6).equals(40);
    }

}
