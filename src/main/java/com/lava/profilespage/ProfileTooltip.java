package com.lava.profilespage;

import com.lava.engagementbuilderpage.EngagementsTooltip;
import com.lava.utils.Base;

/**
 * Created by jenkins on 19/05/17.
 */
public class ProfileTooltip extends Base{
    ProfileTooltipRepo PtTr;
    public ProfileTooltip(){PtTr = new ProfileTooltipRepo(driver);}


    ProfilesCreationPage pCpG = new ProfilesCreationPage();

    public boolean tooltipProfile(){
        refreshPage();
        if(isElementVisible(PtTr.spinnerOverlay)==true){
            waitUntilElementIsVisible(PtTr.spinnerOverlay);
        }

       pCpG.navigateToProfilesPage();
        tooltip(ProfileTooltipRepo.profilesInList, ProfileTooltipRepo.toolTipContents);
        return true;
    }


}
