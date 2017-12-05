package com.lava.momentscardspage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 24/07/17.
 */
public class MomentsViewTest extends TestBase {


//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify moments cards dashboard ")
    @TestCaseId("TMS-6")
    @Test(priority=1,testName = "Lava_TC5")
    public void MomentViewTest() {
        Assert.assertTrue(Pages.MomentView().momentsTriggerMatching(), "Moment Trigger in view mode doesn't match in moment list");
    }
    @Test(priority=2,testName = "Lava_TC5")
    public void MomentViewTest1() {
        Assert.assertTrue(Pages.MomentView().totalTriggered(), "'Total triggered' text doesn't match with requirement");

    }
    @Test(priority=3,testName = "Lava_TC5")
    public void MomentViewTest2() {
        Assert.assertTrue(Pages.MomentView().individualsTriggered(), "'Individuals triggered' text doesn't match with requirement");

    }
    @Test(priority=4,testName = "Lava_TC5")
    public void MomentViewTest3() {
        Assert.assertTrue(Pages.MomentView().eligible(), "'Eligible' text under profiles doesn't match with requirement");

    }
    @Test(priority=5,testName = "Lava_TC5")
    public void MomentViewTest4() {
        Assert.assertTrue(Pages.MomentView().eligibleCompareBtnVisible(), "'Eligible compare' btn under profiles is not visible");

    }
    @Test(priority=6,testName = "Lava_TC5")
    public void MomentViewTest5() {
        Assert.assertEquals(Pages.MomentView().eligibleCompareBtn(), "COMPARE", "'COMPARE' text doesn't match");

    }
    @Test(priority=7,testName = "Lava_TC5")
    public void MomentViewTest6() {
        Assert.assertTrue(Pages.MomentView().qualifierCompareBtnVisible(), "'Qualifier compare' btn under qualifier is not visible");

    }
    @Test(priority=8,testName = "Lava_TC5")
     public void MomentViewTest7() {
     Assert.assertEquals(Pages.MomentView().qualifierCompareBtn(), "COMPARE", "'COMPARE' text doesn't match under qualifier");

   }
    @Test(priority=9,testName = "Lava_TC5")
    public void MomentViewTest8() {
         Assert.assertTrue(Pages.MomentView().qualified(), "'qualified' text under qualifier doesn't match with requirement");

    }
    @Test(priority=10,testName = "Lava_TC5")
    public void MomentViewTest9() {
        Assert.assertTrue(Pages.MomentView().engagements(), "'engagements' text under engagements doesn't match with requirement");

    }
    @Test(priority=11,testName = "Lava_TC5")
    public void MomentViewTest10() {
        Assert.assertTrue(Pages.MomentView().engaged(), "'engaged' text under engagements doesn't match with requirement");

    }
}
