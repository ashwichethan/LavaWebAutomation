package com.lava.createmomentsrandomly;

import com.lava.Pages;
import com.lava.createmomentforarea.AreaDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

import java.io.IOException;

import static java.lang.Thread.sleep;

/**
 * Created by Dewesh Yadav on 4/20/2017.
 */
public class CreateMomentsRandomlyTest {

    @TestCaseId("TMS-3")
    @Title("Create Moments for any moments")
    @Test(dataProvider = "random", dataProviderClass = RandomDataProvider.class, testName = "Lava_TC3")
    public void createMomentsForArea(String triggerTabName, String triggerName, String profiletabname, String profilename, String qualifiertabname, String qualifiername, String engagementtabname, String engagementname) {

        try {
            Assert.assertTrue(Pages.CreateNewMomentPage().navigateToCreateMomentPage(), "Failed to drag profile");
            Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger(triggerName, triggerTabName), "Failed to drag profile");
            if (Pages.ModalDialog().isModalDialogDisplayed() == true) {
                Assert.assertTrue(handleDialogs(triggerTabName, "triggers.xlsx"), "No Dialogs to Handle");
            }
            Assert.assertTrue(Pages.DragAndDropProfilesPage().dragAndDropProfiles(profilename, profiletabname), "Failed to drag profile");
            sleep(1000);
            if (Pages.ModalDialog().isModalDialogDisplayed() == true) {
                Assert.assertTrue(handleDialogs(profiletabname, "profiles.xlsx"), "No Dialogs to Handle");
            }
            Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiers(qualifiername, qualifiertabname), "Failed to drag Qualifier");
            sleep(1000);
            if (Pages.ModalDialog().isModalDialogDisplayed() == true) {
                Assert.assertTrue(handleDialogs(qualifiertabname, "qualifiers.xlsx"), "No Dialogs to Handle");
            }
            Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagments(engagementname, engagementtabname), "Failed to drag Engagements");
            sleep(1000);
            if (Pages.ModalDialog().isModalDialogDisplayed() == true) {
                Assert.assertTrue(handleDialogs(engagementtabname, "engagement.xlsx"), "No Dialogs to Handle");
            }
            Assert.assertTrue(Pages.CreateNewMomentPage().momentTitle(), "Failed to add moment title");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean handleDialogs(String tabName, String fileName) throws IOException {

        Assert.assertTrue(Pages.handleAllDialogs().processDialogsElements(tabName, fileName), "Failed to Handle Dialogs");
        Pages.DragAndDropTriggersPage().clickDoneButton();
        return true;
    }
}
