package com.lava.geolocation;

import com.lava.utils.Base;

/**
 * Created by jenkins on 19/05/17.
 */
public class GeolocationTooltip extends Base {
GeolocationTooltipRepo glTt;
    public GeolocationTooltip(){glTt = new GeolocationTooltipRepo(driver);}
CreateGeoLocationPage CgLp = new CreateGeoLocationPage();

    public boolean tooltipGeolocation(){
        refreshPage();
        if(isElementVisible(glTt.spinnerOverlay)==true){
            waitUntilElementIsVisible(glTt.spinnerOverlay);
        }

        CgLp.navaigateToGeoPage();
        tooltip(GeolocationTooltipRepo.geolocationsInList, GeolocationTooltipRepo.toolTipContents);

        return true;
    }



}
