package com.lava.rebatetable;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 29/05/17.
 */
public class RebateTableTest extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify Able to create rebate tables for moments")
    @TestCaseId("TMS-8")
    @Test(priority=1, testName = "Lava_TC5")
    public void ableToCreateRebateTables() {
            Assert.assertTrue(Pages.CreateRebatePage().rebateTableCreate(), "Failed to Create rebate table");


    }


    @Test(priority=3, testName = "Lava_TC5")
    public void ableToEditRebateTables() {
        Assert.assertTrue(Pages.EditRebateTablePage().editRebateTable(), "Failed to Edit rebate table");
    }

    @Test(priority=4, testName = "Lava_TC5")
    public void ableToViewRebateTables() {
        Assert.assertTrue(Pages.CreateAndViewRebateTablePage().CreateAndView(), "Failed to Create copy of rebate table");
    }

    @Test(priority=5, testName = "Lava_TC5")
    public void ableToCopyRebateTables() {
        Assert.assertTrue(Pages.CreateCopyOfRebateTable().copyRebateTable(), "Failed to Create copy of rebate table");
    }

    @Test(priority=6, testName = "Lava_TC5")
    public void rebateTableStatusiconValidation() {
        Assert.assertTrue(Pages.RebateTablePage().status(), "Status icons are missing in Rebate table failed");
    }
    @Test(priority=7, testName = "Lava_TC5")
    public void rebateTableColumnsValidation() {
        Assert.assertTrue(Pages.RebateTablePage().columns(), "Columns names are missing in Rebate table failed");
    }
    @Test(priority=8, testName = "Lava_TC5")
    public void rebateTableColumnsSortBtnValidation() {
        Assert.assertTrue(Pages.RebateTablePage().sortBtn(), "Sort buttons in Columns are missing in Rebate table failed");
    }
    @Test(priority=9, testName = "Lava_TC5")
    public void rebateTableUserNameToggleValidation() {
        Assert.assertTrue(Pages.RebateTablePage().userToggleInRebateTablePage(), "User name toggle is missing in Rebate table failed");
    }


    @Test(priority=10, testName = "Lava_TC5")
    public void rebateTableStatusCheck() {
        Assert.assertTrue(Pages.RebateTableStatusChangePage().status(), "Rebate Table unused status check failed");
        Assert.assertTrue(Pages.RebateTableStatusChangePage().nameChange(), "Rebate Table name change failed");
        Assert.assertTrue(Pages.RebateTableStatusChangePage().createEngagementUsingRebateTable(), "Using Rebate tabel in Engagement failed");
        Assert.assertTrue(Pages.RebateTableStatusChangePage().tableStatusDraft(), "Rebate Table status DRAFT failed");
        Assert.assertTrue(Pages.RebateTableStatusChangePage().deleteRebateTableAndEngagement(), "Delete rebate and engagement failed ");

    }

    @Test(priority=11, testName = "Lava_TC5")
    public void ableToDeleteRebateTables() {
        Assert.assertTrue(Pages.DeleteRebateTablePage().deleteRebate(), "Failed to Create rebate table");

    }

}
