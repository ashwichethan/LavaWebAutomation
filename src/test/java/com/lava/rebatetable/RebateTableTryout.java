package com.lava.rebatetable;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 02/06/17.
 */
public class RebateTableTryout extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify Able to delete rebate tables for moments")
    @TestCaseId("TMS-8")
    @Test(testName = "Lava_TC5")
    public void ableToDeleteRebateTables() {

            Assert.assertTrue(Pages.DeleteRebateTablePage().deleteRebate(), "Failed to Create rebate table");

    }

}
