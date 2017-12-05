package com.lava.createmomentspage;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by Dewesh Yadav on 3/8/2017.
 */
public class ProfilesPage extends Base {

  ProfilesRepo PrRp;
  Actions action = new Actions(driver);
  String categoryName;
  WebElement category;
  String nodeName;
  WebElement node;

  public ProfilesPage(){
    PrRp = new ProfilesRepo(driver);
  }

    public boolean dragAndDropProfiles(String dragProfile, String tabName) {

        List<WebElement> selectCategory = ProfilesRepo.categoriesTabForSegments;
        WebElement arrowBtnInTab = ProfilesRepo.carouselrightarrow;
        List<WebElement> nodeToDrag = ProfilesRepo.allSegmentsNode;
        List<WebElement> innerCarouselArrowBtn = ProfilesRepo.nextArrowInCarousel;
        WebElement profileColumn = ProfilesRepo.profileColumn;
            carouselCategorySelection(tabName, selectCategory, arrowBtnInTab);
            carouselNodeSelection(dragProfile, nodeToDrag, innerCarouselArrowBtn, profileColumn);
        return true;
  }


    public boolean dragAndDropProfiles2(String dragProfile, String tabName) {

        List<WebElement> selectCategory = ProfilesRepo.categoriesTabForSegments;
        WebElement arrowBtnInTab = ProfilesRepo.carouselrightarrow;
        List<WebElement> nodeToDrag = ProfilesRepo.allSegmentsNode;
        List<WebElement> innerCarouselArrowBtn = ProfilesRepo.nextArrowInCarousel;
        WebElement profileColumn = ProfilesRepo.profileColumn2;
        carouselCategorySelection(tabName, selectCategory, arrowBtnInTab);
        carouselNodeSelection(dragProfile, nodeToDrag, innerCarouselArrowBtn, profileColumn);
        return true;
    }



    public boolean getWarningToastForProfiles(){
        waitUntilElementIsVisible(PrRp.getProfileWarning);
        String warning = PrRp.getProfileWarning.getText();
        waitForElementToBeInvisible(PrRp.getProfileWarning);
        return (warning.contains("Profile with Every Customer already exist"));
    }




}
