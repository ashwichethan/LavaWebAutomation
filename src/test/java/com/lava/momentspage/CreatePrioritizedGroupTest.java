package com.lava.momentspage;

import com.lava.Pages;
import com.lava.base.TestBase;
import com.lava.createmomentforarea.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import org.testng.annotations.BeforeSuite;
/**
 * Created by jenkins on 14/07/17.
 */
public class CreatePrioritizedGroupTest extends TestBase {

//        @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }
    
    @TestCaseId("TMS-3")
    @Title("Create Moments for Area")
    @Test(dataProvider = "area", dataProviderClass = com.lava.createmomentforarea.AreaDataProvider.class, testName = "Lava_TC3")
    public void createPrioritizedGroups(String triggerTabName, String triggerName, String areaDirection, String areaValue, String profiletabname, String profilename, String qualifiertabname, String qualifiername, String engagementtabname, String engagementname) {

        Assert.assertTrue(Pages.CreateNewMomentPage().navigateToCreateMomentPage(), "Failed to navigate to moment creation page");
        Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger(triggerName, triggerTabName), "Failed to drag profile");
        Assert.assertTrue(areaDialog(areaValue, areaDirection), "Failed to add data to Area pop up");
        Assert.assertTrue(Pages.DragAndDropProfilesPage().dragAndDropProfiles(profilename, profiletabname), "Failed to drag profile");
        Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiers(qualifiername, qualifiertabname), "Failed to drag Qualifier");
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagments(engagementname, engagementtabname), "Failed to drag Engagements");

        Assert.assertTrue(Pages.CreatePrioritizedGroups().clickPrioritizedBtn(), "Failed to click Prioritized button");
        Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiersPriotz(qualifiername, qualifiertabname), "Failed to drag Qualifier");
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagmentsPrioritz(engagementname, engagementtabname), "Failed to drag Engagements");

        Assert.assertTrue(Pages.CreateNewMomentPage().momentTitleName(), "Failed to add moment title");

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
