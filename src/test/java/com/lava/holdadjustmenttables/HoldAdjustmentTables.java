package com.lava.holdadjustmenttables;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 10/05/17.
 */
public class HoldAdjustmentTables extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }

    @Title("Verify Able to create hold adjustment tables for moments")
    @Test(priority=1, testName = "Lava_TC5")
    public void ableToCreateHoldAdjustmentTables() {
            Assert.assertTrue(Pages.HoldAdjustmentTableCreationPage().holdAdjustmentCreate(), "Failed to Create");
    }



    @Title("Hold adjustment table in draft test")
    @Test(priority=3, testName = "Lava_TC5")
    public void holdAdjustmentTableStatusTest() {
        Assert.assertTrue(Pages.HoldAdjustmentTableInDraftPage().tableStatus(), "Hold adjustment table is not in unused state");
        Assert.assertTrue(Pages.HoldAdjustmentTableInDraftPage().namechange(), "Failed to test change of Name of Hold adjustment tables");
        Assert.assertTrue(Pages.HoldAdjustmentTableInDraftPage().createEngagementUsingHoldTable(), "Creating Engagements using Hold table failed");
        Assert.assertTrue(Pages.HoldAdjustmentTableInDraftPage().tableStatusDraft(), "Hold table status is not DRAFT since and used by an engagement");
        Assert.assertTrue(Pages.HoldAdjustmentTableInDraftPage().deleteEngagementandHoldTable(), "Deleting Hold table and engagements failed");
    }
    @Test(priority=7, testName = "Lava_TC5")
    public void holdAdjustmentTableDuplicateTest() {
        Assert.assertTrue(Pages.HoldAdjustmentTableDuplicatePage().duplicateTest(), "Duplicate creation of Hold table failed");
    }
    @Test(priority=8, testName = "Lava_TC5")
    public void holdAdjustmentTableaddRowinEditTest() {
        Assert.assertTrue(Pages.HoldAdjustmentTableDuplicatePage().addRowInEdit(), "Adding row in Edit mode of Hold table failed");
    }
    @Test(priority=9, testName = "Lava_TC5")
    public void holdAdjustmentTableerrorinEditErrorTest() {
        Assert.assertTrue(Pages.HoldAdjustmentTableDuplicatePage().editTableError(), "Error message in Editing of Hold table failed");
    }
    @Test(priority=10, testName = "Lava_TC5")
    public void holdAdjustmentTableerrorinEditSuccessTest() {
        Assert.assertTrue(Pages.HoldAdjustmentTableDuplicatePage().editTableSuccess(), "Editing of  Hold table failed");
    }
    @Test(priority=11, testName = "Lava_TC5")
    public void holdAdjustmentTableviewNameTest() {
        Assert.assertTrue(Pages.HoldAdjustmentTableViewPage().tableName(), "Name in view mode of  Hold table didn't match");
    }
   // @Test(priority=12, testName = "Lava_TC5")
    public void holdAdjustmentTableviewValueTest() {
        Assert.assertTrue(Pages.HoldAdjustmentTableViewPage().values(), "Values in view mode of  Hold table failed");
    }
    @Test(priority=13, testName = "Lava_TC5")
    public void holdAdjustmentTableStatusiconValidation() {
        Assert.assertTrue(Pages.HoldAdjustmentPage().status(), "Status icons are missing in Hold table failed");
    }
    @Test(priority=12, testName = "Lava_TC5")
    public void holdAdjustmentTableColumnsValidation() {
        Assert.assertTrue(Pages.HoldAdjustmentPage().columns(), "Column names are missing in Hold table failed");
    }
    @Test(priority=13, testName = "Lava_TC5")
    public void holdAdjustmentTableColumnsSortBtnValidation() {
        Assert.assertTrue(Pages.HoldAdjustmentPage().sortBtn(), "Sort buttons in Columns are missing in Hold table failed");
    }
    @Test(priority=14, testName = "Lava_TC5")
    public void holdAdjustmentTableUserNameToggleValidation() {
        Assert.assertTrue(Pages.HoldAdjustmentPage().userToggleInHoldTablePage(), "User name toggle is missing in Hold table failed");
    }

    @Title("Verify Able to delete hold adjustment tables for moments")
    @Test(priority=15, testName = "Lava_TC5")
    public void ableToDeleteHoldAdjustmentTables() {
        Assert.assertTrue(Pages.DeleteHoldAdjustmentTablePage().deleteTables(), "Failed to delete");
    }
}
