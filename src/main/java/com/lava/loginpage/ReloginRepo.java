package com.lava.loginpage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jenkins on 05/07/17.
 */
public class ReloginRepo extends ObjectsBase {
    public ReloginRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath="//img[@alt=\"user\"]")
    protected static WebElement userTab;

    @FindBy(xpath="//a[@href=\"#/logout\"]")
    protected static WebElement logoutBtn;

    @FindBy(xpath="//input[@id='login-username']")
    protected static WebElement userName;

    @FindBy(xpath="//input[@id='login-password']")
    protected static WebElement password;
    @FindBy(xpath="//button[@id='login-submit']")
    protected static WebElement submitButton;

    @FindBy(xpath="//li[@class=\"owner\"]")
    protected static WebElement ownerName;

    @FindBy(xpath="//div[@class=\"login-message\"]")
    protected static WebElement loginFailureMsg;
    @FindBy(xpath="//span[contains(.,'Authentication failed, please try again.')]")
    protected static WebElement authenticationFailed;




}
