package com.lava.sidebar;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 21/07/17.
 */
public class sidebarRepo extends ObjectsBase {

    public sidebarRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//a[contains(.,'Home')]")
    protected static WebElement homeTab;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//h2[@class=\"home-title\"]")
    protected static WebElement homeTitle;
    @FindBy(xpath = "//a[contains(.,'Analyze')]")
    protected static WebElement analyzeTab;
    @FindBy(xpath = "//li[@class=\"analyze has-submenu hovered\"]/ul/li/a")
    protected static List<WebElement> analyzeSubMenu;
    @FindBy(xpath = "//a[contains(.,'Design')]")
    protected static WebElement designTab;
    @FindBy(xpath = "//li[@class=\"design has-submenu hovered\"]/ul/li/a")
    protected static List<WebElement> designSubMenu;
    @FindBy(xpath = "//a[contains(.,'Resources')]")
    protected static WebElement resourceTab;
    @FindBy(xpath = "//li[@class=\"resources has-submenu ng-scope hovered\"]/ul/li/a")
    protected static List<WebElement> resourceSubMenu;
    @FindBy(xpath = "//a[@class=\"logo\"]")
    protected static WebElement lavaLogo;

}
