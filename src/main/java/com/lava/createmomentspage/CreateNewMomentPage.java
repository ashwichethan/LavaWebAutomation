package com.lava.createmomentspage;

import com.lava.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.lang.reflect.Array;
import java.rmi.server.ExportException;
import java.security.cert.Extension;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Dewesh Yadav on 3/6/2017.
 */
public class CreateNewMomentPage extends Base{

  CreateNewMomentObjRepo CmRp;
  static String momentName = generateRandomName();

  public CreateNewMomentPage(){
    CmRp = new CreateNewMomentObjRepo(driver);
  }

  public boolean isMomentButtonVisible() {
    waitUntilElementIsVisible(CreateNewMomentObjRepo.createNewMomentBtn);
    return true;
  }

  public void clickCreateNewMomentBtn() {
    CreateNewMomentObjRepo.createNewMomentBtn.click();
  }

  public void setMomentTitle(String momentTitle) {
    CreateNewMomentObjRepo.momentTitleBox.sendKeys(momentTitle);
  }

  public void waitForSpinnerToBeInVisible() {
    waitForElementToBeInvisible(CreateNewMomentObjRepo.spinnerOverlay);
  }

  public boolean navigateToCreateMomentPage() {
    refreshPage();
    if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
      waitForSpinnerToBeInVisible();
    }
    if (isElementVisible(CreateNewMomentObjRepo.createNewMomentBtn) == false) {
      CreateNewMomentObjRepo.designTab.click();
      sleep(200);
      CreateNewMomentObjRepo.momentsTab.click();
      sleep(1000);
      if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
        waitForElementToBeInvisible(CreateNewMomentObjRepo.spinnerOverlay);
      }

      if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true) {
        waitForElementToBeInvisible(CreateNewMomentObjRepo.spinnerOverlay);
      }
    }
    isMomentButtonVisible();
    sleep(1000);
    clickCreateNewMomentBtn();
    waitForSpinnerToBeInVisible();
    sleep(1000);
  return true;
}
  public boolean momentTitleName() {
    String name = generateRandomName();
    setMomentTitle(name);
    System.out.println("Moment title random data: " + name);
    CreateNewMomentObjRepo.innerPage.click();
    sleep(1000);
    CreateNewMomentObjRepo.saveMomentBtn.click();
    //waitUntilElementIsVisible(CreateNewMomentObjRepo.successToastAlert);
    waitForSpinnerToBeInVisible();
    if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
      waitForSpinnerToBeInVisible();
    }
    if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
      waitForSpinnerToBeInVisible();
    }
    sleep(1000);
    driver.findElement(By.xpath("//td[contains(.,'"+name+"')]")).click();

    System.out.println("Moment is created and shown in moments list");

    refreshPage();
    if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
      waitForSpinnerToBeInVisible();
    }
    return true;
  }


  public boolean momentTitle() {
    String name = momentName;
    setMomentTitle(name);
    System.out.println("Moment title random data: " + momentName);
    CreateNewMomentObjRepo.innerPage.click();
    sleep(1000);
    CreateNewMomentObjRepo.saveMomentBtn.click();
    //waitUntilElementIsVisible(CreateNewMomentObjRepo.successToastAlert);
    waitForSpinnerToBeInVisible();
    if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
      waitForSpinnerToBeInVisible();
    }
    if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
      waitForSpinnerToBeInVisible();
    }
    sleep(1000);
    driver.findElement(By.xpath("//td[contains(.,'"+name+"')]")).click();

    System.out.println("Moment is created and shown in moments list");

    refreshPage();
    if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
      waitForSpinnerToBeInVisible();
    }
    return true;
  }

public boolean momentSubmit(){
  isElementVisible(driver.findElement(By.xpath("//td[contains(.,'"+momentName+"')]")));
  driver.findElement(By.xpath("//td[contains(.,'"+momentName+"')]")).click();
  isElementVisible(CreateNewMomentObjRepo.submitBtn);
  CreateNewMomentObjRepo.submitBtn.click();
  sleep(1000);
  waitForSpinnerToBeInVisible();
  if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
    waitForSpinnerToBeInVisible();
  }
    return true;
}

  public boolean momentLive(){
    isElementVisible(driver.findElement(By.xpath("//td[contains(.,'"+momentName+"')]")));
    driver.findElement(By.xpath("//td[contains(.,'"+momentName+"')]")).click();
    isElementVisible(CreateNewMomentObjRepo.approveBtn);
    CreateNewMomentObjRepo.approveBtn.click();
    sleep(1000);
    waitForSpinnerToBeInVisible();
    if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
      waitForSpinnerToBeInVisible();
    }
    return true;
  }
  public boolean momentSuspend(){
    isElementVisible(driver.findElement(By.xpath("//td[contains(.,'"+momentName+"')]")));
    driver.findElement(By.xpath("//td[contains(.,'"+momentName+"')]")).click();
    isElementVisible(CreateNewMomentObjRepo.suspendBtn);
    CreateNewMomentObjRepo.suspendBtn.click();
    sleep(1000);
    waitForSpinnerToBeInVisible();
    if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
      waitForSpinnerToBeInVisible();
    }
    return true;
  }
  public boolean momentReject(){
    isElementVisible(driver.findElement(By.xpath("//td[contains(.,'"+momentName+"')]")));
    driver.findElement(By.xpath("//td[contains(.,'"+momentName+"')]")).click();
    isElementVisible(CreateNewMomentObjRepo.rejectBtn);
    CreateNewMomentObjRepo.rejectBtn.click();
    sleep(1000);
    waitForSpinnerToBeInVisible();
    if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
      waitForSpinnerToBeInVisible();
    }
    return true;
  }


public boolean createNewMomentsInMomentsPage(){
    refreshPage();
  if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
    waitForSpinnerToBeInVisible();
  }
    if(isElementVisible(CmRp.createNewMomentBtnInMomentsPage)==true){
      CmRp.createNewMomentBtnInMomentsPage.click();
    }
    else {
      CmRp.homeTab.click();
      isMomentButtonVisible();
      sleep(1000);
      clickCreateNewMomentBtn();
      waitForSpinnerToBeInVisible();
      sleep(1000);
    }

  if(isElementVisible(CreateNewMomentObjRepo.spinnerOverlay)==true){
    waitForSpinnerToBeInVisible();
  }
    sleep(1000);
    return true;
}

}
