package com.lava.createmomentforinventory;

import com.lava.Pages;
import com.lava.base.TestBase;
import com.lava.createmomentforcolorsequence.ColorSequenceDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import java.io.IOException;
import java.util.List;

/**
 * Created by Dewesh Yadav on 3/7/2017.
 */
public class CreateMomentInventoryTest extends TestBase {

    @TestCaseId("TMS-4")

    @Test(priority = 1, testName = "Lava_TC4")
    public void navigateToCreateMomentsPage() {
        Assert.assertTrue(Pages.CreateNewMomentPage().navigateToCreateMomentPage(), "Failed to drag profile");
    }

    @Test(priority = 2, dataProvider = "Inventory", dataProviderClass = InventoryDataProvider.class, testName = "Lava_TC4")
    public void dragAndDropTrigger(String triggerTabName, String triggerName, String dropDownValue1, String dropDownValue2, String dropDownValue3, String dropDownValue4, String Thresold) throws IOException {
        Assert.assertTrue(Pages.DragAndDropTriggersPage().dragAndDropTrigger(triggerName, triggerTabName), "Failed to drag profile");
        List popUpElments = Pages.readPopUpValues().pickJsonValuesForDialogElements(triggerTabName, "triggers.xlsx", "Inventory");
        for (int elementsCount = 0; elementsCount < popUpElments.size(); elementsCount++) {
            Object elements = popUpElments.get(elementsCount);
            if (elements.toString().equalsIgnoreCase("DropDownBox")) {
                Pages.ModalDialog().pickValuesFromDropDown(dropDownValue1, 0);
                Pages.ModalDialog().pickValuesFromDropDown(dropDownValue2, 1);
                Pages.ModalDialog().pickValuesFromDropDown(dropDownValue3, 2);
                Pages.ModalDialog().pickValuesFromDropDown(dropDownValue4, 3);
            } else if (elements.toString().equalsIgnoreCase("textBox,int")) {
                Pages.ModalDialog().enterValuesInTextBox(Thresold, "0");

            }
        }
    }

    @Test(priority = 3, dataProvider = "Inventory", dataProviderClass = InventoryDataProvider.class, testName = "Lava_TC4")
    public void dragAndDropProfiles(String profiletabname, String profilename) {
        Assert.assertTrue(Pages.DragAndDropProfilesPage().dragAndDropProfiles(profilename, profiletabname), "Failed to drag profile");
    }

    @Test(priority = 4, dataProvider = "Inventory", dataProviderClass = InventoryDataProvider.class, testName = "Lava_TC4")
    public void dragAndDropQualifiers(String qualifiertabname, String qualifiername) {
        Assert.assertTrue(Pages.DragAndDropQualifiersPage().dragAndDropQualifiers(qualifiername, qualifiertabname), "Failed to drag Qualifier");

    }

//  @Test(priority = 5,dataProvider = "inventory", dataProviderClass = ColorSequenceDataProvider.class,testName = "Lava_TC4")
//  public void chooseColorSequence(String color1,String color2,String color3,String color4){
//    Pages.ModalDialog().pickValuesFromDropDown(color1,0);
//    Pages.ModalDialog().pickValuesFromDropDown(color2,1);
//    Pages.ModalDialog().pickValuesFromDropDown(color3,2);
//    Pages.ModalDialog().pickValuesFromDropDown(color4,3);
//
//    Pages.DragAndDropTriggersPage().clickDoneButton();
//  }

    @Test(priority = 5, dataProvider = "Inventory", dataProviderClass = InventoryDataProvider.class, testName = "Lava_TC4")
    public void dragAndDropEngagments(String engagementtabname, String engagementname) {
        Assert.assertTrue(Pages.DragAndDropEngagmentPage().dragAndDropEngagments(engagementname, engagementtabname), "Failed to drag Engagements");
    }

    @Test(priority = 6, testName = "Lava_TC4")
    public void addMomentTitle() {
        Assert.assertTrue(Pages.CreateNewMomentPage().momentTitle(), "Failed to add Moment Title");
    }

}
