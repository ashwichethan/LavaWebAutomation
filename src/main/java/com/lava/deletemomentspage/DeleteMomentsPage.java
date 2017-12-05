package com.lava.deletemomentspage;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 20/03/17.
 */
public class DeleteMomentsPage extends Base {
    DeleteMomentsRepo DlMr;
    public  DeleteMomentsPage(){
        DlMr= new DeleteMomentsRepo(driver);
    }

    public boolean isMomentsTabVisible(){
        return isElementVisible(DeleteMomentsRepo.momentsTab);}



    public boolean DeleteMoments(){
        openMomentsPage();
        delete();
        return true;

}
public void openMomentsPage() {

    refreshPage();
    if(isElementVisible(DlMr.spinnerOverlay)==true){
        waitForElementToBeInvisible(DlMr.spinnerOverlay);
    }
        if(isElementVisible(DlMr.momentsPageTitle)==false){
            DeleteMomentsRepo.designTab.click();
            isMomentsTabVisible();
            DeleteMomentsRepo.momentsTab.click();
            waitForSpinnerToBeInVisible();
            if(isElementVisible(DlMr.spinnerOverlay)==true){
                waitForElementToBeInvisible(DlMr.spinnerOverlay);
            }
            sleep(1000);
        }
    if(isElementVisible(DlMr.spinnerOverlay)==true){
        waitForElementToBeInvisible(DlMr.spinnerOverlay);
    }
}

public void delete(){
    int count =0;
    List<WebElement> allmomentslist = DeleteMomentsRepo.momentsList;
    for(int momentindex =0; momentindex<allmomentslist.size(); momentindex++ ) {
        WebElement moment = allmomentslist.get(momentindex);
        scrollToElement(moment);
        String momentName = moment.getText();
        if(momentName.contains("Automation")){
            moment.click();
            if(isElementVisible(DlMr.momentDraftState)==true){
                clickDeleteButton();
                ++count;
                --momentindex;
            }
        }
    }
    System.out.println("Total deleted : "+count);
}

    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(DeleteMomentsRepo.spinnerOverlay);
    }
    public void clickDeleteButton(){
        DeleteMomentsRepo.deleteBtn.click();
        waitUntilElementIsVisible(DeleteMomentsRepo.deleteBtnInDialog);
        DeleteMomentsRepo.deleteBtnInDialog.click();
        waitUntilElementIsVisible(DeleteMomentsRepo.successToastMessage);
        String successmsg = DeleteMomentsRepo.getSuccessToastMessage.getText();
        System.out.println("Delete success toast message is : " + successmsg);
        waitForElementToBeInvisible(DeleteMomentsRepo.successToastMessage);
        if(isElementVisible(DlMr.spinnerOverlay)==true){
            waitForElementToBeInvisible(DlMr.spinnerOverlay);
        }
    }

}
