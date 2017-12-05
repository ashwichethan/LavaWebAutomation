package com.lava.gamingmomentcreationpage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Ashwi on 10/11/17.
 */
public class GamingMomentCreationRepo extends ObjectsBase {
    public GamingMomentCreationRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//div[@class='page dashboard engagements-page ng-scope']")
    protected static WebElement engagementsPage;



}
