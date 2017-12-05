package com.lava.geolocation;

import com.lava.utils.Base;

/**
 * Created by jenkins on 10/07/17.
 */
public class GeolocationPage extends Base {
    GeolocationRepo gLr;

    public GeolocationPage() {
        gLr = new GeolocationRepo(driver);
    }

    CreateGeoLocationPage cGp = new CreateGeoLocationPage();

    public boolean geolocationTitle() {
        cGp.navaigateToGeoPage();
        String title = "GEO LOCATION SETTINGS";
        String getTitle = GeolocationRepo.geolocationTitle.getText();
        return getTitle.equals(title);
    }

    public boolean addBtn() {
        String addGeoBtn = "ADD GEO LOCATION";
        String getText = GeolocationRepo.addGeoBtn.getText();
        return getText.equals(addGeoBtn);
    }


    public boolean syncBtn() {
        String sync = "SYNC GIMBAL BEACONS";
        String syncText = GeolocationRepo.syncGimbalBtn.getText();
        return syncText.equals(sync);

    }


    public boolean status() {
        String unused = "UNUSED";
        String unusedText = GeolocationRepo.status.get(0).getText();
        if (unusedText.equals(unused) == false) {
            return false;
        } else {
            String draft = "DRAFT";
            String draftText = GeolocationRepo.status.get(1).getText();
            if (draftText.equals(draft) == false) {
                return false;
            } else {
                String inuse = "IN-USE";
                String inuseText = GeolocationRepo.status.get(2).getText();
                return inuseText.equals(inuse);
            }
        }
    }
    public boolean columns() {
        String status = "STATUS";
        String statusText = GeolocationRepo.columnName.get(0).getText();
        if (statusText.equals(status) == false) {
            return false;
        } else {
            String areaName = "AREA NAME";
            String areaNameText = GeolocationRepo.columnName.get(1).getText();
            if (areaNameText.equals(areaName) == false) {
                return false;
            } else {
                String type = "TYPE";
                String typeText = GeolocationRepo.columnName.get(2).getText();
                return typeText.equals(type);
            }
        }
    }
    public boolean sortBtn() {
        int sort = GeolocationRepo.sortBtn.size();
        return sort==3;
    }

    public boolean userToggleInGeolocationPage() {
        return (isElementVisible(GeolocationRepo.userInfoToggle));
    }



}