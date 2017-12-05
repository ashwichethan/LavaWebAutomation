package com.lava.loginpage;

import com.lava.Pages;
import com.lava.utils.Base;

/**
 * Created by codecraft on 25/11/16.
 */
public class LoginPage extends Base{

    private static LoginPageObjectRepo lo;

    public LoginPage(){
        lo = new LoginPageObjectRepo(driver);
    }

    public boolean isLoginPage(){
        return isElementVisible(LoginPageObjectRepo.loginPage);

    }

    public void initialSetup() {

        isLoginPage();
    }

    public void setEmailField(String email){
        LoginPageObjectRepo.emailField.sendKeys(email);
    }

    public void setPasswordField(String password){
        LoginPageObjectRepo.passwordField.sendKeys(password);
    }

    public void clickSubmitButton(){
        LoginPageObjectRepo.submitButton.click();
    }

    public boolean login(String email, String password){
        setEmailField(email);
        setPasswordField(password);
        clickSubmitButton();

        try{
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            Pages.ModalDialog().acceptModalDialog();
        }catch(Exception e){

        }

        sleep(2000);
        if(isElementVisible(LoginPageObjectRepo.lavaLogo)==true) {
            LoginPageObjectRepo.lavaLogo.click();
            waitUntilElementIsVisible(LoginPageObjectRepo.homeTab);
        }
        return Pages.HomePage().isHomePageVisible();
    }
}
