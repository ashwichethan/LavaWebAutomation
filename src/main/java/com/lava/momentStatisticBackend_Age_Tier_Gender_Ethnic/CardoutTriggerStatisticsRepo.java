package com.lava.momentStatisticBackend_Age_Tier_Gender_Ethnic;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 21/06/17.
 */
public class CardoutTriggerStatisticsRepo extends ObjectsBase{
    public CardoutTriggerStatisticsRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> moments;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::td[@class=\"moment-type ng-binding\"]")
    protected static WebElement trigger;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class=\"status-live\"]")
    protected static WebElement statusLive;
    @FindBy(xpath = "//button[@class=\"moment-view-button ng-scope\"]")
    protected static WebElement viewBtn;
    @FindBy(xpath = "//button[@class=\"moment-suspend-button ng-scope\"]")
    protected static WebElement suspendBtn;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//label[contains(.,'BY AGE')]")
    protected static WebElement byAge;
    @FindBy(xpath = "//div[@class=\"performance-chart-value\"]")
    protected static WebElement value;
    @FindBy(xpath = "//label[contains(.,'BY GENDER')]")
    protected static WebElement byGender;
    @FindBy(xpath = ".//a[contains(.,'Design')]")
    protected static WebElement designTab;
    @FindBy(xpath = "//ul[@class=\"submenu show\"]/descendant::a[contains(.,'Moments')]")
    protected static WebElement momentsTab;
    @FindBy(xpath = "//label[contains(.,'BY HOME CITY')]")
    protected static WebElement byHomeCity;
    @FindBy(xpath = "//label[contains(.,'BY ETHNIC GROUP')]")
    protected static WebElement byEthnicGroup;
    @FindBy(xpath = "//label[contains(.,'BY HOME STATE')]")
    protected static WebElement byHomeState;
    @FindBy(xpath = "//label[contains(.,'BY HOME COUNTY')]")
    protected static WebElement byHomeCountry;
    @FindBy(xpath = "//label[contains(.,'BY TIER')]")
    protected static WebElement byTier;
    @FindBy(xpath = "//div[@class=\"page-title\"]/descendant::h2[contains(.,'Moments')]")
    protected static WebElement momentsPage;
}
