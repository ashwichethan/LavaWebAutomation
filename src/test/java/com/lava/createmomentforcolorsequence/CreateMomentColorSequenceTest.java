package com.lava.createmomentforcolorsequence;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;

/**
 * Created by Dewesh Yadav on 3/7/2017.
 */
public class CreateMomentColorSequenceTest extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }

    @TestCaseId("TMS-4")

    @Test(priority = 1, testName = "Lava_TC4")
    public void navigateToCreateMomentsPage() {
        Assert.assertTrue(Pages.CreateNewMomentPage().createNewMomentsInMomentsPage(), "Failed to navigate to create new moment page ");
    }

    @Test(priority = 2, dataProvider = "colorSequence", dataProviderClass = ColorSequenceDataProvider.class, testName = "Lava_TC4")
    public void dragAndDropTrigger(String triggerTabName, String triggerName) {
        Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger(triggerName, triggerTabName), "Failed to drag profile");
    }

    @Test(priority = 3, dataProvider = "colorSequence", dataProviderClass = ColorSequenceDataProvider.class, testName = "Lava_TC4")
    public void dragAndDropProfiles(String profiletabname, String profilename) {
        Assert.assertTrue(Pages.DragAndDropProfilesPage().dragAndDropProfiles(profilename, profiletabname), "Failed to drag profile");
    }

    @Test(priority = 4, dataProvider = "colorSequence", dataProviderClass = ColorSequenceDataProvider.class, testName = "Lava_TC4")
    public void dragAndDropQualifiers(String qualifiertabname, String qualifiername) {
        Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiers(qualifiername, qualifiertabname), "Failed to drag Qualifier");

    }

    @Test(priority = 5, dataProvider = "colorSequence", dataProviderClass = ColorSequenceDataProvider.class, testName = "Lava_TC4")
    public void chooseColorSequence(String color1, String color2, String color3, String color4) {
        Pages.ModalDialog().pickValuesFromDropDown(color1, 0);
        Pages.ModalDialog().pickValuesFromDropDown(color2, 1);
        Pages.ModalDialog().pickValuesFromDropDown(color3, 2);
        Pages.ModalDialog().pickValuesFromDropDown(color4, 3);

        Pages.DragAndDropTriggersPage().clickDoneButton();
    }

    @Test(priority = 6, dataProvider = "colorSequence", dataProviderClass = ColorSequenceDataProvider.class, testName = "Lava_TC4")
    public void dragAndDropEngagments(String engagementtabname, String engagementname) {
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagments(engagementname, engagementtabname), "Failed to drag Engagements");
    }

    @Test(priority = 7, testName = "Lava_TC4")
    public void addMomentTitle() {
        Assert.assertTrue(Pages.CreateNewMomentPage().momentTitleName(), "Failed to add Moment Title");
    }

}
