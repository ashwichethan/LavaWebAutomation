package com.lava.geolocation;

import com.lava.utils.Base;
import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 10/05/17.
 */
public class DeleteGeoLocationRepo extends ObjectsBase {
    DeleteGeoLocationRepo(RemoteWebDriver driver){super(driver);}


    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> geolocationNames;

    @FindBy(xpath = "//div[@class=\"th moment-status\"]")
    protected static WebElement statusTab;
    @FindBy(xpath = "//button[contains(.,'Delete')]")
    protected static WebElement deleteBtn;
    @FindBy(xpath = "//button[contains(.,'Yes')]")
    protected static WebElement yesBtnInDialog;
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class=\"status-unused\"]")
    protected static WebElement statusOfSelectedGeolocation;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;
}
