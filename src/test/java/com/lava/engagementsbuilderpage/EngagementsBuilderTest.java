package com.lava.engagementsbuilderpage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 22/03/17.
 */
public class EngagementsBuilderTest extends TestBase {


//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify Able to get tooltip of engagements")
    @Test(priority=1, testName = "Lava_TC7")
    public void EngagementStatusCheck(){
        Assert.assertTrue(Pages.EngagementStatusCheck().navigateEngagemnetsPage(),"Failed to navigate to engagements page");
        Assert.assertTrue(Pages.EngagementStatusCheck().createEngagement(),"Failed to create engagement DISCOUNT OFFER");
        Assert.assertTrue(Pages.EngagementStatusCheck().navigateMomentsCreation(),"Failed to naviaget to moment creation page");
        Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger("Card out", "GAMING"), "Failed to drag trigger");
        Assert.assertTrue(Pages.DragAndDropProfilesPage().dragAndDropProfiles("Every Customer", "EVERYONE"), "Failed to drag profile");
        Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiers("Always True", "GENERAL"), "Failed to drag Qualifier");
        Assert.assertTrue(Pages.EngagementStatusCheck().engagementAdd(),"Failed to add Engagement");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentTitle(), "Failed to add moment title");

        Assert.assertTrue(Pages.EngagementStatusCheck().navigateEngagemnetsPage(),"Failed to navigate to engagements page");
        Assert.assertEquals(Pages.EngagementStatusCheck().engStatus(),"status-in-draft", "Engagement status should be IN-DRAFT state");

        Assert.assertTrue(Pages.EngagementStatusCheck().navigateMomentsPage(), "Failed to navigate to moments page");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentSubmit(), "Failed to submit moment");
        Assert.assertTrue(Pages.EngagementStatusCheck().navigateEngagemnetsPage(), "Failed to navigate Engagement page");
        Assert.assertEquals(Pages.EngagementStatusCheck().engStatus(),"status-in-use", "Engagement status should be in IN-USE state");

        Assert.assertTrue(Pages.EngagementStatusCheck().navigateMomentsPage(), "Failed to navigate to moments page");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentLive(), "Failed to Approve moment");
        Assert.assertTrue(Pages.EngagementStatusCheck().navigateEngagemnetsPage(), "Failed to navigate Engagement page");
        Assert.assertEquals(Pages.EngagementStatusCheck().engStatus(),"status-in-use", "Engagement status should be in IN-USE state");

        Assert.assertTrue(Pages.EngagementStatusCheck().navigateMomentsPage(), "Failed to navigate to moments page");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentSuspend(), "Failed to suspend moment");
        Assert.assertTrue(Pages.EngagementStatusCheck().navigateEngagemnetsPage(), "Failed to navigate Engagement page");
        Assert.assertEquals(Pages.EngagementStatusCheck().engStatus(),"status-in-use", "Engagement status should be in IN-DRAFT state");

        Assert.assertTrue(Pages.EngagementStatusCheck().navigateMomentsPage(), "Failed to navigate to moments page");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentReject(), "Failed to suspend moment");
        Assert.assertTrue(Pages.EngagementStatusCheck().navigateEngagemnetsPage(), "Failed to navigate Engagement page");
        Assert.assertEquals(Pages.EngagementStatusCheck().engStatus(),"status-in-draft", "Engagement status should be IN-DRAFT state");

    }

    @Title("Verify Able to create engagement")
    @Test(priority=2, testName = "Lava_TC3")
    public void ableToCreateEngagements(){
        Assert.assertTrue(Pages.EngagementsCreationPage().createEngagements(),"Failed to Create engagements");
    }
   // @Test(priority=3,testName = "Lava_TC3")
    public void EngagementNodes(){
        String s[]= {"Discount Offer","SMS Text", "Return Personalized Content","Sponsor Opt-in Notification", "Survey","Mobile in app notification","Personal Pay Table Award","Rebate Percentage Award","Rebate Table Award","Gaming award player","Tables Rebate Percentage Award","Distribute passes"};
        Assert.assertEquals(Pages.EngagementPopup().nodes(),s, "Engagement names are not matching or the engagement(s) missing");
    }
    @Title("Verify Able to delete engagements")
    @Test(priority=4, testName = "Lava_TC3")
    public void ableToDeleteEngagements(){
        Assert.assertTrue(Pages.DeleteEngagementsPage().deleteEngagement(),"Failed to Delete engagements");
    }

    @Title("Verify Able to get tooltip of engagements")
    @Test(priority=4, testName = "Lava_TC3")
    public void ableToHoverEngagements(){
        Assert.assertTrue(Pages.EngagementsTooltip().tooltipEngagement(),"Failed to get the tooltip contents");
    }



}
