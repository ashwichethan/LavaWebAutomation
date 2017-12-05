package com.lava.momentsStatisticsBackend_Age_Tier_Gender_Ethnic;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 21/06/17.
 */
public class cardoutTriggerStatisticsTest extends TestBase {
//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify Able to get statistics")
    @TestCaseId("TMS-8")
    @Test(testName = "Lava_TC5")
    public void ableToViewStatistics() {

            Assert.assertTrue(Pages.CardoutTriggerStatistics().statistics(), "Failed to get");


    }


}
