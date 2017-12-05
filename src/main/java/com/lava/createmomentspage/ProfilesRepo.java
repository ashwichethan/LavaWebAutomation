package com.lava.createmomentspage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Dewesh Yadav on 3/8/2017.
 */
public class ProfilesRepo extends ObjectsBase{

  @FindBy(xpath = "//a[@aria-controls='ProfileEveryone' or contains(.,'Everyone')]")
  protected static WebElement everyoneTab;
  @FindBy(xpath = "//*[contains(.,'Everyone')]/descendant::span[contains(.,'Every Customer')]")
  protected static WebElement everycustomerNode;
  @FindBy(xpath = "//h6[@class='segment-drag']")
  protected static WebElement profileColumn;
  @FindBy(xpath = "//div[@class=\"column-content column-segment\"]")
  protected static WebElement profileColumn2;
  @FindBy(xpath = "//div[@class='float tabs-list segment-tabs']/descendant::div[@class='scrtabs-tab-scroll-arrow scrtabs-js-tab-scroll-arrow-right']")
  protected static WebElement carouselrightarrow;
  @FindBy(xpath = "//div[@class='float list-segment']/descendant::div[@class='float tab-pane ng-scope active']/descendant::span")
  protected static List<WebElement> allSegmentsNode;
  @FindBy(xpath = "//div[@class='scrtabs-tabs-fixed-container']/descendant::ul[@class='nav nav-tabs']/descendant::li[@ng-class='{active : segmentTab == segmentCategoriesList[0]}']")
  protected static List<WebElement> categoriesTabForSegments;
 //old xpath
  @FindBy(xpath = "//div[@class='carousel-pagination ng-scope']/descendant::a[@class='bx-next' and @ng-click='changeSlideNext(segmentTab.categories.length / 9, $event)']")
  protected static List<WebElement> nextArrowInCarousel1;
  //new xpath
  @FindBy(xpath = "//div[@class=\"float list-segment\"]/descendant::div[@class=\"float tab-pane ng-scope active\"]/descendant::a[@class=\"bx-next\"]")
  protected static List<WebElement> nextArrowInCarousel;
  @FindBy(xpath = "//div[@class=\"toast toast-warning\"]/descendant::div[contains(.,'Profile with Every Customer already exist')]")
  protected static WebElement getProfileWarning;

  public ProfilesRepo(RemoteWebDriver driver) {
    super(driver);
  }
}
