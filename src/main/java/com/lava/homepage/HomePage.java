package com.lava.homepage;

import com.lava.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by codecraft on 25/11/16.
 */
public class HomePage extends Base {

    private static HomePageObject ho;

    public HomePage() {
        ho = new HomePageObject(driver);
    }
    String page;
    int statusCount;
    public boolean isHomePageVisible() {
        return isElementVisible(HomePageObject.homepage);
    }
    public  boolean isMomentPageVisible() {return isElementVisible(HomePageObject.momentlistpage);}
    public boolean draftButtonVisible() {return isElementVisible(HomePageObject.draftarrowbutton);}

    public boolean liveButtonVisible() {return isElementVisible(HomePageObject.livearrowbutton);}
    public boolean submitButtonVisible() {return isElementVisible(HomePageObject.submitarrowbutton);}

    public void clickDraftArrowButton() {
        HomePageObject.draftarrowbutton.click();}
    public void clickLiveArrowButton() {
        HomePageObject.livearrowbutton.click();}
    public void clickSubmitArrowButton() {
        HomePageObject.submitarrowbutton.click();}
    public  void clickHomeTabButton(){
        HomePageObject.hometab.click();}


    public boolean verifySearchTextAsDraft(){
        String getSearchText = HomePageObject.searchByStatusPlaceholder.getAttribute("value");
        System.out.println("Search box has the text : '" + getSearchText+ "'");
        return getSearchText.equalsIgnoreCase("Draft");
    }

    public boolean verifySearchTextAsLive(){
        String getSearchText = HomePageObject.searchByStatusPlaceholder.getAttribute("value");
        System.out.println("Search box has the text : '" + getSearchText+ "'");
        return getSearchText.equalsIgnoreCase("Live");
    }


    public boolean verifySearchTextAsSubmitted(){
        String getSearchText = HomePageObject.searchByStatusPlaceholder.getAttribute("value");
        System.out.println("Search box has the text : '" + getSearchText + "'");
        back();
        return getSearchText.equalsIgnoreCase("Submitted");
    }

    public boolean isDraftButtonVisible(){
        sleep(2000);
        return draftButtonVisible();
    }

      public boolean draftValue(){
          return isElementVisible(HomePageObject.draftText);
      }

    public boolean ishomeTitleVisible(){
        sleep(3000);

        return isElementVisible(HomePageObject.homeTitle);

    }

    String momentStatus = "MOMENT STATUS";
    public boolean isTitleTextMatched(){
        String title = HomePageObject.homeTitle.getText();
        return title.equals(momentStatus);
    }
    public boolean isCreateNewBtnVisible(){
        return isElementVisible(HomePageObject.createNewMomentBtn);
    }
    String createNewBtnText = "CREATE NEW MOMENT";
    public boolean iscreateNewBtnMatched(){
        String title = HomePageObject.createNewMomentBtn.getText();
        return title.equals(createNewBtnText);
    }
    String drafttext = "DRAFT";
    public boolean isdraftMatched(){
        String draft = HomePageObject.draftMoments.getText();
        return draft.equals(drafttext);
    }
    String liveText = "LIVE MOMENTS";
    public boolean isliveMatched(){
        String live = HomePageObject.liveMoments.getText();
        return live.equals(liveText);
    }
    public boolean isTopLiveTitleVisible(){
        return isElementVisible(HomePageObject.topMomentsTitle);
    }
    public boolean isTopLive4MomentsVisible(){
        int topMoments = HomePageObject.topLiveMoments4.size();
        return topMoments == 4;
    }
    int liveValue=0;
    public int  topMoments1(){
        String totalLiveMoments = HomePageObject.totalLiveMoments.getText();
         liveValue = Integer.parseInt(totalLiveMoments);
        return liveValue;
    }

    public boolean  topMoments(){
        String totalLiveMoments = HomePageObject.totalLiveMoments.getText();
        liveValue = Integer.parseInt(totalLiveMoments);
        System.out.println("Live value "+liveValue);
        int topLive = HomePageObject.topLiveMoments.size();
            return (topLive <= liveValue);
    }



    public boolean emptyMoments(){
        int emptyMoments=0;
        String nothing = "NOTHING TO DISPLAY YET.";
        String create = "CREATE A MOMENT.";

        if(topMoments1()<4) {
            emptyMoments = HomePageObject.emptyMoments.size();
            System.out.println("Empty moments are " + emptyMoments);

            String nothingToDisplayYet = HomePageObject.nothingToDisplayText.get(0).getText();
            String createAMoment = HomePageObject.nothingToDisplayText.get(1).getText();
            return nothing.equals(nothingToDisplayYet) && create.equals(createAMoment);
        }
       return true;
    }

    String pendingText = "PENDING";
    public boolean isPendingMatched(){
        String pending = HomePageObject.pendingMoments.getText();
        return pending.equals(pendingText);
    }

    public boolean homePage(){
       refreshPage();
        if(isElementVisible(HomePageObject.spinnerOverlay))
            waitForSpinnerToBeInVisible();
        if (isElementVisible(HomePageObject.homePageActive)==false)
            HomePageObject.homePageActive.click();
        return true;
    }
    public void waitForSpinnerToBeInVisible() {
        waitForElementToBeInvisible(HomePageObject.spinnerOverlay);
    }


 public boolean isLiveButtonVisible(){

        clickHomeTabButton();
     sleep(2000);

     return liveButtonVisible();
 }

    public boolean isSubmitButtonVisible(){

        clickHomeTabButton();
        sleep(2000);
        return submitButtonVisible();
    }

    public int getStatusIconCount(){

        if(page == "Draft") {
            List<WebElement> listOftstatusicons = HomePageObject.draftstatusicon;
            statusCount = listOftstatusicons.size();
            System.out.println("Total no of Status icons : '" + statusCount + "'");
        } else if (page == "Live"){
            List<WebElement> listOftstatusicons = HomePageObject.livestatusicon;
            statusCount = listOftstatusicons.size();
            System.out.println("Total no of Status icons : '" + statusCount + "'");
        }else if(page == "Submit"){
            List<WebElement> listOftstatusicons = HomePageObject.submitstatusicon;
            statusCount = listOftstatusicons.size();
            System.out.println("Total no of Status icons : '" + statusCount + "'");
        }
        return statusCount;
    }

    public boolean getDraftRulesCount(){
        int getDraftedRulesCount = Integer.parseInt(HomePageObject.draftcount.getText());
        System.out.println("Draft count : '" + getDraftedRulesCount+ "'");

        clickDraftArrowButton();
        page = "Draft";
        sleep(5000);

        getStatusIconCount();

        return getDraftedRulesCount == statusCount;

    }

    public boolean getLiveRulesCount(){
        int getLiveRulesCount = Integer.parseInt(HomePageObject.livecount.getText());
        System.out.println("Live count : '" + getLiveRulesCount+ "'");

        clickLiveArrowButton();
        page = "Live";
        sleep(5000);

        getStatusIconCount();

        return getLiveRulesCount == statusCount;

    }

    public boolean getSubmittedRulesCount(){
        int getSubmittedRulesCount = Integer.parseInt(HomePageObject.submitcount.getText());
        System.out.println("Submit count : '" + getSubmittedRulesCount+ "'");

        clickSubmitArrowButton();
        page = "Submit";
        sleep(5000);


        getStatusIconCount();

        return getSubmittedRulesCount == statusCount;

    }
}