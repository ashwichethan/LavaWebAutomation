package com.lava.momentStatisticBackend_Age_Tier_Gender_Ethnic;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 21/06/17.
 */
public class CardoutTriggerStatistics extends Base{
    CardoutTriggerStatisticsRepo cTs;
    public CardoutTriggerStatistics(){cTs = new CardoutTriggerStatisticsRepo(driver); }
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(CardoutTriggerStatisticsRepo.spinnerOverlay);
    }
    public void navigateToMomentsPage() {
            if(isElementVisible(CardoutTriggerStatisticsRepo.momentsPage)==false) {
                CardoutTriggerStatisticsRepo.designTab.click();
                sleep(1000);
                CardoutTriggerStatisticsRepo.momentsTab.click();
                sleep(2000);
                if(isElementVisible(cTs.spinnerOverlay)==true){
                    waitForElementToBeInvisible(cTs.spinnerOverlay);
                }
                sleep(1000);
            }
        if(isElementVisible(cTs.spinnerOverlay)==true){
            waitForElementToBeInvisible(cTs.spinnerOverlay);
        }
    }

    public boolean statistics(){
        refreshPage();
        if(isElementVisible(cTs.spinnerOverlay)==true){
            waitForElementToBeInvisible(cTs.spinnerOverlay);
        }
        navigateToMomentsPage();
        List<WebElement> allmomentslist = CardoutTriggerStatisticsRepo.moments;
        for(int index=0; index<allmomentslist.size(); index++) {
            WebElement moment = allmomentslist.get(index);
            scrollToElement(moment);
            String momentName = moment.getText();

            if (momentName.equalsIgnoreCase("test gaming")) {
                moment.click();
                System.out.println("Moment name is : " + momentName);
                String triggercard = CardoutTriggerStatisticsRepo.trigger.getText();
                System.out.println("Trigger name is : " + triggercard);
                if (isElementVisible(CardoutTriggerStatisticsRepo.statusLive)) {
                    System.out.println("Status is Live");
                } else {
                    System.out.println("Moment is not in Live state");
                }
                if (isElementVisible(CardoutTriggerStatisticsRepo.suspendBtn)) {
                    System.out.println("Suspend Button is visible");
                } else {
                    System.out.println("Suspend button is not visible");
                }
                CardoutTriggerStatisticsRepo.viewBtn.click();
                sleep(1000);
                waitForSpinnerToBeInVisible();
                if (isElementVisible(CardoutTriggerStatisticsRepo.value)) {
                    String age = CardoutTriggerStatisticsRepo.value.getText();
                    System.out.println("Age value is " + age);
                } else {
                    System.out.println("Age value is missing ");
                }
                CardoutTriggerStatisticsRepo.byGender.click();
                waitForSpinnerToBeInVisible();
                if (isElementVisible(CardoutTriggerStatisticsRepo.value)) {
                    String gender = CardoutTriggerStatisticsRepo.value.getText();
                    System.out.println("Gender " + gender);
                } else {
                    System.out.println("Gender value is missing ");
                }
                CardoutTriggerStatisticsRepo.byHomeCity.click();
                waitForSpinnerToBeInVisible();
                if (isElementVisible(CardoutTriggerStatisticsRepo.value)) {
                    String homecity = CardoutTriggerStatisticsRepo.value.getText();
                    System.out.println("Home city " + homecity);
                } else {
                    System.out.println("Home city value is missing ");
                }

                CardoutTriggerStatisticsRepo.byEthnicGroup.click();
                waitForSpinnerToBeInVisible();
                if (isElementVisible(CardoutTriggerStatisticsRepo.value)) {
                    String ethnicGroup = CardoutTriggerStatisticsRepo.value.getText();
                    System.out.println("Ethnic group " + ethnicGroup);
                } else {
                    System.out.println("Ethnic group value is missing ");
                }
                CardoutTriggerStatisticsRepo.byHomeState.click();
                waitForSpinnerToBeInVisible();
                if (isElementVisible(CardoutTriggerStatisticsRepo.value)) {
                    String homeState = CardoutTriggerStatisticsRepo.value.getText();
                    System.out.println("Home State is " + homeState);
                } else {
                    System.out.println("Home state value is missing ");
                }
                CardoutTriggerStatisticsRepo.byHomeCountry.click();
                waitForSpinnerToBeInVisible();
                if (isElementVisible(CardoutTriggerStatisticsRepo.value)) {
                    String homeCountry = CardoutTriggerStatisticsRepo.value.getText();
                    System.out.println("Home country is " + homeCountry);
                } else {
                    System.out.println("Home country value is missing ");
                }
                CardoutTriggerStatisticsRepo.byTier.click();
                waitForSpinnerToBeInVisible();
                if (isElementVisible(CardoutTriggerStatisticsRepo.value)) {
                    String tier = CardoutTriggerStatisticsRepo.value.getText();
                    System.out.println("Tier " + tier);
                } else {
                    System.out.println("Tier value is missing ");
                }

            }

        }
        return true;
        }


    }

