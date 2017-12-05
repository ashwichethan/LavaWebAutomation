package com.lava.modaldialog;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by codecraft on 25/11/16.
 */
public class ModalDialogObjectRepo extends ObjectsBase {

    //Drop downs
    @FindBy(xpath = "//div[@class='modal-body']/descendant::div[contains(@class,'field-dropDown')]")
    public static List<WebElement> pickDropDownValues;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::div[contains(@class,'field-dropDown')]")
    public static List<WebElement> dropDown;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::li[contains(@class,'option')]")
    public static List<WebElement> listOfDropDownValues;
    //Check Box
    @FindBy(xpath = "//div[@class='modal-body']/descendant::div[contains(@class,'field-checkBoxList')]")
    public static WebElement checkBox;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::div[contains(@class,'input-checkbox')]/descendant::label")
    public static List<WebElement> checkBoxListValues;
    //Text fields
    @FindBy(xpath = "//div[@class='modal-body']/descendant::input[contains(@class,'input-textbox')]")
    public static List<WebElement> alltextFields;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::input[contains(@placeholder,'Enter content path')]")
    public static WebElement personalizedContentTextFields;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::input")
    public static WebElement individualtextField;
    @FindBy(xpath = "//div[@class='modal-body']")
    public static WebElement dialogBody;
    //Radio button
    @FindBy(xpath = "//div[@class='modal-body']/descendant::div[contains(@class,'field-radioButtons')]/descendant::div[contains(@class,'input-radio')]/descendant::label")
    public static List<WebElement> radioButtons;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::div[contains(@class,'field-radioButtons')]/descendant::div[contains(@class,'input-radio')]")
    public static WebElement radioButton;
    @FindBy(xpath = "//div[@class='modal-content']")
    protected static WebElement modalDialog;

    @FindBy(xpath = "//div[@id='dynamic-modal2']/descendant::div[@class=\"modal-dialog\"]")
    protected static WebElement modalDialogofExternallist;
    @FindBy(xpath = "//div[@class='modal-header']")
    protected static WebElement popUp;
    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    protected static WebElement yesButton;
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    protected static WebElement cancelButton;
    @FindBy(xpath = "//div[@class='modal-header']/descendant::h4[contains(@class,'modal-title ng-binding')]")
    protected static WebElement modalTitle;
    //All types of Dialogs
    //Xpath of Dynamic modal
    @FindBy(xpath = "//div[@id='dynamic-modal']/descendant::div[@class='modal-dialog']")
    protected static WebElement dynamicModalDialog;
    //Xpath of schedule-modal
    @FindBy(xpath = "//div[@id='schedule-modal']/descendant::div[@class='modal-dialog']")
    protected static WebElement scheduleModalDialog;
    //Xpath of group modal
    @FindBy(xpath = "//div[@id='group-modal']/descendant::div[@class='modal-dialog']")
    protected static WebElement groupModalDialog;
    //Xpath of Dynamic Profile modal
    @FindBy(xpath = "//div[@id='dynamic-profile-modal2']/descendant::div[@class='modal-dialog']")
    protected static WebElement dynamicProfileModalTwoDialog;

    public ModalDialogObjectRepo(RemoteWebDriver driver) {
        super(driver);
    }


}
