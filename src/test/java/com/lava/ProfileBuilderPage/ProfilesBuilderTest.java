package com.lava.ProfileBuilderPage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

import static com.lava.base.TestBase.credentialsProperties;

/**
 * Created by jenkins on 20/03/17.
 */
public class ProfilesBuilderTest extends TestBase {


//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify Able to create profile for moments")
    @Test(priority=1, testName = "Lava_TC2")
    public void ableToCreateProfiles() {

           Assert.assertTrue(Pages.ProfilesCreationPage().createProfiles(), "Failed to Create Profiles");
    }

    @Title("Verify Able to get tooltip of profiles")
    @Test(priority=2, testName = "Lava_TC2")
    public void ProfilesStatus() {

        Assert.assertTrue(Pages.ProfileStatusCheck().clickProfileNode(), "Failed to check status of profiles");
        Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiers("Always True", "GENERAL"), "Failed to drag Qualifier");
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagments("Create New Engagement", "MOBILE IN APP NOTIFICATION"), "Failed to drag Engagements");
        Assert.assertTrue(Pages.CreateEngagementsInMomentsPage().createEngagements(), "Failed to create Engagements in moments page");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentTitle(), "Failed to add moment title");
        Assert.assertTrue(Pages.ProfileStatusCheck().navigateToProfilesPage(), "Failed to navigate profiles page");
        Assert.assertEquals(Pages.ProfileStatusCheck().profileStatus(),"status-in-draft", "Profile status should be IN-DRAFT state");

        Assert.assertTrue(Pages.ProfileStatusCheck().navigateMomentsPage(), "Failed to navigate to moments page");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentSubmit(), "Failed to submit moment");
        Assert.assertTrue(Pages.ProfileStatusCheck().navigateToProfilesPage(), "Failed to navigate profiles page");
        Assert.assertEquals(Pages.ProfileStatusCheck().profileStatus(),"status-in-use", "Profile status should be in IN-USE state");

        Assert.assertTrue(Pages.ProfileStatusCheck().navigateMomentsPage(), "Failed to navigate to moments page");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentLive(), "Failed to Approve moment");
        Assert.assertTrue(Pages.ProfileStatusCheck().navigateToProfilesPage(), "Failed to navigate profiles page");
        Assert.assertEquals(Pages.ProfileStatusCheck().profileStatus(),"status-in-use", "Profile status should be in IN-USE state");

        Assert.assertTrue(Pages.ProfileStatusCheck().navigateMomentsPage(), "Failed to navigate to moments page");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentSuspend(), "Failed to suspend moment");
        Assert.assertTrue(Pages.ProfileStatusCheck().navigateToProfilesPage(), "Failed to navigate profiles page");
        Assert.assertEquals(Pages.ProfileStatusCheck().profileStatus(),"status-in-use", "Profile status should be in IN-USE state");

        Assert.assertTrue(Pages.ProfileStatusCheck().navigateMomentsPage(), "Failed to navigate to moments page");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentReject(), "Failed to suspend moment");
        Assert.assertTrue(Pages.ProfileStatusCheck().navigateToProfilesPage(), "Failed to navigate profiles page");
        Assert.assertEquals(Pages.ProfileStatusCheck().profileStatus(),"status-in-draft", "Profile status should be IN-DRAFT state");

    }

    @Title("Verify Able to delete profiles")
    @Test(priority=3, testName = "Lava_TC2")
    public void ableToDeleteProfiles() {

        Assert.assertTrue(Pages.DeleteProfiles().deleteProfiles(), "Failed to Delete Profiles");

    }

    @Title("Verify Able to get tooltip of profiles")
   // @Test(priority=4, testName = "Lava_TC2")
    public void ableTogetTooltipOfProfiles() {

            Assert.assertTrue(Pages.ProfileTooltip().tooltipProfile(), "Failed to get tooltip of profiles");
    }





}
