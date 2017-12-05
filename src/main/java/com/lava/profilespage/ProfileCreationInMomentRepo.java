package com.lava.profilespage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 20/07/17.
 */
public class ProfileCreationInMomentRepo extends ObjectsBase {

    public ProfileCreationInMomentRepo(RemoteWebDriver driver){super(driver);}


    @FindBy(xpath = "//input[@placeholder=\"Enter profile name\"]")
    protected static WebElement profileName;
    @FindBy(xpath = "//button[contains(.,'Set Profile')]")
    protected static WebElement setProfile;
    @FindBy(xpath = "//div[@class='toast toast-success']/descendant::div[contains(.,'Success')]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;

}
