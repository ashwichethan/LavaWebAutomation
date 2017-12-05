package com.lava.momentspage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 01/06/17.
 */
public class momentsStartEndDatesVerifyTest extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify Able to get details of moments")
    @TestCaseId("TMS-6")
    @Test(testName = "Lava_TC5")
    public void momentsDetails() {
            Assert.assertTrue(Pages.momentsStartEndDatesVerifyPage().moments(), "Failed to get details ");

    }
}
