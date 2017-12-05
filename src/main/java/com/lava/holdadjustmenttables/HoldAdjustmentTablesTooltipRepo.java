package com.lava.holdadjustmenttables;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 19/05/17.
 */
public class HoldAdjustmentTablesTooltipRepo extends ObjectsBase {
    public HoldAdjustmentTablesTooltipRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//div[@class=\"ui-tooltip-content\"]/p")
    protected static List<WebElement> toolTipContents;

    @FindBy(xpath = "//tr[@class=\"ng-scope\"]")
    protected static List<WebElement> tablesInList;

}
