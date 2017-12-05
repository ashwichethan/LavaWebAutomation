package com.lava.createmomentspage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Dewesh Yadav on 3/8/2017.
 */
public class QualifiersRepo extends ObjectsBase{

  @FindBy(xpath = "//*[contains(.,'Everyone')]/descendant::span[contains(.,'Every Customer')]")
  protected static WebElement everycustomerNode;
  @FindBy(xpath = "//h6[@class='qualifier-drag']")
  protected static List<WebElement> qualifierColumn;
  @FindBy(xpath = "//div[@class='float tabs-list qualifier-tabs']/descendant::div[@class='scrtabs-tab-scroll-arrow scrtabs-js-tab-scroll-arrow-right']")
  protected static WebElement carouselrightarrow;
  @FindBy(xpath = "//div[@class='float list-qualifier']/descendant::div[@class='float tab-pane ng-scope active']/descendant::span")
  protected static List<WebElement> allQualifiersNode;
  @FindBy(xpath = "//div[@class='scrtabs-tabs-fixed-container']/descendant::ul[@class='nav nav-tabs']/descendant::li[@ng-class='{active : qualifierTab == qualifierCategoriesList[0]}']")
  protected static List<WebElement> categoriesTabForQualifiers;
 //old xpath
  @FindBy(xpath = "//div[@class='carousel-pagination ng-scope']/descendant::a[@class='bx-next' and @ng-click='changeSlideNext(qualifierTab.categories.length / 9, $event)']")
  protected static List<WebElement> nextArrowInCarousel1;
 //new xpath
  @FindBy(xpath = "//div[@class=\"float list-qualifier\"]/descendant::div[@class=\"float tab-pane ng-scope active\"]/descendant::a[@class=\"bx-next\"]")
  protected static List<WebElement> nextArrowInCarousel;

  @FindBy(xpath = "//div[@id='dynamic-modal']/descendant::div[@class='modal-content']")
  protected static WebElement dynamicModel;
  @FindBy(xpath = "//button[@id='btn_Offers']")
  protected static WebElement doneBtn;

  public QualifiersRepo(RemoteWebDriver driver) {
    super(driver);
  }


}
