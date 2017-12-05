package com.lava.momentdashboard;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 24/05/17.
 */
public class MomentDashboard1 extends Base {
    MomentDashboard1Repo MdBr;
    public MomentDashboard1(){MdBr = new MomentDashboard1Repo(driver);}
    public void waitForSpinnerToBeInvisible(){waitForElementToBeInvisible(MomentDashboard1Repo.loadingSpinner);}


public void navigate(){
        try {
            MomentDashboard1Repo.analyzeTab.click();}
        catch(Exception e){
            System.out.println("Navigating exception 1" +e);}
    try {
        waitUntilElementIsVisible(MomentDashboard1Repo.momentDashboardTab);
        MomentDashboard1Repo.momentDashboardTab.click();}
    catch(Exception e){
        System.out.println("Navigating exception 2" +e);}

        waitForSpinnerToBeInvisible();

}
public boolean momentsDashboard(){
    navigate();
    int count=0;
    List<WebElement> moments= MomentDashboard1Repo.momentList;
    System.out.println("Total moments "+moments.size()+"\n");
    for (int index = 0; index < moments.size(); index++) {
        WebElement momentCards = moments.get(index);
        try {
            mouseHoverOnElement(momentCards);
            momentCards.click();
        }
        catch(Exception e){
            System.out.println("moments card exception "+e);
        }
        count = count + 1;
        System.out.println("Moment number is " + count);
        sleep(1000);
        try {
            waitForSpinnerToBeInvisible();
        }
        catch(Exception e) {
            System.out.println("spinner entering to dashboard "+e);
        }
        sleep(1000);
        String MomentName = MomentDashboard1Repo.momentName.getText();
        System.out.println("Moment name is "+MomentName+"\n");
        try {
            MomentDashboard1Repo.momentDashboardOverviewBtn.click();
        }
        catch(Exception e) {
            System.out.println("Moments dashbaord overview "+e);
        }
        try {
            waitForSpinnerToBeInvisible();
        }
        catch(Exception e) {
            System.out.println("spinner while returning back to dashboard "+e);
        }
        
    }



    return true;
}



}
