package com.lava.holdadjustmenttables;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 02/06/17.
 */
public class DeleteHoldAdjustmentTableRepo  extends ObjectsBase{
    public DeleteHoldAdjustmentTableRepo(RemoteWebDriver driver){super (driver);}
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class=\"status-unused\"]")
    protected static WebElement availableState;
    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> HoldAdjustTablesInList;
    @FindBy(xpath = "//button[contains(.,'Delete')]")
    protected static WebElement deleteBtn;
    @FindBy(xpath = "//div[@class=\"modal-content\"]/descendant::button[contains(.,'Yes')]")
    protected static WebElement deleteBtnInDialog;
    @FindBy(xpath = "//div[@class='toast toast-success']/descendant::div[contains(.,'Success')]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//a[contains(.,'Resources')]")
    protected static WebElement resourceTab;
    @FindBy(xpath = "//li[@class=\"hold-table\"]")
    protected static WebElement holdAdjustmentTables;
    @FindBy(xpath = "//h3[contains(.,'Alert')]")
    protected static WebElement alertTitle;
    @FindBy(xpath = "//div[@class=\"modal fade ng-scope ng-isolate-scope in\"]/descendant::div[@class=\"modal-content\"]")
    protected static WebElement modalDialog;

}
