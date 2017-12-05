package com.lava.geolocationpage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by jenkins on 10/05/17.
 */
public class GeoLocationTest extends TestBase {

//    @BeforeSuite
//    public void login(){
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email,password),"Failed to Login");
//    }


    @Title("Verify Able to create Geolocations for moments")
    @TestCaseId("TMS-7")
    @Test(priority = 1, testName = "Lava_TC5")
    public void ableToCreateGeolocations() {
        Assert.assertTrue(Pages.CreateGeoLocationPage().createGeoLocation(), "Failed to Create geolocations");
    }
    @Test(priority = 2, testName = "Lava_TC5")
    public void ableToDeleteGeolocations() {
        Assert.assertTrue(Pages.DeleteGeolocationPage().DeleteGeolocation(), "Failed to Delete geolocations");
    }
   @Test(priority = 3, testName = "Lava_TC5")
    public void ableTogetTooltipOfGeolocations() {
        Assert.assertTrue(Pages.GeolocationTooltip().tooltipGeolocation(), "Failed to get tooltip of gelocations");
    }

    @Test(priority = 4, testName = "Lava_TC5")
    public void geolocationPageValidation() {
        Assert.assertTrue(Pages.GeolocationPage().geolocationTitle(), "Geolocation page title doesn't match");
    }
    @Test(priority = 5, testName = "Lava_TC5")
    public void geolocationPageAddBtnValidation() {
        Assert.assertTrue(Pages.GeolocationPage().addBtn(), "Geolocation ADD Geolocation button is missing");
    }
    @Test(priority = 6, testName = "Lava_TC5")
    public void geolocationPageSyncBtnValidation() {
        Assert.assertTrue(Pages.GeolocationPage().syncBtn(), "Geolocation  SYNC gimbal beacons button is missing");
    }

    @Test(priority = 7, testName = "Lava_TC5")
    public void geolocationPageStatusValidation() {
        Assert.assertTrue(Pages.GeolocationPage().status(), "Geolocation  status icons are missing");
    }
    @Test(priority = 8, testName = "Lava_TC5")
    public void geolocationPageColumnNameValidation() {
        Assert.assertTrue(Pages.GeolocationPage().columns(), "Geolocation  column names are missing");
    }
    @Test(priority = 9, testName = "Lava_TC5")
    public void geolocationPageSortBtnValidation() {
        Assert.assertTrue(Pages.GeolocationPage().sortBtn(), "Geolocation  sort buttons are missing");
    }
    @Test(priority = 10, testName = "Lava_TC5")
    public void geolocationPageUserToggleValidation() {
        Assert.assertTrue(Pages.GeolocationPage().userToggleInGeolocationPage(), "User toggle in Geolocation page is missing");
    }




}
