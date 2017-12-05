package com.lava.cms;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 23/05/17.
 */
public class AddMediaFilesRepo extends ObjectsBase {
    public AddMediaFilesRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//a[contains(.,'Resources')]")
    protected static WebElement resourceTab;

    @FindBy(xpath = "//div[@class=\"page-title\"]/descendant::h2[contains(.,'Content management')]")
    protected static WebElement cmsTitle;

    @FindBy(xpath = "//a[@href=\"#/content-management\"]")
    protected static WebElement CMStab;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;
    @FindBy(xpath = "//div[@ng-init=\"mediaLoad()\"]")
    protected static WebElement CMSMediaPage;

    @FindBy(xpath = "//input[@id='file-to-upload']")
    protected static WebElement browse;

    @FindBy(xpath = "//button[@ng-click=\"uploadFile()\"]")
    protected static WebElement uploadButton;

    @FindBy(xpath = "//div[@ng-repeat=\"media in mediaList\"]")
    protected static List<WebElement> mediaFiles;

    @FindBy(xpath = "//div[@class=\"edit_field\"]")
    protected static List<WebElement> fileName;

    @FindBy(xpath = "//div[@class=\"treasure-overlay-spinner\"]")
    protected static WebElement loadingSpinner;

    @FindBy(xpath = "//div[@class=\"loading\"]")
    protected static WebElement loadingMedia;

    @FindBy(xpath = "//a[@ng-click=\"Lightbox.openModal(mediaList, $index);clickEvent($event);\"]")
    protected static List<WebElement> viewFile;

    @FindBy(xpath = "//button[@ng-click=\"$dismiss()\"]")
    protected static WebElement dismissButton;

    @FindBy(xpath = ".//div[@class=\"toast-message\"]")
    protected static WebElement successToastMessage;


}
