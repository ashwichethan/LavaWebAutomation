package com.lava.homepage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created by codecraft on 25/11/16.
 */
public class HomePageObject extends ObjectsBase {

    public HomePageObject(RemoteWebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//aside[@id='sidebar']")
    protected static WebElement homepage;

    @FindBy(xpath = "//div[@class = \"float moment-status-box\"]/descendant::a[@href='#/moments/?searchByStatus=draft']")
    protected  static WebElement draftarrowbutton;

    @FindBy(xpath = "//div[@class = \"float moment-status-box\"]/descendant::a[@href='#/moments/?searchByStatus=live']")
    protected  static WebElement livearrowbutton;

    @FindBy(xpath = "//div[@class = \"float moment-status-box\"]/descendant::a[@href='#/moments/?searchByStatus=submitted']")
    protected  static WebElement submitarrowbutton;

    @FindBy(xpath = "//div[@class='page dashboard moments-page ng-scope']/descendant::h2[@class='moments-title']")
    protected static WebElement momentlistpage;

    @FindBy(xpath = "//input[@type='text']")
    protected  static WebElement searchByStatusPlaceholder;

    @FindBy(xpath = "//aside[@id='sidebar']/descendant::a[@href='#/home']")
    protected  static WebElement hometab;

    @FindBy(xpath = "//td[@class=\"moment-status\"]/descendant::span[@class=\"status-submitted\"]")
    protected static List<WebElement> submitstatusicon;

    @FindBy(xpath = "//td[@class=\"moment-status\"]/descendant::span[@class=\"status-draft\"]")
    protected static List<WebElement> draftstatusicon;

    @FindBy(xpath = "//td[@class=\"moment-status\"]/descendant::span[@class=\"status-live\"]")
    protected static List<WebElement> livestatusicon;

    @FindBy(xpath = "//div[@class='status-column column-0']/descendant::h3[@class='ng-binding']")
    protected static WebElement draftcount;

    @FindBy(xpath = "//div[@class='status-column column-1']/descendant::h3[@class='ng-binding']")
    protected static WebElement livecount;

    @FindBy(xpath = "//div[@class='status-column column-2']/descendant::h3[@class='ng-binding']")
    protected static WebElement submitcount;

    @FindBy(xpath = "//div[@class=\"status-column column-0\"]/span")
    protected static WebElement draftText;
    @FindBy(xpath = "//h2[@class=\"home-title\"]")
    protected static WebElement homeTitle;

    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//li[@class=\"home active\"]/a")
    protected static WebElement homePageActive;
    @FindBy(xpath = "//a[@class=\"button create-button\"]")
    protected static WebElement createNewMomentBtn;
    @FindBy(xpath = "//div[@class=\"status-column column-0\"]/span")
    protected static WebElement draftMoments;
    @FindBy(xpath = "//div[@class=\"status-column column-1\"]/span")
    protected static WebElement liveMoments;
    @FindBy(xpath = "//h2[@class=\"top-moments-title\"]")
    protected static WebElement topMomentsTitle;
    @FindBy(xpath = "//div[@class=\"float ng-scope\"]/div")
    protected static List<WebElement> topLiveMoments4;
    @FindBy(xpath = "//div[@class=\"single-moment-box ticket-offer ng-scope\"]")
    protected static List<WebElement> topLiveMoments;
    @FindBy(xpath = "//div[@class=\"status-column column-1\"]/h3")
    protected static WebElement totalLiveMoments;
    @FindBy(xpath = "//div[@class=\"empty-single-moment\"]")
    protected static List<WebElement> emptyMoments;
    @FindBy(xpath = "//div[@class=\"empty-single-moment\"]/span")
    protected static List<WebElement> nothingToDisplayText;
    @FindBy(xpath = "//div[@class=\"status-column column-2\"]/span")
    protected static WebElement pendingMoments;

}
