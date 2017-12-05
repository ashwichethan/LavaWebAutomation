package com.lava.createmomentspage;

import com.lava.modaldialog.ModalDialog;
import com.lava.modaldialog.ModalDialogObjectRepo;
import com.lava.utils.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by Dewesh Yadav on 3/8/2017.
 */
public class QualifiersPage extends Base {

  QualifiersRepo quaRp;
    ModalDialog mo;

  public QualifiersPage(){
    quaRp = new QualifiersRepo(driver);
      mo = new ModalDialog();
  }

    public void clickDoneBtnInDialogs() {
        QualifiersRepo.doneBtn.click();
    }

    public boolean dragAndDropQualifiers(String dragProfile, String tabName) {

        List<WebElement> selectCategory = QualifiersRepo.categoriesTabForQualifiers;
        WebElement arrowBtnInTab = QualifiersRepo.carouselrightarrow;
        List<WebElement> nodeToDrag = QualifiersRepo.allQualifiersNode;
        List<WebElement> innerCarouselArrowBtn = QualifiersRepo.nextArrowInCarousel;
        List<WebElement> qualifierColumn = QualifiersRepo.qualifierColumn;
        WebElement column = qualifierColumn.get(0);
    carouselCategorySelection(tabName,selectCategory,arrowBtnInTab);
    carouselNodeSelection(dragProfile,nodeToDrag,innerCarouselArrowBtn,column);
        if (mo.getModalTitle().equalsIgnoreCase("Qualifier settings")) {
      clickDoneBtnInDialogs();
    }
        sleep(500);

        return true;
  }

    public boolean dragAndDropQualifiersPriotz(String dragProfile, String tabName) {

        List<WebElement> selectCategory = QualifiersRepo.categoriesTabForQualifiers;
        WebElement arrowBtnInTab = QualifiersRepo.carouselrightarrow;
        List<WebElement> nodeToDrag = QualifiersRepo.allQualifiersNode;
        List<WebElement> innerCarouselArrowBtn = QualifiersRepo.nextArrowInCarousel;
        List<WebElement> qualifierColumn = QualifiersRepo.qualifierColumn;
        WebElement column = qualifierColumn.get(1);
        carouselCategorySelection(tabName,selectCategory,arrowBtnInTab);
        carouselNodeSelection(dragProfile,nodeToDrag,innerCarouselArrowBtn,column);
        if (mo.getModalTitle().equalsIgnoreCase("Qualifier settings")) {
            clickDoneBtnInDialogs();
        }
        sleep(500);

        return true;
    }


//  public void handleDialog(String valueToSelect){
//
//    sleep(2000);
//    boolean isDialogueVisible = isElementVisible(quaRp.dynamicModel);
//
//    if(isDialogueVisible == true) {
//      waitUntilElementIsVisible(quaRp.dynamicModel);
//      mo.selectRadioButton(valueToSelect);
//      clickDoneBtnInDialogs();
//
//    }
//
//  }
}
