package com.lava.cms;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 23/05/17.
 */
public class cmsMediaTest extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify Able to add media files")
    @TestCaseId("TMS-7")
    @Test(testName = "Lava_TC5", priority = 0)
    public void ableToAddMediaFiles() {
            Assert.assertTrue(Pages.AddMediaFiles().CMSAddMedia(), "Failed to upload media");
    }

    @Test(testName = "Lava_TC5", priority = 1)
    public void ableToDeleteMediaFiles() {
        Assert.assertTrue(Pages.DeleteCMSMedia().deleteCMS(), "Failed to delete media");
    }

}
