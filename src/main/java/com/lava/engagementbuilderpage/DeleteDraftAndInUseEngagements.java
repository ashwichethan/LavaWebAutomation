package com.lava.engagementbuilderpage;

import com.lava.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by jenkins on 02/08/17.
 */
public class DeleteDraftAndInUseEngagements extends Base {
    DeleteDraftAndInUseEngagementsRepo dUeR;
    public DeleteDraftAndInUseEngagements(){dUeR = new DeleteDraftAndInUseEngagementsRepo(driver);}
    static  String momentName;

    public boolean navigateEngagemnetsPage(){
        if(isElementVisible(dUeR.isNodesVisibleEngagement)==false) {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            dUeR.designTab.click();
            waitUntilElementIsVisible(dUeR.engagementsTab);
            dUeR.engagementsTab.click();
            waitUntilElementIsVisible(dUeR.engagementsPage);
            sleep(3000);
        }
        return true;
    }

    public boolean deleteEngagement(){

        List<WebElement> profiles = dUeR.ProfileNameAutomation;
        System.out.println("Total deletable profiles: "+profiles.size());
            for(int index=0; index<profiles.size(); index++){
                WebElement profile = profiles.get(index);
                scrollToElement(profile);
                String profileName = profile.getText();
                System.out.println("Profile name: "+profileName);
                profile.click();
                if(engStatus().equalsIgnoreCase("status-unused")){
                    clickDeleteButton();
                }
                else {
                    mouseHoverOnElement(profile);
                    sleep(100);
                    String statusDescription = dUeR.statusDescription.getText();
                    momentName = statusDescription.replace("Used by ", "");
                    System.out.println("Status description says moment name is: "+momentName);
                    eSc.navigateMomentsPage();

                }
            }
        return true;
    }


    public boolean bringMomentToDraftState(){

        isElementVisible(driver.findElement(By.xpath("//td[contains(.,'"+momentName+"')]")));
        driver.findElement(By.xpath("//td[contains(.,'"+momentName+"')]")).click();
        if(engStatus().equalsIgnoreCase("")){
            
        }


//        isElementVisible(CreateNewMomentObjRepo.submitBtn);
//        CreateNewMomentObjRepo.submitBtn.click();
//        sleep(1000);
//        waitForSpinnerToBeInVisible();
//        if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
//            waitForSpinnerToBeInVisible();
//        }

        return true;
    }


    EngagementStatusCheck eSc = new EngagementStatusCheck();

    public String engStatus(){

        sleep(1000);
        String className = dUeR.statusofEng.getAttribute("class");
        return className;

    }

    public void clickDeleteButton(){
        dUeR.deleteBtn.click();
        sleep(1000);
        DeleteEngagementsRepo.modalDialog.click();;
        dUeR.modalDialog.click();
        scrollToElement(dUeR.deleteBtnInDialog);
        dUeR.deleteBtnInDialog.click();
        sleep(2000);
        waitUntilElementIsVisible(DeleteEngagementsRepo.successToastMessage);
        String successmsg = dUeR.getSuccessToastMessage.getText();
        System.out.println("Delete success toast message is : " + successmsg);
        waitForElementToBeInvisible(DeleteEngagementsRepo.spinnerOverlay);
        sleep(2000);
    }





}
