package com.lava.engagementspage;

import com.lava.utils.Base;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


/**
 * Created by codecraft on 25/11/16.
 */
public class MobileInAppNotification extends Base {

    private static MobileInAppNotifcationObj mi;

    public MobileInAppNotification(){
        mi= new MobileInAppNotifcationObj(driver);
    }

    public void clickHeaderSelectType(){
        sleep(3000);
        MobileInAppNotifcationObj.selectTypeFields.get(0).click();
        sleep(2000);
    }
    public void clickBodySelectType(int bodyPatternCount){
        sleep(3000);
        MobileInAppNotifcationObj.selectTypeFields.get(bodyPatternCount).click();
        sleep(3000);
    }
    public void clickFooterSelectType(){
        sleep(3000);
//       MobileInAppNotifcationObj.selectTypeFields.get(2).click();
        MobileInAppNotifcationObj.selectTypeFields.get(0).click();
        sleep(3000);
    }
    public void clickTextMessage(int tag){
        sleep(5000);
        switch(tag){
            case 0 : MobileInAppNotifcationObj.message.get(0).click();
                break;
            case 1 :waitUntilElementIsVisible(MobileInAppNotifcationObj.messageText.get(1));
                MobileInAppNotifcationObj.messageText.get(1).click();
                break;
            case 2: waitUntilElementIsVisible(MobileInAppNotifcationObj.messageText.get(2));
                MobileInAppNotifcationObj.messageText.get(2).click();
                break;
        }
        sleep(2000);
    }
    public void clickVideo(int tag){
        sleep(3000);
        switch(tag){
            case 0 : MobileInAppNotifcationObj.video.get(1).click();
                     break;
            case 1 :waitUntilElementIsVisible(MobileInAppNotifcationObj.videoText.get(4));
                     MobileInAppNotifcationObj.videoText.get(4).click();
                     break;
            case 2: waitUntilElementIsVisible(MobileInAppNotifcationObj.videoText.get(8));
                    MobileInAppNotifcationObj.videoText.get(8).click();
                    break;
        }
        sleep(2000);
    }
    public void clickImage(int tag){
        sleep(3000);
        switch(tag){
            case 0 : MobileInAppNotifcationObj.image.get(2).click();
                break;
            case 1 :waitUntilElementIsVisible(MobileInAppNotifcationObj.imageText.get(2));
                MobileInAppNotifcationObj.imageText.get(2).click();
                break;
            case 2: waitUntilElementIsVisible(MobileInAppNotifcationObj.imageText.get(4));
                MobileInAppNotifcationObj.imageText.get(4).click();
                break;
        }
        sleep(5000);
    }
    public void enterText(int indexCount){
        MobileInAppNotifcationObj.textArea.get(indexCount).click();
        MobileInAppNotifcationObj.textArea.get(indexCount).sendKeys("Text has been entered");
    }

    public void selectOfferVideo(int index){
        MobileInAppNotifcationObj.offerVideo.get(index).click();
        sleep(3000);
        MobileInAppNotifcationObj.offerList.click();
        sleep(5000);
    }

    public void selectImageOffer(int index){
        MobileInAppNotifcationObj.offerImage.get(index).click(); //index value kept to handle TXT_IMG_VID
//        MobileInAppNotifcationObj.offerImage.get(0).click();

        sleep(3000);
        MobileInAppNotifcationObj.offerList.click();
 //       mi.offerList.get(2).click();
        sleep(3000);
    }

    public void switchToPopUpAndScroll(){
        switchtoPopup(MobileInAppNotifcationObj.popup);
        sleep(3000);
        scrollDown();
    }
    public void switchtoParent(){
    switchtoPopup(MobileInAppNotifcationObj.parentPopUp);
        sleep(3000);
    }

    public void clickOnActionName(){
        waitUntilElementIsVisible(MobileInAppNotifcationObj.actionName);
        MobileInAppNotifcationObj.actionName.click();
    }
    public void enterActionName(String name){
        MobileInAppNotifcationObj.actionName.sendKeys(name);
    }

    public void clickOnTitleField(){
        waitUntilElementIsVisible(MobileInAppNotifcationObj.title);
        MobileInAppNotifcationObj.title.click();
    }

    public void enterTitle(String title){
        MobileInAppNotifcationObj.title.sendKeys(title);
    }

    public void clickOnSetEngagementButton(){
        waitUntilElementIsVisible(MobileInAppNotifcationObj.setEngagement);
        MobileInAppNotifcationObj.setEngagement.click();
    }

    public void doNothingFalse(int index){
        waitUntilElementIsVisible(MobileInAppNotifcationObj.doNothing.get(index));
        MobileInAppNotifcationObj.doNothing.get(index).click();
    }
}
