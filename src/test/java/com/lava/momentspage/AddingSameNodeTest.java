package com.lava.momentspage;

import com.lava.Pages;
import com.lava.base.TestBase;
import com.lava.createmomentforarea.*;
import com.lava.createmomentforarea.AreaDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import org.testng.annotations.BeforeSuite;
/**
 * Created by jenkins on 17/07/17.
 */
public class AddingSameNodeTest extends TestBase {
//
//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


//incomplete test case, error in drag and drop of 2nd nodes

    @TestCaseId("TMS-3")
    @Title("Create Moments for Area")
    @Test(dataProvider = "area", dataProviderClass = AreaDataProvider.class, testName = "Lava_TC3")
    public void adddAndRemoveNodes(String triggerTabName, String triggerName, String areaDirection, String areaValue, String profiletabname, String profilename, String qualifiertabname, String qualifiername, String engagementtabname, String engagementname) {

        Assert.assertTrue(Pages.CreateNewMomentPage().createNewMomentsInMomentsPage(), "Failed to navigate to moment creation page");
        Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger(triggerName, triggerTabName), "Failed to drag trigger");
        Assert.assertTrue(areaDialog(areaValue, areaDirection), "Failed to add data to Area pop up");
        Assert.assertTrue(Pages.DragAndDropProfilesPage().dragAndDropProfiles(profilename, profiletabname), "Failed to drag profile");
        Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiers(qualifiername, qualifiertabname), "Failed to drag Qualifier");
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagments(engagementname, engagementtabname), "Failed to drag Engagements");

        Assert.assertTrue(Pages.DragAndDropTriggersPage().clickTriggerColumn(), "Failed to click trigger column");
        Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger2(triggerName, triggerTabName), "Failed to drag 2nd trigger");
        Assert.assertTrue(Pages.DragAndDropTriggersPage().getWarningToastForTrigger(), "Failed to get warning toast for trigger");
        Assert.assertTrue(Pages.DragAndDropProfilesPage().dragAndDropProfiles2(profilename, profiletabname), "Failed to drag 2nd profile");
        Assert.assertTrue(Pages.DragAndDropProfilesPage().getWarningToastForProfiles(), "Failed to get warning toast for profile");
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().clickEngageWithColumn(), "Failed to click EngageWith column");
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagments2(engagementname, engagementtabname), "Failed to drag 2nd Engagement");
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().getWarningToastForEngagements(), "Failed to get warning toast for Engagement");




        // Assert.assertTrue(Pages.CreateNewMomentPage().momentTitle(), "Failed to add moment title");

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
