package com.lava.engagementspage;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

/**
 * Created by tester on 22/12/16.
 */
public class MobileInAppNotificationOptimized extends Base {
    private static MobileInAppNotificationObjOptimized mi;

    public MobileInAppNotificationOptimized(){
        mi= new MobileInAppNotificationObjOptimized(driver);
    }

    public void enterSelectedType(String selectType){
        switch(selectType){
            case "TXT": selectType="Text message";
                                    break;
            case "VID" : selectType="Video";
                                    break;
            case "IMG": selectType="Image";
                                    break;
        }
        sleep(3000);
        for(WebElement enterValue : mi.list){
            if(enterValue.getText().equalsIgnoreCase(selectType)){
                sleep(2000);
                enterValue.click();
                break;
            }
        }
    }

    public void clickHeaderSelectType(){
        sleep(3000);
        MobileInAppNotificationObjOptimized.selectTypeFields.get(0).click();
        sleep(2000);
    }
    public void clickBodySelectType(int bodyPatternCount){
        sleep(3000);
        MobileInAppNotificationObjOptimized.selectTypeFields.get(bodyPatternCount).click();
        sleep(3000);
    }
    public void clickFooterSelectType(){
        sleep(3000);
//       MobileInAppNotifcationObj.selectTypeFields.get(2).click();
        MobileInAppNotificationObjOptimized.selectTypeFields.get(0).click();
        sleep(3000);
    }
    public void clickTextMessage(int tag){
        sleep(5000);
        switch(tag){
            case 0 : MobileInAppNotificationObjOptimized.message.get(0).click();
                break;
            case 1 :waitUntilElementIsVisible(MobileInAppNotifcationObj.messageText.get(1));
                MobileInAppNotificationObjOptimized.messageText.get(1).click();
                break;
            case 2: waitUntilElementIsVisible(MobileInAppNotifcationObj.messageText.get(2));
                MobileInAppNotificationObjOptimized.messageText.get(2).click();
                break;
        }
        sleep(2000);
    }
    public void clickVideo(int tag){
        sleep(3000);
        switch(tag){
            case 0 : MobileInAppNotificationObjOptimized.video.get(1).click();
                break;
            case 1 :waitUntilElementIsVisible(MobileInAppNotificationObjOptimized.videoText.get(4));
                MobileInAppNotificationObjOptimized.videoText.get(4).click();
                break;
            case 2: waitUntilElementIsVisible(MobileInAppNotificationObjOptimized.videoText.get(8));
                MobileInAppNotificationObjOptimized.videoText.get(8).click();
                break;
        }
        sleep(2000);
    }
    public void clickImage(int tag){
        sleep(3000);
        switch(tag){
            case 0 : MobileInAppNotificationObjOptimized.image.get(2).click();
                break;
            case 1 :waitUntilElementIsVisible(MobileInAppNotificationObjOptimized.imageText.get(2));
                MobileInAppNotificationObjOptimized.imageText.get(2).click();
                break;
            case 2: waitUntilElementIsVisible(MobileInAppNotificationObjOptimized.imageText.get(4));
                MobileInAppNotificationObjOptimized.imageText.get(4).click();
                break;
        }
        sleep(5000);
    }
    public void enterText(int indexCount){
        MobileInAppNotificationObjOptimized.textArea.get(indexCount).click();
        MobileInAppNotificationObjOptimized.textArea.get(indexCount).sendKeys("Text has been entered");
    }

    public void selectOfferVideo(int index){
        MobileInAppNotificationObjOptimized.offerVideo.get(index).click();
        sleep(3000);
        MobileInAppNotificationObjOptimized.offerList.click();
        sleep(5000);
    }

    public void selectImageOffer(int index){
        MobileInAppNotificationObjOptimized.offerImage.get(index).click(); //index value kept to handle TXT_IMG_VID
//        MobileInAppNotifcationObj.offerImage.get(0).click();

        sleep(3000);
        MobileInAppNotificationObjOptimized.offerList.click();
        //       mi.offerList.get(2).click();
        sleep(3000);
    }

    public void switchToPopUpAndScroll(){
        switchtoPopup(MobileInAppNotificationObjOptimized.popup);
        sleep(3000);
        scrollDown();
    }
    public void switchtoParent(){
        switchtoPopup(MobileInAppNotificationObjOptimized.parentPopUp);
        sleep(3000);
    }

    public void clickOnActionName(){
        waitUntilElementIsVisible(MobileInAppNotificationObjOptimized.actionName);
        MobileInAppNotificationObjOptimized.actionName.click();
    }
    public void enterActionName(String name){
        MobileInAppNotificationObjOptimized.actionName.sendKeys(name);
    }

    public void clickOnTitleField(){
        waitUntilElementIsVisible(MobileInAppNotificationObjOptimized.title);
        MobileInAppNotificationObjOptimized.title.click();
    }

    public void enterTitle(String title){
        MobileInAppNotificationObjOptimized.title.sendKeys(title);
    }

    public void clickOnSetEngagementButton(){
        waitUntilElementIsVisible(MobileInAppNotificationObjOptimized.setEngagement);
        MobileInAppNotificationObjOptimized.setEngagement.click();
    }

    public void doNothingFalse(int index){
        waitUntilElementIsVisible(MobileInAppNotificationObjOptimized.doNothing.get(index));
        MobileInAppNotificationObjOptimized.doNothing.get(index).click();
    }
}
