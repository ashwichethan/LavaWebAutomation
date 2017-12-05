package com.lava.holdadjustmenttables;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 06/07/17.
 */
public class HoldAdjustmentTableViewRepo extends ObjectsBase {
    public HoldAdjustmentTableViewRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//a[@class=\"button create-button\"]")
    protected static WebElement createNewBtn;
    @FindBy(xpath = "//input[@ng-model=\"table_name\"]")
    protected static WebElement EnterTableName;

    @FindBy(xpath = "//input[@ng-model=\"row.awps_min\"]")
    protected static WebElement minValue;

    @FindBy(xpath = "//input[@ng-model=\"row.awps_max\"]")
    protected static List<WebElement> maxValue;

    @FindBy(xpath = "//input[@ng-model=\"row.hold\"]")
    protected static List<WebElement> holdPercentage;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;
    @FindBy(xpath = "//button[@class=\"btn-add-row\"]")
    protected static List<WebElement> addrow;

    @FindBy(xpath = "//button[@id='btn_Offers']")
    protected static WebElement saveBtn;

    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> tableNames;

    @FindBy(xpath = "//button[@class=\"moment-view-button ng-scope\"]")
    protected static WebElement viewBtn;

    @FindBy(xpath = "//div[@id=\"viewtable-modal\"]/descendant::div[@class=\"modal-content\"]")
    protected static WebElement viewModalDialog;

    @FindBy(xpath = "//div[@id=\"viewtable-modal\"]/descendant::h4[@class=\"modal-title ng-binding\"]")
    protected static WebElement tabelNameInView;

    @FindBy(xpath = "//div[@id='viewtable-modal']/descendant::button[@class=\"close\"]")
    protected static WebElement closeBtn;

    @FindBy(xpath = "//span[@class=\"ng-binding\"]")
    protected static List<WebElement> values;



}
