package com.lava.geolocation;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jenkins on 10/05/17.
 */
public class CreateGeoLocationRepo extends ObjectsBase {
  public CreateGeoLocationRepo(RemoteWebDriver driver){super(driver);}
    @FindBy(xpath = "//a[contains(.,'Resources')]")
    protected static WebElement resourceTab;

    @FindBy(xpath = "//a[contains(.,'Geo Location Settings')]")
    protected static WebElement geoLocationTab;

    @FindBy(xpath = "//h2[@class=\"geofence-title\"]")
    protected static WebElement geolocationTitle;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
@FindBy(xpath = "//section[@id='content-section']")
protected static WebElement geolocationPage;

    @FindBy(xpath = "//a[@ng-click=\"addGeoLocation();\"]")
    protected static WebElement addGeoLocationButton;

    @FindBy(xpath = "//label[@for=\"ibeacon-select\"]")
    protected static WebElement ibeaconRadioBtn;

    @FindBy(xpath = "//input[@ng-model=\"areaname\"]")
    protected static WebElement areaName;

    @FindBy(xpath = "//input[@ng-model=\"uuid\"]")
    protected static WebElement uuidInput;

    @FindBy(xpath = "//input[@ng-model=\"major\"]")
    protected static WebElement majorInput;

    @FindBy(xpath = "//input[@ng-model=\"minor\"]")
    protected static WebElement minorInput;

    @FindBy(xpath = "//input[@ng-model=\"threshold_distance\"]")
    protected static WebElement thresholdInput;

    @FindBy(xpath = "//button[@data-ng-click=\"saveGeoLocation(idSelectedGeoLocationRow)\"]")
    protected static WebElement addButton;

    @FindBy(xpath = "//div[@class=\"modal-content\"]")
    protected static WebElement GeoModal;

    @FindBy(xpath = "//label[@for=\"region-select\"]")
    protected static WebElement regionRadioBtn;

    @FindBy(xpath = "//input[@ng-model=\"latitude\"]")
    protected static WebElement latitude;

    @FindBy(xpath = "//input[@ng-model=\"longitude\"]")
    protected static WebElement longitude;

    @FindBy(xpath = "//input[@ng-model=\"radius\"]")
    protected static WebElement radius;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;



}
