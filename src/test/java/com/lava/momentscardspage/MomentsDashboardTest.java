package com.lava.momentscardspage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 24/05/17.
 */
public class MomentsDashboardTest extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify moments cards in moments dashboard ")
    @TestCaseId("TMS-6")
    @Test(testName = "Lava_TC5")
    public void ableToverifyMomentsDashboard() {
        try {
            Assert.assertTrue(Pages.MomentDashboard1().momentsDashboard(), "Failed in verify in moments dashboard ");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
