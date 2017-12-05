package com.lava.timeline;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 05/07/17.
 */
public class TimelineRepo  extends ObjectsBase{
    public TimelineRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath="//td[@class=\"moment-name ng-binding\"]")
    protected static List<WebElement> momentNames;





}
