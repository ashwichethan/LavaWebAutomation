package com.lava.modaldialog;

import com.lava.utils.Base;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by codecraft on 25/11/16.
 */
public class ModalDialog extends Base {

  private static ModalDialogObjectRepo mo;

  public ModalDialog() {
    mo = new ModalDialogObjectRepo(driver);
  }

  public void waitUntillPopUpIsDisplayed() {
    waitUntilElementIsVisible(ModalDialogObjectRepo.popUp);
  }

  public void acceptModalDialog() {
    ModalDialogObjectRepo.yesButton.click();
  }

  public void cancelModalDialog() {
    ModalDialogObjectRepo.cancelButton.click();
  }

  public void waitUntilModalDialogIsDisplayed() {
    waitUntilElementIsVisible(ModalDialogObjectRepo.modalDialog);
  }

  public void waitUntilModalDialogIsDisplayedOfExternallist() {
    waitUntilElementIsVisible(ModalDialogObjectRepo.modalDialogofExternallist);
  }

//  public boolean isModalDialogDisplayed() {
//    if (isElementVisible(mo.modalDialog))
//      return true;
//    return false;
//  }

  public boolean isModalDialogDisplayed() {

    if (isElementVisible(ModalDialogObjectRepo.dynamicModalDialog)) {
      return true;
    } else if (isElementVisible(ModalDialogObjectRepo.scheduleModalDialog)) {
      return true;
    } else if (isElementVisible(ModalDialogObjectRepo.dynamicProfileModalTwoDialog)) {
      return true;
    } else if (isElementVisible(ModalDialogObjectRepo.groupModalDialog)) {
      return true;
    }

    return false;
  }

  public void enterValuesInTextBox(String input, String placeHolderText) {
    try {
      List<WebElement> textFields = ModalDialogObjectRepo.alltextFields;
      //Check how many text fields are present in Pop up
      for (int textFieldCount = 0; textFieldCount < textFields.size(); textFieldCount++) {

        WebElement text = textFields.get(textFieldCount);
        String textFieldName = text.getAttribute("placeholder");
        if (textFieldName.contains(placeHolderText))
          text.click();
        text.sendKeys(input);
      }
    } catch (Exception e) {
      System.out.println("Something went wrong on entering values to input boxes. Printing the Exception: " + e);
    }
  }

  public void pickValuesFromDropDown(String valueToSelect, int dropBoxCount) {
    try {

      List<WebElement> listOfAllDropDowns = ModalDialogObjectRepo.dropDown;
      WebElement individualDropBox = listOfAllDropDowns.get(dropBoxCount);
      individualDropBox.click();
      sleep(500);
      for (WebElement selectValue : ModalDialogObjectRepo.listOfDropDownValues) {
        String text = selectValue.getText();
        System.out.println("Text of the drop down list: " + text);
        if (selectValue.getText().equalsIgnoreCase(valueToSelect)) {
          selectValue.click();
          break;
        }
      }
    } catch (Exception e) {
      System.out.println("Something went wrong on getting values from Drop down. Printing the Exception: " + e);
    }
  }


  public void selectRadioButton(String valueToSelect) {
    try {
      List<WebElement> listOfAllRadioButtons = ModalDialogObjectRepo.radioButtons;
      //Check how many text fields are present in Pop up
      for (int btnCount = 0; btnCount < listOfAllRadioButtons.size(); btnCount++) {
        WebElement radioBtn = listOfAllRadioButtons.get(btnCount);
        String btnLabel = radioBtn.getText();
        if (btnLabel.contains(valueToSelect))
          radioBtn.click();
      }
    } catch (Exception e) {
      System.out.println("Something went wrong on clicking the Radio Buttons. Printing the Exception: " + e);
    }
  }

  public void selectCheckBoxValue(String valueToSelect) {
    try {
      List<WebElement> listOfAllCheckBoxes = ModalDialogObjectRepo.checkBoxListValues;
      //Check how many text fields are present in Pop up
      for (int btnCount = 0; btnCount < listOfAllCheckBoxes.size(); btnCount++) {
        WebElement checkBox = listOfAllCheckBoxes.get(btnCount);
        String btnLabel = checkBox.getText();
        if (btnLabel.contains(valueToSelect))
          checkBox.click();
        break;
      }
    } catch (Exception e) {
      System.out.println("Something went wrong on clicking the Check Boxes. May be there is no element to Click. Printing the Exception: " + e);
    }
  }

  public void selectCheckBoxValueRandomly() {
    try {
      List<WebElement> listOfAllCheckBoxes = ModalDialogObjectRepo.checkBoxListValues;
      listOfAllCheckBoxes.get(1).click();
    } catch (Exception e) {
      System.out.println("Something went wrong on clicking the Check Boxes. May be there is no element to Click. Printing the Exception: " + e);
    }
  }

  public void pickValuesFromDropDownRandomly(int dropBoxCount) {
    try {
      List<WebElement> listOfAllDropDowns = ModalDialogObjectRepo.dropDown;
      WebElement individualDropBox = listOfAllDropDowns.get(dropBoxCount);
      individualDropBox.click();
      sleep(500);
      ModalDialogObjectRepo.listOfDropDownValues.get(1).click();
    } catch (Exception e) {
      System.out.println("Something went wrong on getting values from Drop down. May be there is no element to Click. Printing the Exception: " + e);
    }
  }

  public void selectRadioButtonRandomly() {
    try {
      List<WebElement> listOfAllRadioButtons = ModalDialogObjectRepo.radioButtons;
      listOfAllRadioButtons.get(1).click();
    } catch (Exception e) {
      System.out.println("Something went wrong on clicking the Radio Buttons. Printing the Exception: " + e);
    }
  }

  public void enterValuesInTextBoxRandomlyForOnlyNumerics() {
    try {
      List<WebElement> textFields = ModalDialogObjectRepo.alltextFields;
      textFields.get(0).click();
      textFields.get(0).sendKeys(RandomStringUtils.randomNumeric(2));
    } catch (Exception e) {
      System.out.println("Something went wrong on entering values to input boxes. Printing the Exception: " + e);
    }
  }

  public void enterValuesInTextBoxRandomlyForOnlyStrings() {
    try {
      List<WebElement> textFields = ModalDialogObjectRepo.alltextFields;
      textFields.get(0).click();
      textFields.get(0).sendKeys("AutomationName_" + generateRandomString(3));
    } catch (Exception e) {
      System.out.println("Something went wrong on entering values to input boxes. Printing the Exception: " + e);
    }
  }

  public String getModalTitle() {

    String modalTitle = ModalDialogObjectRepo.modalTitle.getText();
    return modalTitle;
  }


  public boolean isDynamicModalDialogDisplayed() {
    return isElementVisible(ModalDialogObjectRepo.dynamicModalDialog);
  }


}
