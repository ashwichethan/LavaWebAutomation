package com.lava.deletemomentspage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 20/03/17.
 */
public class DeleteMomentsRepo extends ObjectsBase{
    public DeleteMomentsRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> momentsList;


    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class=\"status-draft\"]")
    protected static WebElement momentDraftState;

    @FindBy(xpath = "//button[contains(.,'Delete')]")
    protected static WebElement deleteBtn;
    @FindBy(xpath = "//div[@class=\"modal-content\"]/descendant::button[contains(.,'Delete')]")
    protected static WebElement deleteBtnInDialog;
    @FindBy(xpath = "//div[@class='toast toast-success']/descendant::div[contains(.,'Success')]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;

    @FindBy(xpath = "//div[@class='moments-table sortable scrolling']/descendant::div[@class='scrolling-table ps-container ps-active-y']/descendant::table[@class='table-moments table-fixedheader table-scrollcontent ng-scope']/descendant::tr[@class='ng-scope']/descendant::td[@class='moment-status']/descendant::span[@class='status-submitted']")
    protected static WebElement momentsStatusSubmitted;

    @FindBy(xpath = "//div[@class='moments-table sortable scrolling']/descendant::div[@class='scrolling-table ps-container ps-active-y']/descendant::table[@class='table-moments table-fixedheader table-scrollcontent ng-scope']/descendant::tr[@class='ng-scope']/descendant::td[@class='moment-status']/descendant::span[@class='status-live']")
    protected static WebElement momentsStatusLive;

    @FindBy(xpath = "//div[@class='moments-table sortable scrolling']/descendant::div[@class='scrolling-table ps-container ps-active-y']/descendant::table[@class='table-moments table-fixedheader table-scrollcontent ng-scope']/descendant::tr[@class='ng-scope']/descendant::td[@class='moment-status']/descendant::span[@class='status-suspend']")
    protected static WebElement momentsStatusSuspend;

    @FindBy(xpath = "//div[@class='moments-table sortable scrolling']/descendant::div[@class='scrolling-table ps-container ps-active-y']/descendant::table[@class='table-moments table-fixedheader table-scrollcontent ng-scope']/descendant::tr[@class='ng-scope']/descendant::td[@class='moment-name reg ng-binding']")
    protected static List<WebElement> momentsName;

    @FindBy(xpath = ".//a[contains(.,'Design')]")
    protected static WebElement designTab;

    @FindBy(xpath = "//ul[@class=\"submenu show\"]/descendant::a[contains(.,'Moments')]")
    protected static WebElement momentsTab;

    @FindBy(xpath = "//div[@class=\"page-title\"]/descendant::h2[contains(.,'Moments')]")
    protected static WebElement momentsPageTitle;





}
