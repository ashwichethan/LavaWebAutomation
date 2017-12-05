package com.lava.rebatetable;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 11/07/17.
 */
public class RebateTableRepo extends ObjectsBase {
    public RebateTableRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//th/div/span")
    protected static List<WebElement> sortBtn;
    @FindBy(xpath = "//div[@class=\"status-legends upload-segment-status\"]/descendant::span")
    protected static List<WebElement> status;
    @FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
    protected static WebElement userInfoToggle;
    @FindBy(xpath = "//th/div")
    protected static List<WebElement> columnName;


}
