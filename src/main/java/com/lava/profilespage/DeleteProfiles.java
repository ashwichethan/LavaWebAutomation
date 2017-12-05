package com.lava.profilespage;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;
import com.lava.Pages;
import java.util.List;

/**
 * Created by jenkins on 08/05/17.
 */
public class DeleteProfiles extends Base {
    DeleteProfilesRepo DePr;
ProfilesCreationPage Pcp = new ProfilesCreationPage();
    public DeleteProfiles(){
        DePr = new DeleteProfilesRepo(driver);
    }


    public boolean deleteProfiles(){
        refreshPage();
        if(isElementVisible(DeleteProfilesRepo.spinnerOverlay)==true){
            waitUntilElementIsVisible(DeleteProfilesRepo.spinnerOverlay);
        }

        Pcp.navigateToProfilesPage();
        int count =0;
        List<WebElement> profilesInList = DeleteProfilesRepo.profilesInList;
        for(int index =0; index<profilesInList.size(); index++ ) {
            WebElement profile = profilesInList.get(index);
            String profileName = profile.getText();
            scrollToElement(profile);
            //mouseHoverOnElement(profile);
            if(profileName.contains("Automation")){
                profile.click();
                sleep(500);
                    if(isElementVisible(DeleteProfilesRepo.availableState)==true){
                    ++count;
                    clickDeleteButton();
                    --index;
                }
                else{
                    System.out.println("Profile is not in available state");

                }

            }


        }
        System.out.println("Total profiles deleted "+count);
        return true;
    }
    public boolean waitUntilDeleteModal() {
        waitUntilElementIsVisible(DeleteProfilesRepo.deleteBtnInDialog);
        return true;
    }
    public boolean waitUntilSuccesstoastMsg() {
        waitUntilElementIsVisible(DeleteProfilesRepo.successToastMessage);
        return true;
    }
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(DeleteProfilesRepo.spinnerOverlay);
    }
    public void clickDeleteButton(){
        DeleteProfilesRepo.deleteBtn.click();
        waitUntilDeleteModal();
        scrollToElement(DeleteProfilesRepo.deleteBtnInDialog);
        DeleteProfilesRepo.deleteBtnInDialog.click();
        sleep(2000);
        waitUntilSuccesstoastMsg();
        String successmsg = DeleteProfilesRepo.getSuccessToastMessage.getText();
        System.out.println("Delete success toast message is : " + successmsg);
        sleep(1000);
    }


}
