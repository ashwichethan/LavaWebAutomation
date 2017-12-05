package com.lava.rebatetable;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 29/05/17.
 */
public class CreateRebateRepo  extends ObjectsBase{
    public CreateRebateRepo(RemoteWebDriver driver){super(driver);}
    @FindBy(xpath = "//a[contains(.,'Resources')]")
    protected static WebElement resourceTab;

    @FindBy(xpath = "//div[@class=\"page-title\"]/descendant::h2[contains(.,'Rebate Tables')]")
    protected static WebElement rebateTablePageTitle;
    @FindBy(xpath = "//a[@href=\"#/rebate-settings\"]")
    protected static WebElement rebateTableTab;

    @FindBy(xpath = "//a[@class=\"button create-button\"]")
    protected static WebElement createRabateTable;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//div[@id=\"addtable-modal\"]/descendant::div[@class='modal-content']")
    protected static WebElement modalDailog;
    @FindBy(xpath = "//input[@ng-model=\"table_name\"]")
    protected static WebElement tableName;
    @FindBy(xpath = "//input[@ng-model=\"row.denomination\"]")
    protected static List<WebElement> rebateDenomination;
    @FindBy(xpath = "//input[@ng-model=\"row.rebate\"]")
    protected static List<WebElement> rebatePercentage;
    @FindBy(xpath = "//button[@class=\"btn-add-row\"]")
    protected static List<WebElement> addRow;
    @FindBy(xpath = "//button[@class=\"btn-remove-row ng-scope\"]")
    protected static List<WebElement> removeRow;
    @FindBy(xpath = "//button[@class=\"set-button\"]")
    protected static WebElement saveBtm;
    @FindBy(xpath = "//button[@class=\"cancel-set-button\"]")
    protected static WebElement cancelBtm;

    @FindBy(xpath = "//div[@class=\"toast-message\"]")
    protected static WebElement toastMsg;

    @FindBy(xpath = "//div[@class='toast toast-success']/descendant::div[contains(.,'Success')]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;

}
