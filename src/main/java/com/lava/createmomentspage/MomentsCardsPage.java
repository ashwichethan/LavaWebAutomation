package com.lava.createmomentspage;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

/**
 * Created by jenkins on 19/05/17.
 */
public class MomentsCardsPage extends Base {
    MomentsCardsRepo mCpg;
    public MomentsCardsPage(){mCpg = new MomentsCardsRepo(driver);}

    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(MomentsCardsRepo.spinnerOverlay);
    }


public void navigateToMomentsPage(){
    if(isElementVisible(MomentsCardsRepo.momentsPageTitle)==false) {
        MomentsCardsRepo.designTab.click();
        MomentsCardsRepo.momentsTab.click();
        //waitUntilResourcePageIsDisplayed();
        sleep(2000);
        waitForSpinnerToBeInVisible();
        if (isElementVisible(MomentsCardsRepo.spinnerOverlay)) {
            waitForSpinnerToBeInVisible();
        }
        sleep(2000);
    }
    if (isElementVisible(MomentsCardsRepo.spinnerOverlay)) {
        waitForSpinnerToBeInVisible();
    }
}

    public boolean cards()
    {
        refreshPage();
        if(isElementVisible(MomentsCardsRepo.spinnerOverlay)){
            waitForSpinnerToBeInVisible();
        }
    navigateToMomentsPage();
    MomentsCardsRepo.cardsTab.click();
    sleep(1000);
    cardsDashboard();

    return true;
     }

    WebElement cardContents;
    String cardContentsInString;

     public void cardsDashboard(){
        System.out.println("Total number of moment cards :"+ MomentsCardsRepo.momentCards.size());

        for(int index = 0; index< MomentsCardsRepo.momentCards.size(); index++) {

            cardContents = MomentsCardsRepo.cardHeaderContent.get(index);
            scrollToElement(cardContents);
            cardContentsInString = cardContents.getText();
            System.out.println("Card header " + cardContentsInString);

            cardContents = MomentsCardsRepo.cardBodyContent.get(index);
            cardContentsInString = cardContents.getText();
            System.out.println("Body message in card " + cardContentsInString);

            cardContents = MomentsCardsRepo.cardFooterContent.get(index);
            cardContentsInString = cardContents.getText();
            System.out.println("Footer of card " + cardContentsInString);




        }

        }



}
