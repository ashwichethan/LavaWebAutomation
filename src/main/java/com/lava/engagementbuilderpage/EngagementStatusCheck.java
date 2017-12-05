package com.lava.engagementbuilderpage;

import com.lava.createmomentspage.EngagementsPage;
import com.lava.createmomentspage.ProfilesPage;
import com.lava.createmomentspage.QualifiersPage;
import com.lava.createmomentspage.TriggersPage;
import com.lava.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by jenkins on 01/08/17.
 */
public class EngagementStatusCheck extends Base {
    EngagementStatusCheckRepo eScR;
    public EngagementStatusCheck(){ eScR = new EngagementStatusCheckRepo(driver);}


    public boolean navigateEngagemnetsPage(){
        if(isElementVisible(eScR.isNodesVisibleEngagement)==false) {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            eScR.designTab.click();
            waitUntilElementIsVisible(eScR.engagementsTab);
            eScR.engagementsTab.click();
            waitUntilElementIsVisible(eScR.engagementsPage);
            sleep(3000);
        }
      return true;
    }
    static String engNames = generateRandomName();
    static String engNameNew = engNames;
    EngagementsCreationPage eCp = new EngagementsCreationPage();
    static String Name;

     public boolean createEngagement() {
        navigateEngagemnetsPage();
        List<WebElement> selectEngagement = eScR.engagementslist;

        System.out.println("Total engagement nodes(types) : "+selectEngagement.size());

        for (int Index = 0; Index < selectEngagement.size(); Index++) {
            WebElement engagement = selectEngagement.get(Index);
            sleep(1000);
            Name = engagement.getText();
            System.out.println(Name);
            engagement.click();
            sleep(1000);
            waitUntilElementIsVisible(eScR.modalDialog);
            eScR.enterEngName.sendKeys(engNameNew);
            eCp.limit("12", "15");
            eCp.enterDiscountOffer();
            eCp.clickSetEngagementButton();
            eCp.toastMessage();
            sleep(2000);

            isElementVisible(driver.findElement(By.xpath("//td[contains(.,'"+engNameNew+"')]")));
            driver.findElement(By.xpath("//td[contains(.,'"+engNameNew+"')]")).click();
         break;
        }
        return true;
    }

    EngagementsPage qRp = new EngagementsPage();


    public boolean engagementAdd(){
        String Ename =Name.toUpperCase();
        qRp.dragAndDropEngagments(engNameNew, Ename);
        return true;
    }


    public boolean navigateMomentsCreation(){
        eScR.homeTab.click();
        if(isElementVisible(eScR.spinnerOverlay)==true){
            waitForElementToBeInvisible(eScR.spinnerOverlay);
        }
        isElementVisible(eScR.createMomentBtn);
        eScR.createMomentBtn.click();

        if(isElementVisible(eScR.spinnerOverlay)==true) {
            waitForElementToBeInvisible(eScR.spinnerOverlay);
        }
        return true;
    }

    public boolean navigateMomentsPage(){
        eScR.designTab.click();
        sleep(200);
        eScR.momentsTab.click();
        sleep(1000);
        if(isElementVisible(eScR.spinnerOverlay)==true){
            waitForElementToBeInvisible(eScR.spinnerOverlay);
        }

        if(isElementVisible(eScR.spinnerOverlay)==true) {
            waitForElementToBeInvisible(eScR.spinnerOverlay);
        }
        return true;
    }

    public String engStatus(){
        sleep(3000);
        isElementVisible(driver.findElement(By.xpath("//td[contains(.,'"+engNameNew+"')]")));
        driver.findElement(By.xpath("//td[contains(.,'"+engNameNew+"')]")).click();
        sleep(1000);
        String className = eScR.statusofEng.getAttribute("class");
        return className;

    }


}
