package com.lava.geolocation;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 10/07/17.
 */
public class GeolocationRepo extends ObjectsBase {
    public GeolocationRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//h2[contains(.,'Geo Location Settings')]")
    protected static WebElement geolocationTitle;
    @FindBy(xpath = "//a[contains(.,'Add Geo Location')]")
    protected static WebElement addGeoBtn;
    @FindBy(xpath = "//a[contains(.,'Sync Gimbal Beacons')]")
    protected static WebElement syncGimbalBtn;
    @FindBy(xpath = "//div[@class=\"status-legends upload-segment-status\"]/descendant::span")
    protected static List<WebElement> status;
    @FindBy(xpath = "//th/div")
    protected static List<WebElement> columnName;
    @FindBy(xpath = "//th/div/span")
    protected static List<WebElement> sortBtn;
    @FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
    protected static WebElement userInfoToggle;


}
