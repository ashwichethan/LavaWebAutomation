package com.lava.loginpage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import org.testng.annotations.BeforeSuite;
/**
 * Created by codecraft on 25/11/16.
 */
public class LoginPageTest extends TestBase {

      @Title("Verify Able to Login")
    @TestCaseId("TMS-1")
    @Test(testName = "Lava_TC1")
    public void ableToLogin(){
        String email = credentialsProperties.get("USERNAME");
    String password = credentialsProperties.get("PASSWORD");
        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
   }
   // @Test(testName = "Lava_TC2")
    public void reloginTest(){
        String email = "ashwi@codecraft.co.in";
        String password = "123456";
        String owner ="Ashwi Chethan";
        Assert.assertTrue(Pages.ReloginPage().logout(email,password),"Failed to Relogin");
        Assert.assertTrue(Pages.ReloginPage().isUserMatching(owner),"Owner name doesn't match");
    }

  // @Test(testName = "Lava_TC1")
    public void invalidPassword(){
        String email = "ashwi@codecraft.co.in";
        String password = "123455";
        Assert.assertTrue(Pages.ReloginPage().authenticationError(email,password),"Invalid password attempt failed");

    }
  //  @Test(testName = "Lava_TC1")
    public void invalidUsername(){
        String email = "ashwi1@codecraft.co.in";
        String password = "123456";
        Assert.assertTrue(Pages.ReloginPage().authenticationError(email,password),"Invalid username attempt failed");

    }



}
