package com.lava.CreateMomentPage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
/**
 * Created by Ashwi on 10/11/17.
 */
public class GamingMomentCreationTest extends TestBase {
    @BeforeSuite
    public void login(){
        String email = credentialsProperties.get("USERNAME");
        String password = credentialsProperties.get("PASSWORD");
        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
    }
    @Test(priority=1, testName = "Lava_TC2")

    public void gamingMomentCreationTest(){
        Assert.assertTrue(Pages.CreateNewMomentPage().navigateToCreateMomentPage(), "Failed to drag profile");
      //  Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger(triggerName, triggerTabName), "Failed to drag profile");

    

    }


}
