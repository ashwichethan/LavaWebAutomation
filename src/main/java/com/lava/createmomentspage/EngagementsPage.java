package com.lava.createmomentspage;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by Dewesh Yadav on 3/8/2017.
 */
public class EngagementsPage extends Base {

  EngagementsRepo engRp;

  public EngagementsPage(){
    engRp = new EngagementsRepo(driver);
  }

  public void switchToEngagementColumn(){
      EngagementsRepo.engagmentsColumnTitle.click();
  }

    public boolean dragAndDropEngagments(String dragEngagement, String tabName) {

        List<WebElement> selectCategory = EngagementsRepo.categoriesTabForEngagements;
        WebElement arrowBtnInTab = EngagementsRepo.carouselrightarrow;
        List<WebElement> nodeToDrag = EngagementsRepo.allEngagementsNode;
        List<WebElement> innerCarouselArrowBtn = EngagementsRepo.nextArrowInCarousel;
        List<WebElement> engagmentsColumn = EngagementsRepo.engagementsColumn;
        WebElement column = engagmentsColumn.get(0);
    sleep(1000);
    switchToEngagementColumn();
    sleep(1000);
    carouselCategorySelection(tabName,selectCategory,arrowBtnInTab);
    carouselNodeSelection(dragEngagement,nodeToDrag,innerCarouselArrowBtn,column);

        return true;
  }
    public boolean dragAndDropEngagments2(String dragEngagement, String tabName) {

        List<WebElement> selectCategory = EngagementsRepo.categoriesTabForEngagements;
        WebElement arrowBtnInTab = EngagementsRepo.carouselrightarrow;
        List<WebElement> nodeToDrag = EngagementsRepo.allEngagementsNode;
        List<WebElement> innerCarouselArrowBtn = EngagementsRepo.nextArrowInCarousel;
        List<WebElement> engagmentsColumn = EngagementsRepo.engagementsColumn2;
        WebElement column = engagmentsColumn.get(0);
        sleep(1000);
        switchToEngagementColumn();
        sleep(1000);
        carouselCategorySelection(tabName,selectCategory,arrowBtnInTab);
        carouselNodeSelection(dragEngagement,nodeToDrag,innerCarouselArrowBtn,column);

        return true;
    }



    public boolean dragAndDropEngagmentsPrioritz(String dragEngagement, String tabName) {

        List<WebElement> selectCategory = EngagementsRepo.categoriesTabForEngagements;
        WebElement arrowBtnInTab = EngagementsRepo.carouselrightarrow;
        List<WebElement> nodeToDrag = EngagementsRepo.allEngagementsNode;
        List<WebElement> innerCarouselArrowBtn = EngagementsRepo.nextArrowInCarousel;
        List<WebElement> engagmentsColumn = EngagementsRepo.engagementsColumn;
        WebElement column = engagmentsColumn.get(1);

        sleep(1000);
        switchToEngagementColumn();
        sleep(1000);
        carouselCategorySelection(tabName,selectCategory,arrowBtnInTab);
        carouselNodeSelection(dragEngagement,nodeToDrag,innerCarouselArrowBtn,column);

        return true;
    }


    public boolean clickEngageWithColumn(){
        engRp.engageWithColumn.click();
      return true;
    }

    public boolean getWarningToastForEngagements(){
        waitUntilElementIsVisible(engRp.getEngagementsWarning);
        String warning = engRp.getEngagementsWarning.getText();
        waitForElementToBeInvisible(engRp.getEngagementsWarning);
        return (warning.contains("Engagement test a mobile already exist"));
    }
}
