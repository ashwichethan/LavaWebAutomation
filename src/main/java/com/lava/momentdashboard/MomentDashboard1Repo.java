package com.lava.momentdashboard;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 24/05/17.
 */
public class MomentDashboard1Repo extends ObjectsBase {
    public MomentDashboard1Repo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//li[@class=\"analyze has-submenu\"]")
    protected static WebElement analyzeTab;

    @FindBy(xpath = "//a[@href=\"#/moment-dashboard\"]")
    protected static WebElement momentDashboardTab;

    @FindBy(xpath = "//div[@ng-class=\"{'ab':item.ab_test}\"]")
    protected static List<WebElement> momentList;
    @FindBy(xpath = "//div[@class=\"treasure-overlay-spinner\"]")
    protected static WebElement loadingSpinner;

    @FindBy(xpath = "//ol[@class=\"breadcrumb\"]/descendant::a[@href=\"#/moment-dashboard\"]")
    protected static WebElement momentDashboardOverviewBtn;

    @FindBy(xpath = "//li[@class=\"active ng-binding\"]")
    protected static WebElement momentName;
}
