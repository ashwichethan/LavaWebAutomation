package com.lava.globalplatformdashboard;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 07/06/17.
 */
public class GlobalPlatformDashboardRepo extends ObjectsBase {
    public GlobalPlatformDashboardRepo(RemoteWebDriver driver){ super(driver);}
    @FindBy(xpath = "//a[contains(.,'Analyze')]")
    protected static WebElement analyzeTab;
    @FindBy(xpath = "//a[contains(.,'Global platform dashboard')]")
    protected static WebElement globalPlatformDashboard;
    @FindBy(xpath = "//a[@data-target=\"#tab-global\"]")
    protected static WebElement globalTab;
    @FindBy(xpath = "//img[@ng-src=\"images/global/kings-logo-sm-@1x.png\"]")
    protected static WebElement kingsLogo;
    @FindBy(xpath = "//div[@class=\"total-data daily-data\"]/span")
    protected static WebElement totalDailyUsers;
    @FindBy(xpath = "//div[@class=\"total-data daily-data\"]/h2")
    protected static WebElement totalDailyUsersValue;
    @FindBy(xpath = "//div[@class=\"total-data\"]/span")
    protected static WebElement activeSessionUsers;
    @FindBy(xpath = "//div[@class=\"total-data\"]/h2")
    protected static WebElement activeSessionUsersValue;
    @FindBy(xpath = "//div[@class=\"rt-section realtime-attendance\"]/h2")
    protected static WebElement realtimeAttendance;
    @FindBy(xpath = "//div[@class=\"rt-section realtime-social\"]/h2")
    protected static WebElement realtimeSocial;
    @FindBy(xpath = "//strong[@class=\"ng-binding\"]")
    protected static List<WebElement> totalTwitterAccounts;
    @FindBy(xpath = "//a[@data-target=\"#tab-attendance\"]")
    protected static WebElement attendanceTab;
    @FindBy(xpath = "//div[@class=\"sect-1\"]/span")
    protected static WebElement totalAttendance;
    @FindBy(xpath = "//div[@class=\"sect-1\"]/h3")
    protected static WebElement totalAttendanceValue;
    @FindBy(xpath = "//div[@class=\"sect-3\"]/span")
    protected static WebElement distributed;
    @FindBy(xpath = "//div[@class=\"sect-3\"]/h3")
    protected static WebElement distributedValue;
    @FindBy(xpath = "//a[@data-target=\"#tab-concessions\"]")
    protected static WebElement concessionTab;
    @FindBy(xpath = "//span[@class=\"concession-label label-alcoholic ng-binding\"]")
    protected static WebElement alcoholic;
    @FindBy(xpath = "//span[@class=\"concession-value ng-binding\"]")
    protected static List<WebElement> concessionValues;
    @FindBy(xpath = "//span[@class=\"concession-label label-non-alcoholic ng-binding\"]")
    protected static WebElement nonAlcoholic;
    @FindBy(xpath = "//span[@class=\"concession-label label-food ng-binding\"]")
    protected static WebElement food;
    @FindBy(xpath = "//span[@class=\"concession-label label-hotdog ng-binding\"]")
    protected static WebElement others;
    @FindBy(xpath = "//span[@class=\"concession-label transaction-label\"]")
    protected static WebElement totalTransaction;


}
