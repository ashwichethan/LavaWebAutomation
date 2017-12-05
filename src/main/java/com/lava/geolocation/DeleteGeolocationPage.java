package com.lava.geolocation;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 10/05/17.
 */
public class DeleteGeolocationPage extends Base {
    DeleteGeoLocationRepo DlgP;
   public  DeleteGeolocationPage(){DlgP= new DeleteGeoLocationRepo(driver);}
    CreateGeoLocationPage CgLp = new CreateGeoLocationPage();

    WebElement geoLocation;
   String geoName;
    public boolean waitUntilDeleteModal() {
        waitUntilElementIsVisible(DeleteGeoLocationRepo.yesBtnInDialog);
        return true;
    }
    public boolean DeleteGeolocation(){
        refreshPage();
        if(isElementVisible(DeleteGeoLocationRepo.spinnerOverlay)==true){
            waitUntilElementIsVisible(DeleteGeoLocationRepo.spinnerOverlay);
        }

       CgLp.navaigateToGeoPage();
           delete();
       return true;
    }
    public boolean isGeolocationinAvailableState() {
        isElementVisible(DeleteGeoLocationRepo.statusOfSelectedGeolocation);
        return true;
    }
    public String successMessage() {
        String successMessage = DeleteGeoLocationRepo.getSuccessToastMessage.getText();
        return successMessage;
    }
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(DeleteGeoLocationRepo.spinnerOverlay);
    }


    public boolean waitUntilStatusTabIsVisible(){
        waitUntilElementIsVisible(DeleteGeoLocationRepo.statusTab);
        return true;
    }
    int count=0;
    public void delete() {
        sleep(2000);
        List<WebElement> names = DeleteGeoLocationRepo.geolocationNames;
        for (int geolocationIndex = 0; geolocationIndex < names.size(); geolocationIndex++) {
            geoLocation = names.get(geolocationIndex);
            scrollToElement(geoLocation);
            geoName = geoLocation.getText();
            if (geoName.contains("Automation")) {
                geoLocation.click();
                if (isElementVisible(DlgP.statusOfSelectedGeolocation) == true) {
                    DeleteGeoLocationRepo.deleteBtn.click();
                    //waitUntilDeleteModal();
                    sleep(1000);
                    DeleteGeoLocationRepo.yesBtnInDialog.click();
                    --geolocationIndex;
                    waitUntilElementIsVisible(DeleteGeoLocationRepo.getSuccessToastMessage);
                    String successMessage = successMessage();
                    System.out.println("Success toast message is " + successMessage);
                    count = count + 1;
                    waitForElementToBeInvisible(DeleteGeoLocationRepo.getSuccessToastMessage);

                }

            }

        }
        System.out.println("Total Geolocation deleted: " + count);

    }


}
