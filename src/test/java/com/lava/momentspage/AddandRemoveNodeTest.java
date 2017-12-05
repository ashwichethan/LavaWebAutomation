package com.lava.momentspage;

import com.lava.Pages;
import com.lava.base.TestBase;
import com.lava.createmomentforarea.AreaDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import org.testng.annotations.BeforeSuite;
/**
 * Created by Dewesh Yadav on 3/7/2017.
 */
public class AddandRemoveNodeTest extends TestBase {


//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }



    @TestCaseId("TMS-3")
    @Title("Create Moments for Area")
    @Test(dataProvider = "area", dataProviderClass = com.lava.createmomentforarea.AreaDataProvider.class, testName = "Lava_TC3")
    public void adddAndRemoveNodes(String triggerTabName, String triggerName, String areaDirection, String areaValue, String profiletabname, String profilename, String qualifiertabname, String qualifiername, String engagementtabname, String engagementname) {

        Assert.assertTrue(Pages.CreateNewMomentPage().createNewMomentsInMomentsPage(), "Failed to navigate to moment creation page");
        Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger(triggerName, triggerTabName), "Failed to drag trigger");
        Assert.assertTrue(areaDialog(areaValue, areaDirection), "Failed to add data to Area pop up");
        Assert.assertTrue(Pages.DragAndDropProfilesPage().dragAndDropProfiles(profilename, profiletabname), "Failed to drag profile");
        Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiers(qualifiername, qualifiertabname), "Failed to drag Qualifier");
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagments(engagementname, engagementtabname), "Failed to drag Engagements");

        //Here numbers 0:trigger, 1:Profile, 2:Qualifier and 3:Engagement
        Assert.assertTrue(Pages.AddAndRemoveNode().clickRemoveBtn(3), "Failed to click Remove button of Engagement");
        Assert.assertTrue(Pages.AddAndRemoveNode().remove(3), "Failed to Remove Engagement");

        Assert.assertTrue(Pages.AddAndRemoveNode().scrollOnNode(2), "Failed to scroll on Qualifier");
        Assert.assertTrue(Pages.AddAndRemoveNode().clickRemoveBtn(2), "Failed to click Remove button of Qualifier");
        Assert.assertTrue(Pages.AddAndRemoveNode().remove(2), "Failed to Remove Qualifier");

        Assert.assertTrue(Pages.AddAndRemoveNode().scrollOnNode(1), "Failed to scroll on Profile");
        Assert.assertTrue(Pages.AddAndRemoveNode().clickRemoveBtn(1), "Failed to click Remove button of Profile");
        Assert.assertTrue(Pages.AddAndRemoveNode().remove(1), "Failed to Remove Profile");

        Assert.assertTrue(Pages.AddAndRemoveNode().scrollOnNode(0), "Failed to scroll on Trigger");
        Assert.assertTrue(Pages.AddAndRemoveNode().clickRemoveBtn(0), "Failed to click Remove button of Trigger");
        Assert.assertTrue(Pages.AddAndRemoveNode().remove(0), "Failed to Remove Trigger");
        Assert.assertTrue(Pages.AddAndRemoveNode().navigateHome(), "Failed navigation Home");


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
