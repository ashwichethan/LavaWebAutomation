package com.lava.profilespage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 08/05/17.
 */
public class DeleteProfilesRepo extends ObjectsBase {
    public DeleteProfilesRepo(RemoteWebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//tr[@class=\"ng-scope selected\"]/descendant::span[@class=\"status-unused\"]")
    protected static WebElement availableState;
    @FindBy(xpath = "//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> profilesInList;
    @FindBy(xpath = "//button[contains(.,'Delete')]")
    protected static WebElement deleteBtn;
    @FindBy(xpath = "//div[@class=\"modal-content\"]/descendant::button[contains(.,'Delete')]")
    protected static WebElement deleteBtnInDialog;
    @FindBy(xpath = "//div[@class='toast toast-success']/descendant::div[contains(.,'Success')]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;

    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;





}
