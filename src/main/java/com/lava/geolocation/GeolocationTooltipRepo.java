package com.lava.geolocation;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 19/05/17.
 */
public class GeolocationTooltipRepo extends ObjectsBase {
    public GeolocationTooltipRepo(RemoteWebDriver driver){super (driver);}


    @FindBy(xpath = "//div[@class=\"ui-tooltip-content\"]/b")
    protected static List<WebElement> toolTipContents;

    @FindBy(xpath = "//tr[@class=\"ng-scope\"]")
    protected static List<WebElement> geolocationsInList;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
}
