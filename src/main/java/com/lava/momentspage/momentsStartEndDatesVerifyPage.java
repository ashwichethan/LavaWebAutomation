package com.lava.momentspage;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by jenkins on 01/06/17.
 */
public class momentsStartEndDatesVerifyPage extends Base {
    momentsStartEndDatesVerifyRepo mSEDv;

    public momentsStartEndDatesVerifyPage() {
        mSEDv = new momentsStartEndDatesVerifyRepo(driver);
    }

    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(momentsStartEndDatesVerifyRepo.spinnerOverlay);
    }

    public boolean isMomentsTabVisible() {
        return isElementVisible(momentsStartEndDatesVerifyRepo.momentsTab);
    }

    public boolean moments() {
        navigateToMomentsPage();
        momentDetails();
        return true;
    }

    public void navigateToMomentsPage() {
        if(isElementVisible(momentsStartEndDatesVerifyRepo.momentsPageTitle)==false) {
    momentsStartEndDatesVerifyRepo.designTab.click();
    sleep(1000);
    isMomentsTabVisible();
    momentsStartEndDatesVerifyRepo.momentsTab.click();
    sleep(2000);
    waitForSpinnerToBeInVisible();
    sleep(1000);
    if (isElementVisible(momentsStartEndDatesVerifyRepo.spinnerOverlay)) {
        waitForSpinnerToBeInVisible();


    }
}
    }

    public void momentDetails() {
        List<WebElement> allmomentslist = momentsStartEndDatesVerifyRepo.momentsList;
        System.out.println("Total moments in list " + allmomentslist.size());
        for (int index = 0; index < allmomentslist.size(); index++) {
            WebElement moment = allmomentslist.get(index);
            scrollToElement(moment);
            moment.click();
            sleep(1000);
            int i = index + 1;
            String momentName = moment.getText();
            System.out.println("Name of " + i + "th moment is " + momentName);
            String trigger = momentsStartEndDatesVerifyRepo.triggerInMoment.getText();
            System.out.println("Trigger shown in list  " + trigger);
            String startdate = momentsStartEndDatesVerifyRepo.startDate.getText();
            StringBuilder onlystartdate = new StringBuilder(startdate);
            StringBuilder sd = onlystartdate.delete(10,20);
             String s = sd.toString();
            System.out.println("start date in list " +sd);
            String enddate = momentsStartEndDatesVerifyRepo.endDate.getText();
            StringBuilder onlyenddate = new StringBuilder(enddate);
            StringBuilder ed = onlyenddate.delete(10,20);
            String e = ed.toString();
            System.out.println("end date in list " +ed);
            momentsStartEndDatesVerifyRepo.viewBtn.click();
            sleep(1000);
            waitForSpinnerToBeInVisible();
            sleep(1000);
            scrollToElement(momentsStartEndDatesVerifyRepo.triggerName);
            String triggerInsideMoment = momentsStartEndDatesVerifyRepo.triggerName.getText();
            System.out.println("Trigger inside the moment is " + triggerInsideMoment);
            if(triggerInsideMoment.equalsIgnoreCase(trigger)){
                System.out.println("Trigger is matching");

            }
            else {
                System.out.println("Trigger doesn't match");

            }
              String sdm1 = momentsStartEndDatesVerifyRepo.startDateInMoment.getAttribute("value");
             String edm1 = momentsStartEndDatesVerifyRepo.endDateInMoment.getAttribute("value");

             System.out.println("Start date and end date in moment "+sdm1 +" and "+edm1);
            if(sdm1.equalsIgnoreCase(s)){
                System.out.println("Start date matched");
            }
            else{
                System.out.println("Start date doesn't match");
            }
            if(edm1.equalsIgnoreCase(e)){
                System.out.println("End date matched");
            }
            else{
                System.out.println("End date doesn't match");
            }
            momentsStartEndDatesVerifyRepo.toMomentsList.click();
            sleep(1000);
            waitForSpinnerToBeInVisible();
           if(isElementVisible(momentsStartEndDatesVerifyRepo.spinnerOverlay)){
               waitForSpinnerToBeInVisible();
            }
            System.out.println();
        }


    }


}
