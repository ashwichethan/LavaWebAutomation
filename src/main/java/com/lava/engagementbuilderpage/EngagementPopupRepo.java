package com.lava.engagementbuilderpage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 25/07/17.
 */
public class EngagementPopupRepo extends ObjectsBase {

    public EngagementPopupRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//a[contains(.,'Design')]")
    protected static WebElement designTab;
    @FindBy(xpath = "//div[@class='page dashboard engagements-page ng-scope']")
    protected static WebElement engagementsPage;
    @FindBy(xpath = "//ul[@class='submenu show']/descendant::li[@class='engagements']/descendant::a[contains(.,'Engagements')]")
    protected static WebElement engagementsTab;
    @FindBy(xpath = "//div[@class=\"engagement-outer text-center ng-scope\"]")
    protected static WebElement isNodesVisibleEngagement;
    @FindBy(xpath = "//div[@class=\"item-holder ng-scope\"]")
    protected static List<WebElement> engagementNodes;
    @FindBy(xpath = "//input[@ng-model=\"actionName\"]")
    protected static WebElement engagementNameField;
    @FindBy(xpath = "//div[@class=\"input-checkbox input-check-single ng-scope\"]")
    protected static WebElement sandBox;


}
