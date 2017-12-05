package com.lava.rebatetable;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 11/07/17.
 */
public class RebateTableStatusChangeRepo extends ObjectsBase{

    public RebateTableStatusChangeRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> tableNamesInList;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;

    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class=\"status-unused\"]")
    protected static WebElement statusUnused;
    @FindBy(xpath = "//button[@class=\"moment-edit-button ng-scope\"]")
    protected static WebElement editBtn;
    @FindBy(xpath = "//div[@id=\"addtable-modal\"]/descendant::div[@class=\"modal-content\"]")
    protected static WebElement modalDialog;
    @FindBy(xpath = "//input[@ng-model=\"table_name\"]")
    protected static WebElement tableName;
    @FindBy(xpath = "//button[@class=\"set-button\"]")
    protected static WebElement saveBtn;
    @FindBy(xpath = "//div[@class='toast toast-success']/descendant::div[contains(.,'Success')]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class=\"status-in-draft\"]")
    protected static WebElement statusDraft;
    @FindBy(xpath = "//span[contains(.,'Rebate Table Award')]")
    protected static WebElement rebateTableNode;
    @FindBy(xpath = "//input[@placeholder=\"Enter engagement name\"]")
    protected static WebElement engagementName;
    @FindBy(xpath = "//div[@class=\"nice-select drop-select rebate_table_id-disable\"]")
    protected static WebElement rebateTableSelect;
    @FindBy(xpath = "//div[@class=\"nice-select drop-select rebate_table_id-disable open\"]/descendant::li[@class=\"option\"]")
    protected static List<WebElement> rebateTableSelectFromDropdown;
    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> engNames;
    @FindBy(xpath = "//button[@class=\"moment-delete-button\"]")
    protected static WebElement delete;
    @FindBy(xpath = "//div[@class=\"modal-content\"]/descendant::button[contains(.,'Delete')]")
    protected static WebElement deleteBtnInDialog;
    @FindBy(xpath = "//button[@class=\"moment-delete-button ng-scope\"]")
    protected static WebElement deleteRebate;
    @FindBy(xpath = "//div[@class=\"modal-content\"]/descendant::button[contains(.,'Yes')]")
    protected static WebElement deleteBtnInRebateDialog;

}
