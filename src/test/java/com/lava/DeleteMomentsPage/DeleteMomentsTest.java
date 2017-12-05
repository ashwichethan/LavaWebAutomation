package com.lava.DeleteMomentsPage;

import com.lava.Pages;
import com.lava.base.TestBase;
import com.lava.utils.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 20/03/17.
 */
public class DeleteMomentsTest extends TestBase {

//  @BeforeSuite
//  public void login(){
//    String email = credentialsProperties.get("USERNAME");
//    String password = credentialsProperties.get("PASSWORD");
//    Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//  }


  @Title("Verify Able to delete moments")
  @TestCaseId("TMS-7")
  @Test(testName = "Lava_TC5")
  public void ableToDeleteMoments() {
      Assert.assertTrue(Pages.DeleteMomentsPage().DeleteMoments(), "Failed to Delete Moments");

  }


}
