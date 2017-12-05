package com.lava.rebatetable;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 02/06/17.
 */
public class EditRebateTableRepo extends ObjectsBase {
    public EditRebateTableRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//tr[@class=\"ng-scope\"]")
    protected static List<WebElement> rebateTablesInList;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class=\"status-unused\"]")
    protected static WebElement statusOfRebateTable;
    @FindBy(xpath = "//button[@class=\"moment-edit-button ng-scope\"]")
    protected static WebElement editBtn;
    @FindBy(xpath = "//div[@id=\"addtable-modal\"]/descendant::div[@class=\"modal-content\"]")
    protected static WebElement dialogModal;
    @FindBy(xpath = "//button[@class=\"btn-add-row\"]")
    protected static List<WebElement> addRowBtn;
    @FindBy(xpath = "//button[@class=\"set-button\"]")
    protected static WebElement savebtn;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::td[@class=\"moment-name ng-binding\"]")
    protected static WebElement tableName;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//a[contains(.,'Resources')]")
    protected static WebElement resourceTab;
    @FindBy(xpath = "//a[@href=\"#/rebate-settings\"]")
    protected static WebElement rebateTableTab;
    @FindBy(xpath = "//div[@class='toast toast-success']/descendant::div[contains(.,'Success')]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;

}
