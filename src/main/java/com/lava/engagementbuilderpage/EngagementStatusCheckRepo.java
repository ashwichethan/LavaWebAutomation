package com.lava.engagementbuilderpage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 01/08/17.
 */
public class EngagementStatusCheckRepo extends ObjectsBase {

    public EngagementStatusCheckRepo(RemoteWebDriver driver){super(driver);}


    @FindBy(xpath = "//td[contains(.,'test qa 2123')]")
    protected static WebElement profileNameTab;
    @FindBy(xpath = "//div[@class='page dashboard segments-page ng-scope']")
    protected static WebElement profilesPage;
    @FindBy(xpath = "//button[contains(.,'Set Profile')]")
    protected static WebElement setProfile;
    @FindBy(xpath = "//div[@class='toast toast-warning']/descendant::div[contains(.,'Warning')]")
    protected static WebElement warningToastMessage;
    @FindBy(xpath = "//div[@class=\"toast toast-warning\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getWarningToastMessage;
    @FindBy(xpath = "//div[@class='toast toast-success']/descendant::div[contains(.,'Success')]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;
    @FindBy(xpath = "//div[@id=\"dynamic-modal2\"]//descendant::button[@class=\"close\"]")
    protected static WebElement closeButtonofExternallist;
    @FindBy(xpath = "//input[@placeholder=\"Enter profile name\"]")
    protected static WebElement profileName;
    @FindBy(xpath = "//div[@class=\"nice-select drop-select ng-pristine ng-untouched ng-valid ng-scope ng-isolate-scope ng-empty\"]")
    protected static WebElement DropdownBox;
    @FindBy(xpath = "//ul[@class=\"list\"]/descendant::li[@class=\"option\"]")
    protected static List<WebElement> selectFromDropdownBox;
    @FindBy(xpath = "//div[@class='segment-outer text-center ng-scope']/descendant::div[@class='item-holder ng-scope']")
    protected static List<WebElement> selectProfileNode;
    @FindBy(xpath = "//div[@class=\"segment-outer text-center ng-scope\"]")
    protected static WebElement isNodesVisibleProfile;
    @FindBy(xpath = "//div[@class='modal-footer']/descendant::button[contains(.,'Set Profile')]")
    protected static WebElement setProfileButton;
    @FindBy(xpath = "//div[@class='modal-content']/descendant::div[@class='dynamic-form']/descendant::div[@class='modal-footer']/descendant::button[contains(.,'Cancel')]")
    protected static WebElement cancelButton;
    @FindBy(xpath = "//a[contains(.,'Design')]")
    protected static WebElement designTab;
    @FindBy(xpath = "//ul[@class='submenu show']/descendant::li[@class='segments']/descendant::a[contains(.,'Profiles')]")
    protected static WebElement profilesTab;
    @FindBy(xpath = "//div[@class='segment-outer text-center ng-scope']/descendant::span[contains(.,'Ticket Holders')]")
    protected static WebElement ticketHolderNode;
    @FindBy(xpath = "//div[@id=\"dynamic-modal\"]/descendant::div[@class='modal-header']/descendant::button[@class='close']")
    protected static WebElement closeButton;
    @FindBy(xpath = "//div[@id=\"dynamic-modal2\"]/descendant::a[@ng-click=\"showme = !showme; showmemessages = false; showmeveryone = false; showuser = false;\"]")
    protected static List<WebElement> ticketMaster;
    @FindBy(xpath = "//div[@id=\"dynamic-modal2\"]/descendant::a[@ng-click=\"showmemessages = !showmemessages; showme = false; showmeveryone = false; showuser = false;\"]")
    protected static List<WebElement> ssb;
    @FindBy(xpath = "//div[@id=\"dynamic-modal2\"]/descendant::a[@ng-click=\"showuser = !showuser; showmemessages = false; showme = false; showmeveryone = false;\"]")
    protected static List<WebElement> lavaUserIDs;
    @FindBy(xpath = "//button[contains(.,'next')]")
    protected static List<WebElement> clickNextButton;
    @FindBy(xpath = "//td[@class=\"moment-name reg ng-binding\"]")
    protected static List<WebElement> nameofTheProfile;

    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class=\"status-available\"]")
    protected static WebElement statusOfSelectedprofile;

    @FindBy(xpath = "//button[contains(.,'Delete')]")
    protected static WebElement deleteBtn;
    @FindBy(xpath = "//div[@class=\"modal-content\"]/descendant::button[contains(.,'Delete')]")
    protected static WebElement deleteBtnInDialog;
    @FindBy(xpath = "//td[@class='moment-status']/descendant::span[contains(@class,'available')]")
    protected static List<WebElement> statusAvailable;
    @FindBy(xpath = "//div[@class=\"th moment-status\"]")
    protected static WebElement statusTab;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//div[@id='dynamic-modal2']/descendant::div[@class=\"modal-content\"]")
    protected static WebElement externalListModal;
    @FindBy(xpath = "//div[@id='dynamic-modal']/descendant::div[@class=\"modal-content\"]")
    protected static WebElement modalDialog;
    @FindBy(xpath = "//label[contains(.,'Player IDs')]")
    protected static WebElement playerIds;
    @FindBy(xpath = "//button[contains(.,'next')]")
    protected static WebElement nextBtn;
    @FindBy(xpath = "//input[@id='fileToUpload']")
    protected static WebElement fileUploadBtn;
    @FindBy(xpath = "//input[@name=\"title\"]")
    protected static WebElement enterName;
    @FindBy(xpath = "//button[contains(.,'SAVE')]")
    protected static WebElement saveBtn;

    @FindBy(xpath = "//input[@ng-model=\"actionName\"]")
    protected static WebElement enterEngName;

    @FindBy(xpath = "//div[@id=\"dynamic-modal\"]/descendant::div[@class=\"modal-content\"]")
    protected static WebElement modalDailog;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    protected static WebElement homeTab;
    @FindBy(xpath = "//ul[@class='submenu show']/descendant::a[contains(.,'Engagements')]")
    protected static WebElement engagementsTab;
    @FindBy(xpath = "//div[@class=\"engagement-outer text-center ng-scope\"]")
    protected static WebElement isNodesVisibleEngagement;
    @FindBy(xpath = "//div[@class='page dashboard engagements-page ng-scope']")
    protected static WebElement engagementsPage;
    @FindBy(xpath = "//ul[@class=\"submenu show\"]/descendant::a[contains(.,'Moments')]")
    protected static WebElement momentsTab;
    @FindBy(xpath = "//div[@class=\"moments-status\"]/descendant::a[contains(.,'Create new moment')]")
    protected static WebElement createMomentBtn;

    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class='status-in-draft']")
    protected static WebElement statusDraft;
    @FindBy(xpath = "//div[@ng-model=\"engagementItem\"]")
    protected static List<WebElement> engagementslist;

    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::td[@class=\"moment-status\"]/span")
    protected static WebElement statusofEng;
    @FindBy(xpath = "//tr[@class=\"ng-scope\"]")
    protected static List<WebElement> profiles;






}
