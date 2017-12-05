package com.lava.loginpage;

import com.lava.Pages;
import com.lava.utils.Base;

/**
 * Created by jenkins on 05/07/17.
 */
public class ReloginPage extends Base {
    ReloginRepo rLr;
    public ReloginPage(){rLr = new ReloginRepo(driver);}

    public void setEmailField(String email){
        ReloginRepo.userName.sendKeys(email);
    }

    public void setPasswordField(String password){
        ReloginRepo.password.sendKeys(password);}

    public void clickSubmitButton(){
        ReloginRepo.submitButton.click();
    }

    public boolean logout(String email, String password){
        waitUntilElementIsVisible(ReloginRepo.userTab);
        ReloginRepo.userTab.click();
        waitUntilElementIsVisible(ReloginRepo.logoutBtn);
        ReloginRepo.logoutBtn.click();
        waitUntilElementIsVisible(ReloginRepo.userName);
        setEmailField(email);
        setPasswordField(password);
        clickSubmitButton();
        try{
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            Pages.ModalDialog().acceptModalDialog();
        }catch(Exception e){

        }
        return true;
    }
    public boolean isUserMatching(String owner){
        waitUntilElementIsVisible(ReloginRepo.userTab);
        ReloginRepo.userTab.click();
        waitUntilElementIsVisible(ReloginRepo.ownerName);
        String ownerName = ReloginRepo.ownerName.getText();
        ReloginRepo.logoutBtn.click();
        return ownerName.contains(owner);

    }

    public boolean authenticationError(String email, String password){
//        isElementVisible(rLr.userTab);
//        rLr.userTab.click();
//        waitUntilElementIsVisible(rLr.logoutBtn);
  //      rLr.logoutBtn.click();
        waitUntilElementIsVisible(ReloginRepo.userName);
        setEmailField(email);
        setPasswordField(password);
        clickSubmitButton();
        waitUntilElementIsVisible(ReloginRepo.authenticationFailed);
        return true;
    }




}
