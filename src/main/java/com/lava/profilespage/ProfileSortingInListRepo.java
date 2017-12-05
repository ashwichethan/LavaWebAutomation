package com.lava.profilespage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jenkins on 24/04/17.
 */
public class ProfileSortingInListRepo extends ObjectsBase{
    public ProfileSortingInListRepo(RemoteWebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='th moment-status']")
    protected static WebElement statusTab;

    @FindBy(xpath = "//div[@class='th moment-name']")
    protected static WebElement profileNameTab;

    @FindBy(xpath = "//div[@class='th moment-owner']")
    protected static WebElement ownerTab;
    @FindBy(xpath = "//div[@class='th moment-type']")
    protected static WebElement profileTypeTab;
    @FindBy(xpath = "//div[@class='th moment-created']")
    protected static WebElement createdTab;
    @FindBy(xpath = "//div[@class='th moment-size']")
    protected static WebElement populationTab;
}
