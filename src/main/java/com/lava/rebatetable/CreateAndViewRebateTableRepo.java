package com.lava.rebatetable;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 02/06/17.
 */
public class CreateAndViewRebateTableRepo extends ObjectsBase {
    public CreateAndViewRebateTableRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//tr[@class=\"ng-scope\"]")
    protected static List<WebElement> rebateTablesInList;
    @FindBy(xpath = "//div[@id=\"viewtable-modal\"]/descendant::h4[@id=\"myModalLabel\"]")
    protected static WebElement tableNameInView;
    @FindBy(xpath = "//div[@id=\"viewtable-modal\"]/descendant::span[@class=\"ng-binding\"]")
    protected static List<WebElement> rebateTableValues;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::td[@class=\"moment-name ng-binding\"]")
    protected static WebElement tableName;
    @FindBy(xpath = "//button[@class=\"moment-view-button ng-scope\"]")
    protected static WebElement viewBtn;
    @FindBy(xpath = "//div[@id='viewtable-modal']/descendant::div[@class=\"modal-content\"]")
    protected static WebElement viewModal;
    @FindBy(xpath = "//div[@id='viewtable-modal']/descendant::button[@class=\"close\"]")
    protected static WebElement closeBtn;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//a[contains(.,'Resources')]")
    protected static WebElement resourceTab;
    @FindBy(xpath = "//a[@href=\"#/rebate-settings\"]")
    protected static WebElement rebateTableTab;


}
