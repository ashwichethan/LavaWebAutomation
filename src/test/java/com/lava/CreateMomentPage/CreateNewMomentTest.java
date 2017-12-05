package com.lava.CreateMomentPage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.TestCaseId;

/**
 * Created by jenkins on 3/7/2017.
 */
public class CreateNewMomentTest extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }
    @TestCaseId("TMS-3")
    @Test(priority = 1, dataProvider = "area", dataProviderClass = momentsDataProvider.class, testName = "Lava_TC2")
    public void createMoments(String triggerTabName, String triggerName, String areaValue, String Directions, String profiletabname, String profilename, String qualifiertabname, String qualifiername, String engagementtabname, String engagementname) {

        //System.out.println("data provider values are: "+triggerTabName+ "\n"+triggerName+"\n"+profiletabname+"\n"+profilename+"\n"+qualifiertabname+"\n"+qualifiername+"\n"+engagementtabname+"\n"+engagementname);
        Assert.assertTrue(Pages.CreateNewMomentPage().navigateToCreateMomentPage(), "Failed to drag profile");
        Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger(triggerName, triggerTabName), "Failed to drag profile");
        areaDialog(areaValue, Directions);
        Assert.assertTrue(Pages.DragAndDropProfilesPage().dragAndDropProfiles(profilename, profiletabname), "Failed to drag profile");
        Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiers(qualifiername, qualifiertabname), "Failed to drag Qualifier");
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagments(engagementname, engagementtabname), "Failed to drag Engagements");
        Assert.assertTrue(Pages.CreateNewMomentPage().momentTitle(), "Failed to drag profile");

    }

    public void areaDialog(String areaValue, String directions) {
        sleep(2000);
        Pages.ModalDialog().pickValuesFromDropDown(directions, 0);
        Pages.ModalDialog().selectCheckBoxValue(areaValue);
        Pages.DragAndDropTriggersPage().clickDoneButton();

  }


}
