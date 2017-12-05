package com.lava.engagementbuilderpage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 19/05/17.
 */
public class EngagementsTooltipRepo extends ObjectsBase {
    public EngagementsTooltipRepo(RemoteWebDriver driver){super(driver);}


    @FindBy(xpath = "//div[@role=\"tooltip\"]")
    protected static WebElement toolTip;

    @FindBy(xpath = "//div[@class=\"ui-tooltip-content\"]")
    protected static WebElement toolTipContent;

    @FindBy(xpath = "//div[@class=\"ui-tooltip-content\"]/p")
    protected static List<WebElement> toolTipContents;

    @FindBy(xpath = "//tr[@class=\"ng-scope\"]")
    protected static List<WebElement> engagementsInList;

    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;

}
