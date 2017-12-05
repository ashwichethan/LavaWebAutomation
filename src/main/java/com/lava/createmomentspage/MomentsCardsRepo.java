package com.lava.createmomentspage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 19/05/17.
 */
public class MomentsCardsRepo extends ObjectsBase {
    public MomentsCardsRepo(RemoteWebDriver driver){super (driver);}

    @FindBy(xpath = "//div[@ng-class=\"{'ab':item.ab_test}\"]")
    protected static List<WebElement> momentCards;

@FindBy(xpath = "//div[@class=\"gaming-box-header\"]")
protected static List<WebElement> cardHeaderContent;


    @FindBy(xpath = "//div[@class=\"gaming-box-content\"]")
    protected static List<WebElement> cardBodyContent;


    @FindBy(xpath = "//div[@class=\"gaming-box-footer\"]")
    protected static List<WebElement> cardFooterContent;


    @FindBy(xpath = "//a[contains(.,'Design')]")
    protected static WebElement designTab;
    @FindBy(xpath = "//div[@class=\"page-title\"]/descendant::h2[contains(.,'Moments')]")
    protected static WebElement momentsPageTitle;
    @FindBy(xpath = "//li[@class=\"moments\"]/descendant::a[@is-active-nav=\"\"]")
    protected static WebElement momentsTab;

    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//li[@ng-click=\"showList = false;showCard = true;showTimeine = false;\"]")
    protected static WebElement cardsTab;
}
