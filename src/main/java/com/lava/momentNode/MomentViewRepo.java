package com.lava.momentNode;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 24/07/17.
 */
public class MomentViewRepo extends ObjectsBase {
    public MomentViewRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> momentsList;
    @FindBy(xpath = "//button[@class=\"moment-view-button ng-scope\"]")
    protected static WebElement momentView;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;

    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::td[@class=\"moment-type ng-binding\"]")
    protected static WebElement momentTriggerName;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class='status-draft']")
    protected static WebElement status;
    @FindBy(xpath = "//div[@class=\"page-title\"]/descendant::h2[contains(.,'Moments')]")
    protected static WebElement momentsPageTitle;
    @FindBy(xpath = "//a[contains(.,'Design')]")
    protected static WebElement designTab;
    @FindBy(xpath = "//ul[@class=\"submenu show\"]/descendant::a[contains(.,'Moments')]")
    protected static WebElement momentsTab;
    @FindBy(xpath = "//div[@ng-model=\"segItem.triggers\"]")
    protected static WebElement triggerName;
    @FindBy(xpath = "//span[@class=\"data-value total-trigger ng-binding\"]")
    protected static WebElement totalTriggered;
    @FindBy(xpath = "//span[@class=\"data-value individuals-trigger ng-binding\"]")
    protected static WebElement individualsTriggered;
    @FindBy(xpath = "//div[@class=\"column-content column-segment\"]/descendant::span[@class=\"data-value ng-binding\"]")
    protected static WebElement eligible;
    @FindBy(xpath = "//div[@class=\"column-content column-segment\"]/descendant::button[@class=\"btn-compare\"]")
    protected static WebElement eligibleCompareBtn;
    @FindBy(xpath = "//div[@class=\"qualifier-groups always-groups always-1 has-group\"]/descendant::button[@class=\"btn-compare\"]")
    protected static WebElement qualifierCompareBtn;
    @FindBy(xpath = "//div[@class=\"group-box has-child\"]/descendant::span[@class=\"data-value ng-binding\"]")
    protected static WebElement qualified;
    @FindBy(xpath = "//span[@class=\"data-value limit-val ng-binding\"]")
    protected static WebElement engagements;
    @FindBy(xpath = ".//span[@class=\"data-value exec-val ng-binding\"]")
    protected static WebElement engaged;


}
