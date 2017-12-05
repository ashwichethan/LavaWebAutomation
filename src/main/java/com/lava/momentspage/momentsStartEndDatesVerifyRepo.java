package com.lava.momentspage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 01/06/17.
 */
public class momentsStartEndDatesVerifyRepo extends ObjectsBase {
    momentsStartEndDatesVerifyRepo(RemoteWebDriver driver){super(driver);}
    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> momentsList;
    @FindBy(xpath = "//div[@class=\"page-title\"]/descendant::h2[contains(.,'Moments')]")
    protected static WebElement momentsPageTitle;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::td[@class=\"moment-status\"]/span")
    protected static WebElement momentStatus;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::td[@class=\"moment-start ng-binding ng-scope\"]")
    protected static WebElement startDate;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::td[@class=\"moment-end ng-binding ng-scope\"]")
    protected static WebElement endDate;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::td[@class=\"moment-type ng-binding\"]")
    protected static WebElement triggerInMoment;
    @FindBy(xpath = "//a[contains(.,'Design')]")
    protected static WebElement designTab;
    @FindBy(xpath = "//ul[@class=\"submenu show\"]/descendant::a[contains(.,'Moments')]")
    protected static WebElement momentsTab;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//button[@class=\"moment-view-button ng-scope\"]")
    protected static WebElement viewBtn;
    @FindBy(xpath = "//span[@ng-bind=\"trigItem.trigger_name\"]")
    protected static WebElement triggerName;
    @FindBy(xpath = "//input[@placeholder=\"Start Date\"]")
    protected static WebElement startDateInMoment;
    @FindBy(xpath = "//input[@id='end-date']")
    protected static WebElement endDateInMoment;
    @FindBy(xpath = "//ol[@class=\"breadcrumb\"]/descendant::a[@href=\"#/moments\"]")
    protected static WebElement toMomentsList;

}
