package com.lava.momentNode;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 24/07/17.
 */
public class MomentView extends Base {
    MomentViewRepo mVr;

    public MomentView() {mVr = new MomentViewRepo(driver);}

    public void waitForSpinnerToBeInVisible() {waitForElementToBeInvisible(mVr.spinnerOverlay);}

    public void navigateToMomentsPage() {
        if(isElementVisible(mVr.momentsPageTitle)==false) {
            mVr.designTab.click();
            sleep(1000);
            mVr.momentsTab.click();
            sleep(2000);
            waitForSpinnerToBeInVisible();
            sleep(1000);
            if (isElementVisible(mVr.spinnerOverlay)) {
                waitForSpinnerToBeInVisible();

            }
        }
    }


    public boolean momentsTriggerMatching() {
        refreshPage();
        if (isElementVisible(mVr.spinnerOverlay)) {
            waitForSpinnerToBeInVisible();
        }
        navigateToMomentsPage();
        List<WebElement> momentsList = mVr.momentsList;

        for (int index = 0; index < 3; index++) {
            WebElement moment = momentsList.get(index);
            String name = moment.getText();
            System.out.println("Moment name is : " + name);
            moment.click();
            String trigger = mVr.momentTriggerName.getText();
            waitUntilElementIsVisible(mVr.momentView);
            mVr.momentView.click();
            sleep(2000);
            if (isElementVisible(mVr.spinnerOverlay)) {
                waitForSpinnerToBeInVisible();
            }
            sleep(1000);
            waitUntilElementIsVisible(mVr.triggerName);
            String triggerName = mVr.triggerName.getText();
        if(trigger.equalsIgnoreCase(triggerName)==false){
            return false;
        }
        break;
        }
        return true;
    }

    public Boolean totalTriggered(){
        String totalTriggered =mVr.totalTriggered.getText();
        return (totalTriggered.contains("total triggered"));
    }

    public Boolean individualsTriggered(){
        String individualsTriggered =mVr.individualsTriggered.getText();
        return (individualsTriggered.contains("individuals triggered"));
    }

    public Boolean eligible(){
        String eligible =mVr.eligible.getText();
        return (eligible.contains("eligible"));
    }
    public Boolean eligibleCompareBtnVisible(){
        return isElementVisible(mVr.eligibleCompareBtn);
    }
    public String eligibleCompareBtn(){
        String eligibleCompareBtn =mVr.eligibleCompareBtn.getText();
        return eligibleCompareBtn;
    }
    public Boolean qualifierCompareBtnVisible(){
        return isElementVisible(mVr.qualifierCompareBtn);
    }
    public String qualifierCompareBtn(){
        String qualifierCompareBtn =mVr.qualifierCompareBtn.getText();
        return qualifierCompareBtn;
    }
    public Boolean qualified(){
        String qualified =mVr.qualified.getText();
        return (qualified.contains("qualified"));
    }
    public Boolean engagements(){
        String engagements =mVr.engagements.getText();
        return (engagements.contains("engagements"));
    }
    public Boolean engaged(){
        String engaged =mVr.engaged.getText();
        return (engaged.contains("engaged"));
    }




}