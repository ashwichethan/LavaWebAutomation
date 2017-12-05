package com.lava.loginpage;

import com.lava.utils.ObjectsBase;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by codecraft on 25/11/16.
 */
public class LoginPageObjectRepo extends ObjectsBase {

    @FindBy(xpath = "//div[@class='login-page ng-scope']")
    protected static WebElement loginPage;
    @FindBy(xpath = "//input[@id='login-username']")
    protected static WebElement emailField;
    @FindBy(xpath="//input[@id='login-password']")
    protected static WebElement passwordField;
    @FindBy(xpath="//button[@id='login-submit']")
    protected static WebElement submitButton;
    @FindBy(xpath = "//a[@class=\"logo\"]")
    protected static WebElement lavaLogo;
    @FindBy(xpath = "//a[contains(.,'Home')]")
    protected static WebElement homeTab;
    public LoginPageObjectRepo(RemoteWebDriver driver) {
        super(driver);
    }



}
