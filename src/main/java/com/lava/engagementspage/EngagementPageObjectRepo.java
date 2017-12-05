package com.lava.engagementspage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by codecraft on 25/11/16.
 */
public class EngagementPageObjectRepo extends ObjectsBase {

    public EngagementPageObjectRepo(RemoteWebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@class='page dashboard engagements-page ng-scope']")
    protected static WebElement engagementsPage;

    @FindBy(xpath = "//div[@class='item-holder ng-scope']")
    protected static List<WebElement> engagementTypes;

    protected static String MobileInAppNotification="Mobile in app notification";

    @FindBy(xpath = "//div[@class='item-holder ng-scope']/descendant::span[contains(.,'Mobile in app notification')]")
    protected static WebElement mobileInAppButton;
}
