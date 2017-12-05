package com.lava.engagementbuilderpage;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by jenkins on 25/07/17.
 */
public class EngagementPopup extends Base {
    EngagementPopupRepo ePr;
    public EngagementPopup(){ePr = new EngagementPopupRepo(driver);}


    public void navigateToEngagements(){
        refreshPage();
        if(isElementVisible(ePr.spinnerOverlay)==true){
            waitUntilElementIsVisible(ePr.spinnerOverlay);
        }
        if(isElementVisible(ePr.isNodesVisibleEngagement)==false) {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            ePr.designTab.click();
            waitUntilElementIsVisible(ePr.engagementsTab);
            ePr.engagementsTab.click();
            waitUntilElementIsVisible(ePr.engagementsPage);
            sleep(3000);
        }
    }


    public Object[] nodes(){
        navigateToEngagements();
        List<WebElement> engagementNodes = ePr.engagementNodes;
        String s[] = new String[engagementNodes.size()];

        for(int index=0;index<engagementNodes.size(); index++){
         WebElement nodes =engagementNodes.get(index);
         scrollToElement(nodes);
            String  name = nodes.getText();
            System.out.println(name);
            s[index]=name;
        }
        System.out.println(s);
        return s;
    }





}
