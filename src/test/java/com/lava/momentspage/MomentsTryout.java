package com.lava.momentspage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 20/07/17.
 */
public class MomentsTryout extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }

    @TestCaseId("TMS-3")
    @Title("Create Moments for Area")
    @Test(dataProvider = "area", dataProviderClass = com.lava.momentspage.AreaDataProvider.class, testName = "Lava_TC3")
    public void adddAndRemoveNodes(String triggerTabName, String triggerName, String areaDirection, String areaValue, String profiletabname1, String profilename1, String qualifiertabname, String qualifiername, String engagementtabname1, String engagementname1) {

        Assert.assertTrue(Pages.CreateNewMomentPage().createNewMomentsInMomentsPage(), "Failed to navigate to moment creation page");
        Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger(triggerName, triggerTabName), "Failed to drag profile");
        Assert.assertTrue(areaDialog(areaValue, areaDirection), "Failed to add data to Area pop up");
        String profilename = "Create New Profile";
        String profiletabname = "Everyone";
        Assert.assertTrue(Pages.DragAndDropProfilesPage().dragAndDropProfiles(profilename, profiletabname), "Failed to drag profile");

        Assert.assertTrue(Pages.ProfileCreationInMomentpage().createProfile(), "Failed to create profile in Moments page");

        Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiers(qualifiername, qualifiertabname), "Failed to drag Qualifier");
        String engagementtabname = "MOBILE IN APP NOTIFICATION";
        String engagementname = "Create New Engagement";
         Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagments(engagementname, engagementtabname), "Failed to drag Engagements");
        Assert.assertTrue(Pages.CreateEngagementsInMomentsPage().createEngagements(), "Failed to create Engagements in moments page");

    }

    public boolean areaDialog(String areaValue, String areaDirection) {
        try {
            Pages.ModalDialog().pickValuesFromDropDown(areaDirection, 0);
            Pages.ModalDialog().selectCheckBoxValue(areaValue);
            Pages.DragAndDropTriggersPage().clickDoneButton();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }
}