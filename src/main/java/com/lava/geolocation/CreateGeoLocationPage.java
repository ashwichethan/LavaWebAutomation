package com.lava.geolocation;

import com.lava.Pages;
import com.lava.profilespage.ProfilesCreationPage;
import com.lava.utils.Base;

/**
 * Created by jenkins on 10/05/17.
 */
public class CreateGeoLocationPage extends Base {
    CreateGeoLocationRepo CglP;
    public CreateGeoLocationPage(){CglP = new CreateGeoLocationRepo(driver);}
ProfilesCreationPage sp = new ProfilesCreationPage();

    String name = "Automation";
    public boolean waitUntilResourcePageIsDisplayed(){
        waitUntilElementIsVisible(CreateGeoLocationRepo.geolocationPage);
        return true;
    }
    public String successMessage() {
        String successMessage = CreateGeoLocationRepo.getSuccessToastMessage.getText();
        return successMessage;
    }
    public void navaigateToGeoPage(){
           if(isElementVisible(CreateGeoLocationRepo.geolocationTitle)==false){
              isElementVisible(CreateGeoLocationRepo.resourceTab);
           CreateGeoLocationRepo.resourceTab.click();
           isElementVisible(CreateGeoLocationRepo.geoLocationTab);
           CreateGeoLocationRepo.geoLocationTab.click();
           sp.waitForSpinnerToBeInVisible();
       }

    }

    public boolean createGeoLocation(){
        refreshPage();
        if(isElementVisible(CreateGeoLocationRepo.spinnerOverlay)==true){
            waitUntilElementIsVisible(CreateGeoLocationRepo.spinnerOverlay);
        }

        navaigateToGeoPage();
        for(int j=1; j<5;j++) {
            ibeacon();
            region();
        }
        System.out.println("Total geolocations created: "+count);
       return true;
    }
     int count=0;
    public void ibeacon(){


            CreateGeoLocationRepo.addGeoLocationButton.click();
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            sleep(2000);
            CreateGeoLocationRepo.ibeaconRadioBtn.click();

            CreateGeoLocationRepo.areaName.sendKeys(generateRandomName());
            CreateGeoLocationRepo.uuidInput.sendKeys("12456");
            CreateGeoLocationRepo.majorInput.sendKeys("1245");
            CreateGeoLocationRepo.minorInput.sendKeys("1452");
            CreateGeoLocationRepo.thresholdInput.sendKeys("20");
            CreateGeoLocationRepo.addButton.click();
            waitUntilElementIsVisible(CreateGeoLocationRepo.getSuccessToastMessage);
            String successMessage = successMessage();
            sp.waitUntilSuccesstoastMsgToBeInVisible();
            System.out.println("Success toast message is: " + successMessage+" of iBeacon");
            System.out.println();
            count = count+1;


    }

    public void region() {

            CreateGeoLocationRepo.addGeoLocationButton.click();
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            sleep(2000);
            CreateGeoLocationRepo.regionRadioBtn.click();
            CreateGeoLocationRepo.areaName.sendKeys(generateRandomName());
            CreateGeoLocationRepo.latitude.sendKeys("0.125");
            CreateGeoLocationRepo.longitude.sendKeys("0.452");
            CreateGeoLocationRepo.radius.sendKeys("12");
            CreateGeoLocationRepo.addButton.click();
            waitUntilElementIsVisible(CreateGeoLocationRepo.getSuccessToastMessage);
            String successMessage = successMessage();
            sp.waitUntilSuccesstoastMsgToBeInVisible();
            System.out.println("Success toast message is: " + successMessage+" of region");
            System.out.println();
            count = count+1;

    }

}
