package com.lava.engagementsbuilderpage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 19/05/17.
 */
public class EngagementsTryoutTest extends TestBase {


//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }

    @Title("Verify Able to get tooltip of engagements")
    @TestCaseId("TMS-7")
    @Test(testName = "Lava_TC7")
    public void deleteDraftInUseEngagements(){
       Assert.assertTrue(Pages.DeleteDraftAndInUseEngagements().navigateEngagemnetsPage(),"Failed to navigate to engagements page");
        Assert.assertTrue(Pages.DeleteDraftAndInUseEngagements().deleteEngagement(),"Failed to delete engagements");


    }


}
