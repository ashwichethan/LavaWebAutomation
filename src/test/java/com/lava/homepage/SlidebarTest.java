package com.lava.homepage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by jenkins on 21/07/17.
 */
public class SlidebarTest extends TestBase {


//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }

    @Test(priority=1,testName = "Lava_TC2")

    public void HomePagesVerificationTest(){
       Assert.assertEquals(Pages.sidebarPage().homeTabCheck(),"MOMENT STATUS");
    }

    @Test(priority=2, testName = "Lava_TC2")
    public void AnalyzePagesVerificationTest(){
    String a[]= {"Customer engagement profile","Fast360 fan dashboard", "Game day dashboard","Global platform dashboard","Falcons platform dashboard","Moment dashboard","AB Test dashboard","Engagement dashboard"};
        Assert.assertEquals(Pages.sidebarPage().analyzeTabCheck(), a);
    }
    @Test(priority=3, testName = "Lava_TC2")
    public void DesignPagesVerificationTest(){
        String a[]= {"Moments","Profiles", "Engagements"};
        Assert.assertEquals(Pages.sidebarPage().designTabCheck(), a);
    }
    @Test(priority=4, testName = "Lava_TC2")
    public void ResourcePagesVerificationTest(){
        String a[]= {"Game Day VIPs","Geo Location Settings", "Hold Adjustment Tables","Rebate Tables", "Content management"};
        Assert.assertEquals(Pages.sidebarPage().resourceTabCheck(), a);
    }

}
