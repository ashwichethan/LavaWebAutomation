package com.lava.globalPlatformDashboard;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 07/06/17.
 */
public class globalPlatformDashboardTest extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify Able to view global platform dashboard ")
    @TestCaseId("TMS-8")
    @Test(testName = "Lava_TC5")
    public void ableToViewGlobalPlatformDashboard() {
        try {
            Assert.assertTrue(Pages.GlobalPlatformDashboard().viewGlobalPlatformDashboard(), "Failed to Create copy of rebate table");



        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
