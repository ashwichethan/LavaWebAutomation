package com.lava.profilespage;

import com.lava.createmomentspage.QualifiersRepo;
import com.lava.utils.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.lava.Pages;
import java.util.List;

/**
 * Created by jenkins on 15/03/17.
 */
public class ProfilesCreationPage extends Base{
    ProfilesCreationRepo pcRp;
    String profilesName;
    WebElement profile;
    public ProfilesCreationPage(){
        pcRp = new ProfilesCreationRepo(driver);
    }

    public boolean isDesignTabVisible() {
        waitUntilElementIsVisible(ProfilesCreationRepo.designTab);
        return true;
    }
    public boolean isProfilesTabVisible() {
        waitUntilElementIsVisible(ProfilesCreationRepo.profilesTab);
        return true;
    }
    public void clickDesignTab() {
        ProfilesCreationRepo.designTab.click();
    }

    public void clickProfilestab() {
        ProfilesCreationRepo.profilesTab.click();
    }

    public void waitUntilProfilesPageIsDisplayed(){
        waitUntilElementIsVisible(ProfilesCreationRepo.profilesPage);
    }

    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(ProfilesCreationRepo.spinnerOverlay);
    }
    public boolean waitUntilSuccesstoastMsgToBeInVisible() {
        waitForElementToBeInvisible(ProfilesCreationRepo.successToastMessage);
        return true;
    }
    public boolean isProfileNameFieldVisible() {
        isElementVisible(ProfilesCreationRepo.profileName);
        return true;
    }

    public boolean createProfiles() {
        refreshPage();
        if(isElementVisible(pcRp.spinnerOverlay)==true){
            waitUntilElementIsVisible(pcRp.spinnerOverlay);
        }

    navigateToProfilesPage();
    clickProfileNode();
        return true;
    }

public void navigateToProfilesPage(){
if(isElementVisible(ProfilesCreationRepo.isNodesVisibleProfile)==false) {
    isDesignTabVisible();
    clickDesignTab();
    isProfilesTabVisible();
    clickProfilestab();
    waitUntilProfilesPageIsDisplayed();
}
}
    String playerIDcsv = "/Users/Shared/Jenkins/IdeaProjects/lava_webautomation_localserver/src/main/java/com/lava/profilespage/segement_upload - player_id copy 2.csv";
    public void clickProfileNode() {
        List<WebElement> selectProfiles = ProfilesCreationRepo.selectProfileNode;
        System.out.println("Total profile nodes(types) : "+selectProfiles.size());

        for (int profileIndex = 0; profileIndex < selectProfiles.size(); profileIndex++) {
            profile = selectProfiles.get(profileIndex);
            sleep(1000);
            profilesName = profile.getText();
            System.out.println(profilesName);
            profile.click();
            sleep(2000);
            if(profilesName.equalsIgnoreCase("External List")==false) {
                waitUntilElementIsVisible(pcRp.modalDialog);
                isProfileNameFieldVisible();
                ProfilesCreationRepo.profileName.sendKeys(generateRandomNameforprofile());

                if(isElementVisible(ProfilesCreationRepo.DropdownBox)) {
                    ProfilesCreationRepo.DropdownBox.click();
                    ProfilesCreationRepo.selectFromDropdownBox.get(1).click();
                    System.out.println("Element selected from the list is " + ProfilesCreationRepo.selectFromDropdownBox.get(1).getText());
                    ProfilesCreationRepo.setProfile.click();
                    profileCreated();
                }
                else {
                    ProfilesCreationRepo.setProfile.click();
                    profileCreated();
                }

            }
            else {
                ProfilesCreationRepo.playerIds.click();
                sleep(500);
                ProfilesCreationRepo.nextBtn.click();
                try {
                    ProfilesCreationRepo.fileUploadBtn.sendKeys(playerIDcsv);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                sleep(1000);
                ProfilesCreationRepo.nextBtn.click();
                ProfilesCreationRepo.enterName.sendKeys(generateRandomName());
                ProfilesCreationRepo.saveBtn.click();
                profileCreated();

            }
        }
    }
    public void profileCreated(){
        waitUntilElementIsVisible(ProfilesCreationRepo.successToastMessage);
        String successMessage = ProfilesCreationRepo.getSuccessToastMessage.getText();
        waitUntilSuccesstoastMsgToBeInVisible();
        System.out.println("Success toast message is: " + successMessage);
        System.out.println("Profile created successfully of " + profilesName);
        System.out.println();
    }





    }




