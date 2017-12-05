package com.lava.createmomentspage;

import com.lava.modaldialog.ModalDialog;
import com.lava.modaldialog.ModalDialogObjectRepo;
import com.lava.utils.Base;
//import com.sun.java.util.jar.pack.Instruction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by Dewesh Yadav on 3/8/2017.
 */
public class TriggersPage extends Base {

  TriggersRepo TrRp;
    //ModalDialogObjectRepo dialogObjRepo;
    ModalDialog mo;
  public TriggersPage(){
    TrRp = new TriggersRepo(driver);
      mo = new ModalDialog();

  }

    public void selectAreaDropDown() {
        TriggersRepo.selectAreaDirectionDropDownBox.click();
    }

    public void selectAreaValue() {
        TriggersRepo.areaList.click();
    }

    public void clickDoneButton() {
        TriggersRepo.doneButton.click();
    }


    public boolean dragAndDropTrigger(String dragTrigger, String tabName) {

        List<WebElement> selectCategory = TriggersRepo.categoriesTabForTriggers;
        WebElement arrowBtnInTab = TriggersRepo.carouselrightarrow;
        List<WebElement> nodeToDrag = TriggersRepo.allTriggersNode;
        List<WebElement> innerCarouselArrowBtn = TriggersRepo.nextArrowInCarousel;
        WebElement triggerColumn = TriggersRepo.triggerColumn;

    carouselCategorySelection(tabName,selectCategory,arrowBtnInTab);
    carouselNodeSelection(dragTrigger,nodeToDrag,innerCarouselArrowBtn,triggerColumn);
        sleep(1000);

        return true;
    }

    public boolean dragAndDropTrigger2(String dragTrigger, String tabName) {

        List<WebElement> selectCategory = TriggersRepo.categoriesTabForTriggers;
        WebElement arrowBtnInTab = TriggersRepo.carouselrightarrow;
        List<WebElement> nodeToDrag = TriggersRepo.allTriggersNode;
        List<WebElement> innerCarouselArrowBtn = TriggersRepo.nextArrowInCarousel;
        WebElement triggerColumn = TriggersRepo.triggerColumn2;

        carouselCategorySelection(tabName,selectCategory,arrowBtnInTab);
        carouselNodeSelection(dragTrigger,nodeToDrag,innerCarouselArrowBtn,triggerColumn);
        sleep(1000);

        return true;
    }


   public boolean clickTriggerColumn(){
    TrRp.clickTriggerColumn.click();
    sleep(2000);
      return true;
   }

    public boolean getWarningToastForTrigger(){
        waitUntilElementIsVisible(TrRp.getTriggerWarning);
        String warning = TrRp.getTriggerWarning.getText();
        waitForElementToBeInvisible(TrRp.getTriggerWarning);
        return (warning.contains("Trigger with Enter/exit Area already exist"));
    }





}
