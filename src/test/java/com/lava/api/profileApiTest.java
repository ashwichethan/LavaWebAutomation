package com.lava.api;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;
import com.lava.Api.profileApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jenkins on 16/06/17.
 */
public class profileApiTest extends TestBase{

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify able to get profile response")
    @TestCaseId("TMS-7")
   // @Test(testName = "Lava_TC5")
    public void profile() {
        // profileApi PGroups = new ParentGroups();
         profileApi api = new profileApi();
        api.ParentGroup();

        List<String> allNameValues = new ArrayList<>();
        ArrayList<HashMap<String, String>> content = api.segments();
       // boolean isInAscendingOrder = checkAscendingOrder(content);
        // System.out.println("Are Elements in Ascending order: "+ isInAscendingOrder);
       // Assert.assertEquals(isInAscendingOrder,true,"Not in Ascending Order");
        for(int i=content.size()-1;i>=0;i--) {
            String getNameValues = content.get(i).get("name");
           System.out.println("output "+getNameValues);
            // System.out.println(content.get(i).get("name"));
            allNameValues.add(getNameValues);

        }

    }


}
