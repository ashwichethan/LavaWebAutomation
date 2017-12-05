package com.lava.profilespage;

//import com.lava.createmomentspage.ProfilesPage;
//import com.lava.createmomentspage.TriggersPage;
//import com.lava.utils.Base;
//import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import java.util.List;

import com.lava.createmomentspage.ProfilesPage;
import com.lava.createmomentspage.TriggersPage;
import com.lava.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 26/07/17.
 */
public class ProfileStatusCheck extends Base {
    ProfileStatusCheckRepo pScR;
    public ProfileStatusCheck(){pScR = new ProfileStatusCheckRepo(driver);}

    public boolean navigateToProfilesPage(){
        if(isElementVisible(pScR.isNodesVisibleProfile)==false) {
            waitUntilElementIsVisible(pScR.designTab);
            pScR.designTab.click();
            waitUntilElementIsVisible(pScR.profilesTab);
            pScR.profilesTab.click();
            waitUntilElementIsVisible(pScR.profilesPage);
        }
        sleep(2000);
        return true;
    }

     static String profileNames = generateRandomName();
    static String profileNameNew = profileNames;

    static String profilesName;
    String playerIDcsv = "/Users/Shared/Jenkins/IdeaProjects/lava_webautomation_localserver/src/main/java/com/lava/profilespage/segement_upload - player_id copy 2.csv";
    public boolean clickProfileNode() {
        navigateToProfilesPage();
        List<WebElement> selectProfiles = pScR.selectProfileNode;
        System.out.println("Total profile nodes(types) : "+selectProfiles.size());

        for (int profileIndex = 0; profileIndex < selectProfiles.size(); profileIndex++) {
           WebElement profile = selectProfiles.get(profileIndex);
            sleep(1000);
             profilesName = profile.getText();
            System.out.println(profilesName);
            profile.click();
            sleep(2000);
            if(profilesName.equalsIgnoreCase("External List")==false) {
                waitUntilElementIsVisible(pScR.modalDialog);

                pScR.profileName.sendKeys(profileNameNew);

                if(isElementVisible(pScR.DropdownBox)) {
                    pScR.DropdownBox.click();
                    pScR.selectFromDropdownBox.get(1).click();
                    System.out.println("Element selected from the list is " + pScR.selectFromDropdownBox.get(1).getText());
                    pScR.setProfile.click();
                    profileCreated();
                }
                else {
                    pScR.setProfile.click();
                    profileCreated();
                }

            }
            else {
                pScR.playerIds.click();
                sleep(500);
                pScR.nextBtn.click();
                try {
                    pScR.fileUploadBtn.sendKeys(playerIDcsv);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                sleep(1000);
                pScR.nextBtn.click();
                pScR.enterName.sendKeys(profilesName);
                pScR.saveBtn.click();
                profileCreated();
            }
            sleep(2000);


            isElementVisible(driver.findElement(By.xpath("//td[contains(.,'"+profileNameNew+"')]")));
            driver.findElement(By.xpath("//td[contains(.,'"+profileNameNew+"')]")).click();
            sleep(3000);

            navigateMomentsCreation();
            sleep(2000);
            if(isElementVisible(pScR.spinnerOverlay)==true){
                waitForElementToBeInvisible(pScR.spinnerOverlay);
            }
            tRp.dragAndDropTrigger("Card out", "GAMING");
            String pname =profilesName.toUpperCase();
            pRp.dragAndDropProfiles(profileNameNew, pname);

        }
        return true;
    }
    ProfilesPage pRp = new ProfilesPage();
    TriggersPage tRp = new TriggersPage();


    public void profileCreated(){
        waitUntilElementIsVisible(pScR.successToastMessage);
        String successMessage = pScR.getSuccessToastMessage.getText();
        waitForElementToBeInvisible(pScR.successToastMessage);
        System.out.println("Success toast message is: " + successMessage);
        System.out.println();
    }

    public void navigateMomentsCreation(){
    pScR.homeTab.click();
        if(isElementVisible(pScR.spinnerOverlay)==true){
            waitForElementToBeInvisible(pScR.spinnerOverlay);
        }
        isElementVisible(pScR.createMomentBtn);
        pScR.createMomentBtn.click();
        //sleep(2000);
        //waitUntilElementIsVisible(pScR.spinnerOverlay);
        if(isElementVisible(pScR.spinnerOverlay)==true) {
            waitForElementToBeInvisible(pScR.spinnerOverlay);
        }
    }

    public boolean navigateMomentsPage(){
        pScR.designTab.click();
        sleep(200);
        pScR.momentsTab.click();
        sleep(1000);
        if(isElementVisible(pScR.spinnerOverlay)==true){
            waitForElementToBeInvisible(pScR.spinnerOverlay);
        }

        if(isElementVisible(pScR.spinnerOverlay)==true) {
            waitForElementToBeInvisible(pScR.spinnerOverlay);
        }
        return true;
    }

    public String profileStatus(){
        sleep(3000);
       // waitForElementToBeInvisible(driver.findElement(By.xpath("//td[contains(.,'"+profileNameNew+"')]")));
        isElementVisible(driver.findElement(By.xpath("//td[contains(.,'"+profileNameNew+"')]")));
        driver.findElement(By.xpath("//td[contains(.,'"+profileNameNew+"')]")).click();
        sleep(1000);

        String className = pScR.statusofProfile.getAttribute("class");
        return className;

    }


    public String className(){
        navigateToProfilesPage();
        pScR.profiles.get(0).click();

        String className = pScR.statusofProfile.getAttribute("class");
        return className;
    }




}
