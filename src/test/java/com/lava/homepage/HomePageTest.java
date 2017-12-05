package com.lava.homepage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;

/**
 * Created by Chethan Shetty on 1/3/2017.
 */
public class HomePageTest extends TestBase{

//        @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }

    @Test(priority=1, testName = "Lava_TC2")

    public void homePageElements(){
        Assert.assertTrue(Pages.HomePage().homePage(),"Failed to Navigate home");
        Assert.assertTrue(Pages.HomePage().ishomeTitleVisible(),"Failed to load visibility of HOME TITLE");
        Assert.assertTrue(Pages.HomePage().isTitleTextMatched(),"Home title text doesn't match");
        Assert.assertTrue(Pages.HomePage().isCreateNewBtnVisible(),"Failed to load visibility of Create new moment button");
        Assert.assertTrue(Pages.HomePage().iscreateNewBtnMatched(),"Create new button text doesn't match");
    }
    @Test(priority=2,testName = "Lava_TC2")
    public void homePageVisitDraftedMomentsPage(){
        Assert.assertTrue(Pages.HomePage().isDraftButtonVisible(),"Failed to load the Home page for the visibility of Draft button");
        Assert.assertTrue(Pages.HomePage().isdraftMatched(),"DRAFT text doesn't match");
        Assert.assertTrue(Pages.HomePage().getDraftRulesCount(),"Application is not showing all the Drafted Rules");
        Assert.assertTrue(Pages.HomePage().verifySearchTextAsDraft(),"Search is not filtered as Draft");
    }

    @Test(priority=3,testName = "Lava_TC2")
    public void homePageVisitLiveMomentsPage(){
        Assert.assertTrue(Pages.HomePage().isLiveButtonVisible(),"Failed to load the Home page for the visibility of Live button");
        Assert.assertTrue(Pages.HomePage().isliveMatched(),"LIVE text doesn't match");
        Assert.assertTrue(Pages.HomePage().isTopLiveTitleVisible(),"Top Live title is not visible");
        Assert.assertTrue(Pages.HomePage().isTopLive4MomentsVisible(),"Top Live 4 moments are missing");
        Assert.assertTrue(Pages.HomePage().topMoments(),"Top moments not matching value is not visible");
        Assert.assertTrue(Pages.HomePage().emptyMoments(),"Empty moments are not visible");
        Assert.assertTrue(Pages.HomePage().getLiveRulesCount(),"Application is not showing all the Live Rules");
        Assert.assertTrue(Pages.HomePage().verifySearchTextAsLive(),"Search is not filtered as Live");
    }

    @Test(priority=4,testName = "Lava_TC2")
    public void homePageVisitSubmitMomentsPage(){
        Assert.assertTrue(Pages.HomePage().isSubmitButtonVisible(),"Failed to load the Home page for the visibility of Submit button");
        Assert.assertTrue(Pages.HomePage().isPendingMatched(),"Application is not showing all the Submitted Rules");
        Assert.assertTrue(Pages.HomePage().getSubmittedRulesCount(),"Application is not showing all the Submitted Rules");
        Assert.assertTrue(Pages.HomePage().verifySearchTextAsSubmitted(),"Search is not filtered as Submit/Pending Approval");
    }






}
