package com.lava.api;

import com.lava.Api.profileApi;
import com.lava.Pages;
import com.lava.base.TestBase;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Ashwi on 27/11/17.
 */
public class hashmapsampleTest extends TestBase{

    @Title("Verify able to get profile response")
    @TestCaseId("TMS-7")
     @Test(testName = "Lava_TC5")
    public void profile() {

        Assert.assertTrue(Pages.hashmapsample().main1(),"Invalid password attempt failed");


    }
}
