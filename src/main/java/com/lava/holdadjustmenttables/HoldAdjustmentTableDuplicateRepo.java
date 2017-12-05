package com.lava.holdadjustmenttables;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 05/07/17.
 */
public class HoldAdjustmentTableDuplicateRepo extends ObjectsBase{
    public HoldAdjustmentTableDuplicateRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> tableNames;

    @FindBy(xpath = "//button[@class=\"moment-duplicate-button ng-scope\"]")
    protected static WebElement duplicateBtn;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;

    @FindBy(xpath = "//button[@class=\"moment-edit-button ng-scope\"]")
    protected static WebElement editBtn;

    @FindBy(xpath = "//div[@id=\"addtable-modal\"]/descendant::div[@class=\"modal-content\"]")
    protected static WebElement modalDialog;

    @FindBy(xpath = "//div[@id=\"addtable-modal\"]/descendant::div[@class=\"field-row ng-scope\"]")
    protected static List<WebElement> noOfRows;

    @FindBy(xpath = "//button[@class=\"btn-add-row\"]")
    protected static List<WebElement> addBtn;

    @FindBy(xpath = "//button[@id='btn_Offers']")
    protected static WebElement saveBtn;

    @FindBy(xpath = "//div[@id=\"addtable-modal\"]/descendant::button[@class=\"close\"]")
    protected static WebElement closeBtn;

    @FindBy(xpath = "//i[@class=\"field-error-icon ng-scope\"]")
    protected static WebElement erroricon;

    @FindBy(xpath = "//div[@class=\"field-col hold-error-message\"]/span")
    protected static WebElement errorMsg;

    @FindBy(xpath = "//div[@class=\"field-col field-textBox\"]/descendant::input[@ng-model=\"row.awps_min\"]")
    protected static List<WebElement> minAvg;
    @FindBy(xpath = "//div[@class=\"field-col field-textBox\"]/descendant::input[@ng-model=\"row.awps_max\"]")
    protected static List<WebElement> maxAvg;

}
