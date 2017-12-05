package com.lava.engagementspage;

import com.lava.Pages;
import com.lava.modaldialog.ModalDialog;
import com.lava.utils.Base;
import com.lava.utils.PropertyReader;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

/**
 * Created by codecraft on 25/11/16.
 */
public class EngagementPage extends Base {

    EngagementPageObjectRepo ep;



    public EngagementPage(){
        ep = new EngagementPageObjectRepo(driver);
    }


    public boolean isEngagementPageDisplayed(){
        return isElementVisible(ep.engagementsPage);
    }

    public void waitUntilEngagementPageIsDisplayed(){
        waitUntilElementIsVisible(ep.engagementsPage);
    }

    public void clickMobileInAppNotificationType(){
        clickEngagementType(ep.MobileInAppNotification);
        sleep(10000);
     //   Pages.ModalDialog().waitUntillPopUpIsDisplayed();
    }


    private void clickEngagementType(String engagementTypeText){
        for(WebElement engagementType: ep.engagementTypes){
            if(!isElementVisible(engagementType)){
                scrollToElement(engagementType);
                waitUntilElementIsVisible(engagementType);
            }
            System.out.println(engagementType.getText());
            if(engagementType.getText().equalsIgnoreCase(engagementTypeText)){
                sleep(3000);
                engagementType.click();
                break;
            }
        }
    }

    private void getNotificationPattern(){
      // String[] inAppPattern = PropertyReader.getPropValues("inAppPattern.properties");

    }
    public void clickMobileInappNotificationButton(){
        waitUntilElementIsVisible(ep.mobileInAppButton);
        sleep(30000);
        ep.mobileInAppButton.click();
        Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
    }

}
