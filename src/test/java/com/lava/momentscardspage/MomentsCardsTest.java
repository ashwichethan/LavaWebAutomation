package com.lava.momentscardspage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 19/05/17.
 */
public class MomentsCardsTest extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify moments cards dashboard ")
    @TestCaseId("TMS-6")
    @Test(testName = "Lava_TC5")
    public void ableToverifyCardsDashboard() {

            Assert.assertTrue(Pages.MomentsCardsPage().cards(), "Failed in cards dashboard ");

    }


}
