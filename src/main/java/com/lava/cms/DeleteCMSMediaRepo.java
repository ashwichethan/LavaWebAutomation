package com.lava.cms;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 23/05/17.
 */
public class DeleteCMSMediaRepo extends ObjectsBase {
    public DeleteCMSMediaRepo(RemoteWebDriver driver){super(driver);}
    @FindBy(xpath = "//div[@class=\"edit_field\"]")
    protected static List<WebElement> fileName;

    @FindBy(xpath = "//a[@data-ng-click=\"delete(media.id, media.url, media.name);\"]")
    protected static List<WebElement> deleteButton;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    protected static WebElement yesButton;
    @FindBy(xpath = ".//div[@class=\"toast-message\"]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//a[contains(.,'Resources')]")
    protected static WebElement resourceTab;

    @FindBy(xpath = "//a[@href=\"#/content-management\"]")
    protected static WebElement CMStab;

    @FindBy(xpath = "//div[@ng-init=\"mediaLoad()\"]")
    protected static WebElement CMSMediaPage;
    @FindBy(xpath = "//div[@class=\"treasure-overlay-spinner\"]")
    protected static WebElement loadingSpinner;

}
