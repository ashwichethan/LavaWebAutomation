package com.lava.holdadjustmenttables;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 10/05/17.
 */
public class HoldAdjustmentTableCreationRepo extends ObjectsBase {
    public HoldAdjustmentTableCreationRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//a[contains(.,'Resources')]")
    protected static WebElement resourceTab;

    @FindBy(xpath = "//li[@class=\"hold-table\"]")
    protected static WebElement holdAdjustmentTables;

    @FindBy(xpath = "//h2[@class=\"hold-title\"]")
    protected static WebElement holdAdjustmentTableTitle;

    @FindBy(xpath = "//a[@ng-click=\"addTable();\"]")
    protected static WebElement createHoldAdjustmentTables;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;


    @FindBy(xpath = "//div[@id=\"addtable-modal\"]/descendant::div[@class='modal-content']")
    protected static WebElement modalDailog;

    @FindBy(xpath = "//input[@ng-model=\"table_name\"]")
    protected static WebElement tableName;

    @FindBy(xpath = "//input[@ng-model=\"row.awps_min\"]")
    protected static WebElement AWPSmin;


    @FindBy(xpath = "//input[@ng-model=\"row.awps_max\"]")
    protected static List<WebElement> AWPSmax;

    @FindBy(xpath = "//input[@ng-model=\"row.hold\"]")
    protected static WebElement holdPercentage;

    @FindBy(xpath = "//button[@ng-click=\"addRow(row,$index)\"]")
    protected static WebElement addNewRow;

    @FindBy(xpath = "//button[@ng-click=\"saveTable(idSelectedRow)\"]")
    protected static WebElement addButtonToCreateTable;
    @FindBy(xpath = "//div[@class='toast toast-success']/descendant::div[contains(.,'Success')]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;


}
