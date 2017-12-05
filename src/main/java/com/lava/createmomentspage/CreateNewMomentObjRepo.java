package com.lava.createmomentspage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Dewesh Yadav on 3/6/2017.
 */
public class CreateNewMomentObjRepo extends ObjectsBase {

  @FindBy(xpath = "//a[@class ='button create-button']")
  protected static WebElement createNewMomentBtn;
  @FindBy(xpath = "//div[@ng-show=\"showList\"]/descendant::a[contains(.,'Create new moment')]")
  protected static WebElement createNewMomentBtnInMomentsPage;
  @FindBy(xpath = "//li[contains(@class,\"home\")]/descendant::a[contains(.,'Home')]")
  protected static WebElement homeTab;
  @FindBy(xpath = "//div[@class='moment-title']/descendant::input[@id='input-title']")
  protected static WebElement momentTitleBox;
  @FindBy(xpath = "//div[@class='submit-moment']/descendant::button[@class='submit-moment-btn']")
  protected static WebElement saveMomentBtn;
  @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
  protected static WebElement successToastAlert;
  @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
  protected static WebElement spinnerOverlay;
  @FindBy(xpath = ".//tr[@class=\"ng-scope\"]")
  protected static List<WebElement> momentList;
  @FindBy(xpath = "//div[@class='status-buttons']/descendant::button[contains(@class,'moment-delete-button')]")
  protected static WebElement deleteMomentBtn;
  @FindBy(xpath = "//div[@class='modal-footer warning-footer ng-scope']/descendant::button[@class='btn btn-primary btn-cancel ng-binding' and contains(text(),'Delete')]")
  protected static WebElement deleteBtnInDialogs;
  @FindBy(xpath = "//section[@id='content-section']")
  protected static WebElement innerPage;
  @FindBy(xpath = "//div[@class='moments-table sortable scrolling']/descendant::div[@class='scrolling-table ps-container ps-active-y']/descendant::table[@class='table-moments table-fixedheader table-scrollcontent ng-scope']/descendant::tr[@class=\"ng-scope\"]/descendant::td[contains(.,'Test 1234')]")
  protected static WebElement momentTest123;
  @FindBy(xpath = "//li[@class='design has-submenu active']/descendant::a[contains(.,'Design')]")
  protected static WebElement designTab;
  @FindBy(xpath = "//li[@class='design has-submenu active hovered']/descendant::ul[@class='submenu show']/descendant::a[contains(.,'Moments')]")
  protected static WebElement momentsTab;
  @FindBy(xpath = "//button[@class=\"moment-submit-button ng-scope\"]")
  protected static WebElement submitBtn;
  @FindBy(xpath = "//button[@class=\"moment-approve-button ng-scope\"]")
  protected static WebElement approveBtn;
  @FindBy(xpath = "//button[@class=\"moment-suspend-button ng-scope\"]")
  protected static WebElement suspendBtn;
  @FindBy(xpath = "//button[@class=\"moment-reject-button ng-scope\"]")
  protected static WebElement rejectBtn;

  public CreateNewMomentObjRepo(RemoteWebDriver driver) {
    super(driver);
  }


}
