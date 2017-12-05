package com.lava.engagementbuilderpage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jenkins on 20/07/17.
 */
public class CreateEngagementsInMomentsRepo extends ObjectsBase {
    public CreateEngagementsInMomentsRepo(RemoteWebDriver driver){super(driver);}

   @FindBy(xpath = "//div[@class=\"dynamic-form\"]/descendant::input[@placeholder=\"Enter engagement name\"]")
   protected static WebElement engagementName;



}
