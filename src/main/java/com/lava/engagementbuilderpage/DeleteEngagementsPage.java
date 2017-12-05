package com.lava.engagementbuilderpage;

import com.lava.profilespage.ProfilesCreationRepo;
import com.lava.utils.Base;
import org.openqa.selenium.WebElement;
import com.lava.Pages;
import java.util.List;

/**
 * Created by jenkins on 18/05/17.
 */
public class DeleteEngagementsPage extends Base{
    DeleteEngagementsRepo DePg;
    public DeleteEngagementsPage(){DePg = new DeleteEngagementsRepo(driver);}
public boolean isEngagementinAvailableState(){
    isElementVisible(DeleteEngagementsRepo.statusOfSelectedEngagement);
     return true;
}
    EngagementsCreationPage enC = new EngagementsCreationPage();

    public boolean deleteEngagement(){
        refreshPage();
        if(isElementVisible(DePg.spinnerOverlay)==true){
            waitUntilElementIsVisible(DePg.spinnerOverlay);
        }
       enC.goToEngagementPage();
    delete();
    return true;
    }


    public void delete(){
        int count =0;
        List<WebElement> selectEngagementtoDelete = DeleteEngagementsRepo.engagementName;
        for(int index =0; index<selectEngagementtoDelete.size(); index++ ) {
            WebElement engagement = selectEngagementtoDelete.get(index);
            String engName = engagement.getText();
            scrollToElement(engagement);
            if(engName.contains("Automation")){
                engagement.click();
                sleep(1000);

                    if(isEngagementinAvailableState()==true){
                    clickDeleteButton();
                    ++count;
                    --index;
                }
                else{
                    System.out.println("Engagement is not in Available state");
                }

            }


        }
        System.out.println("Total deleted "+count);
    }
    public boolean waitUntilDeleteModal() {
        DeleteEngagementsRepo.modalDialog.click();;
        return true;
    }
    public boolean waitUntilSuccesstoastMsg() {
        waitUntilElementIsVisible(DeleteEngagementsRepo.successToastMessage);
        return true;
    }
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(DeleteEngagementsRepo.spinnerOverlay);
    }
    public void clickDeleteButton(){
        DeleteEngagementsRepo.deleteBtn.click();
        sleep(1000);
        waitUntilDeleteModal();
        DeleteEngagementsRepo.modalDialog.click();
        scrollToElement(DeleteEngagementsRepo.deleteBtnInDialog);
        DeleteEngagementsRepo.deleteBtnInDialog.click();
        sleep(2000);
        waitUntilSuccesstoastMsg();
        String successmsg = DeleteEngagementsRepo.getSuccessToastMessage.getText();
        System.out.println("Delete success toast message is : " + successmsg);
        waitForSpinnerToBeInVisible();
        sleep(2000);
    }




}
