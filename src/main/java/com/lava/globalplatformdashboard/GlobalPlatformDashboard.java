package com.lava.globalplatformdashboard;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 07/06/17.
 */
public class GlobalPlatformDashboard extends Base {
    GlobalPlatformDashboardRepo gPDr;
    public GlobalPlatformDashboard(){gPDr = new GlobalPlatformDashboardRepo(driver);}
public void navigateToGlobalDashboard(){
        try{
            GlobalPlatformDashboardRepo.analyzeTab.click();
            GlobalPlatformDashboardRepo.globalPlatformDashboard.click();
        }
        catch (Exception e){
            System.out.println(e);
        }
}
public boolean viewGlobalPlatformDashboard(){
    navigateToGlobalDashboard();
    global();
    attendance();
    concession();
    return true;
}
public void waitUntilLogoAppears(){
    waitUntilElementIsVisible(GlobalPlatformDashboardRepo.kingsLogo);
}
public void global(){
         String globalTab = GlobalPlatformDashboardRepo.globalTab.getText();
         System.out.println(globalTab+" is clicked");
         waitUntilLogoAppears();
         System.out.println("Kings Logo is present");
         System.out.println(GlobalPlatformDashboardRepo.activeSessionUsers.getText()+" are "+ GlobalPlatformDashboardRepo.activeSessionUsersValue.getText());
         System.out.println(GlobalPlatformDashboardRepo.totalDailyUsers.getText()+" are "+ GlobalPlatformDashboardRepo.totalDailyUsersValue.getText());
         System.out.println(GlobalPlatformDashboardRepo.realtimeAttendance.getText()+" chart is present");
         System.out.println(GlobalPlatformDashboardRepo.realtimeSocial.getText()+" twitter is present");
         System.out.println("Total tweets in list : "+ GlobalPlatformDashboardRepo.totalTwitterAccounts.size()+"\n");
}
public void attendance(){
    String attendanceTab = GlobalPlatformDashboardRepo.attendanceTab.getText();
    GlobalPlatformDashboardRepo.attendanceTab.click();
    System.out.println(attendanceTab+" is clicked");
    System.out.println(GlobalPlatformDashboardRepo.totalAttendance.getText()+" : "+ GlobalPlatformDashboardRepo.totalAttendanceValue.getText());
    System.out.println(GlobalPlatformDashboardRepo.distributed.getText()+" : "+ GlobalPlatformDashboardRepo.distributedValue.getText()+"\n");

}
public  void concession(){
    String concessionTab = GlobalPlatformDashboardRepo.concessionTab.getText();
    GlobalPlatformDashboardRepo.concessionTab.click();
    System.out.println(concessionTab+" is clicked");
    System.out.println(GlobalPlatformDashboardRepo.alcoholic.getText()+" : "+ GlobalPlatformDashboardRepo.concessionValues.get(0).getText());
    System.out.println(GlobalPlatformDashboardRepo.nonAlcoholic.getText()+" : "+ GlobalPlatformDashboardRepo.concessionValues.get(1).getText());
    System.out.println(GlobalPlatformDashboardRepo.food.getText()+" : "+ GlobalPlatformDashboardRepo.concessionValues.get(2).getText());
    System.out.println(GlobalPlatformDashboardRepo.others.getText()+" : "+ GlobalPlatformDashboardRepo.concessionValues.get(3).getText());
    System.out.println(GlobalPlatformDashboardRepo.totalTransaction.getText()+" : "+ GlobalPlatformDashboardRepo.concessionValues.get(4).getText());



}


}
