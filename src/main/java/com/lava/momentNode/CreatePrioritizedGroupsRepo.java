package com.lava.momentNode;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 14/07/17.
 */
public class CreatePrioritizedGroupsRepo extends ObjectsBase{

    public CreatePrioritizedGroupsRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//div[@class=\"moment-box\"]/descendant::div[contains(@class,'qualifier-groups prioritized-groups prioritized')]/descendant::div[@class='btn-group']")
    protected static WebElement addPrioritizedBtn;




}
