package com.lava.profilespage;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 20/07/17.
 */
public class ProfileCreationInMomentpage extends Base {
    ProfileCreationInMomentRepo pCmR ;
    public ProfileCreationInMomentpage(){pCmR = new ProfileCreationInMomentRepo(driver);}

  public boolean createProfile(){
     pCmR.profileName.sendKeys(generateRandomName());
     pCmR.setProfile.click();
     profileCreatedToast();
        return true;
  }

    public void profileCreatedToast(){
        waitUntilElementIsVisible(pCmR.successToastMessage);
        String successMessage = pCmR.getSuccessToastMessage.getText();
        waitForElementToBeInvisible(pCmR.successToastMessage);
        System.out.println("Success toast message is: " + successMessage);
        System.out.println();
    }


}
