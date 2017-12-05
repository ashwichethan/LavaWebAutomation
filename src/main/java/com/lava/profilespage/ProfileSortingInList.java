package com.lava.profilespage;

import com.lava.utils.Base;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

/**
 * Created by jenkins on 24/04/17.
 */
public class ProfileSortingInList extends Base {
    ProfileSortingInListRepo pslr;

    public ProfileSortingInList(){
        pslr = new ProfileSortingInListRepo(driver);
    }

    ProfilesCreationPage psl = new ProfilesCreationPage();
    public void navigateToProfilesPage(){

       try {
           psl.isDesignTabVisible();
           psl.clickDesignTab();

       }
       catch(Exception e) {

       }
        psl.isProfilesTabVisible();
        psl.clickProfilestab();
        psl.waitUntilProfilesPageIsDisplayed();

    }

    public boolean sortingProfiles(){

        navigateToProfilesPage();
        sleep(3000);

        System.out.println("In Ascending Order");
        ascedningOrder();
        System.out.println("In Descending Order");
        descendingOrder();
        return true;
    }
    public void ascedningOrder(){
try {
    pslr.statusTab.click();
    pslr.profileNameTab.click();
    pslr.ownerTab.click();
    pslr.profileTypeTab.click();
    pslr.createdTab.click();
    pslr.populationTab.click();
}
catch(Exception e){
    System.out.println(e);
}
    }
    public void descendingOrder(){
try {
    pslr.statusTab.click();
    pslr.profileNameTab.click();
    pslr.ownerTab.click();
    pslr.profileTypeTab.click();
    pslr.createdTab.click();
    pslr.populationTab.click();
}
    catch(Exception e){
        System.out.println(e);
    }
    }
//    public void checkForOrders(){
//
//    }




}
