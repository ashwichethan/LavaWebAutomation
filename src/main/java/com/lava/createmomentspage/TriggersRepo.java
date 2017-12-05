package com.lava.createmomentspage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Dewesh Yadav on 3/8/2017.
 */
public class TriggersRepo extends ObjectsBase{

  // Elements belonging to Triggers
  @FindBy(xpath = "//span[contains(text(),'Post session player update')]")
  protected static WebElement postSessionPlayerUpdateNode;
  @FindBy(xpath = "//h6[@class=\"trigger-drag\"]")
  protected static WebElement triggerColumn;
  @FindBy(xpath = "//div[@class=\"column-content column-trigger\"]")
  protected static WebElement triggerColumn2;
  @FindBy(xpath = "//a[@aria-controls='TriggerSwipeScan' or contains(.,'Swipe & Scan')]")
  protected static WebElement swipeAndScanTab;
  @FindBy(xpath = "//*[contains(.,'Swipe & Scan')]/descendant::span[contains(.,'MaterPass purchase')]")
  protected static WebElement masterPassPurchaseNode;
  @FindBy(xpath = "//a[@aria-controls='TriggerGaming' or contains(.,'Gaming')]")
  protected static WebElement gamingTab;
  @FindBy(xpath = "//div[contains(.,'Presence')]/descendant::span[contains(.,'Enter/exit Area')]")
  protected static WebElement areaNode;
  @FindBy(xpath = "//a[@aria-controls='TriggerPresence' or contains(.,'Presence')]")
  protected static WebElement presenceTab;
  @FindBy(xpath = "//span[@class='current']")
  protected static WebElement selectAreaDirectionDropDownBox;
  @FindBy(xpath = "//form[@id='moment-form']/descendant::ul[@class='list']")
  protected static List<WebElement> directionValues;
  @FindBy(xpath = "//form[@id='moment-form']/descendant::label[@class='checkbox ng-binding' and @for=\"area_list-0\"]")
  protected static WebElement areaList;
  @FindBy(xpath = "//button[@id='btn_Offers']")
  protected static WebElement doneButton;
  // Elements belonging to Profiles
  @FindBy(xpath = "//a[@aria-controls='ProfileEveryone' or contains(.,'Everyone')]")
  protected static WebElement everyoneTab;
  @FindBy(xpath = "//*[contains(.,'Everyone')]/descendant::span[contains(.,'Every Customer')]")
  protected static WebElement everycustomerNode;
  @FindBy(xpath = "//h6[@class='segment-drag']")
  protected static WebElement profileColumn;
  @FindBy(xpath = "//div[@class='float list-trigger']/descendant::div[@class='float tab-pane ng-scope active']/descendant::span")
  protected static List<WebElement> allTriggersNode;
  @FindBy(xpath = "//div[@class='scrtabs-tabs-movable-container']/descendant::ul[@class='nav nav-tabs']/descendant::li[@ng-class='{active : triggerTab == triggerCategoriesList[0]}']")
  protected static List<WebElement> categoriesTabForTriggers;
  @FindBy(xpath = "//div[@class='float tabs-list trigger-tabs']/descendant::div[@class='scrtabs-tab-scroll-arrow scrtabs-js-tab-scroll-arrow-right']")
  protected static WebElement carouselrightarrow;
  //old xpath
  @FindBy(xpath = "//div[@class='carousel-pagination ng-scope']/descendant::a[@class='bx-next' and @ng-click='changeSlideNext(triggerTab.categories.length / 9, $event)']")
  protected static List<WebElement> nextArrowInCarousel1;
  //new xpath
  @FindBy(xpath = "//div[@class=\"float list-trigger\"]/descendant::div[@class=\"float tab-pane ng-scope active\"]/descendant::a[@class=\"bx-next\"]")
  protected static List<WebElement> nextArrowInCarousel;


    @FindBy(xpath = "//div[@id='dynamic-modal']/descendant::div[@class='modal-content']")
    protected static WebElement dynamicModel;

  @FindBy(xpath = "//div[@class=\"column-content column-trigger\"]")
  protected static WebElement clickTriggerColumn;

  @FindBy(xpath = "//div[@class=\"toast toast-warning\"]/descendant::div[contains(.,'Trigger with Enter/exit Area already exist')]")
  protected static WebElement getTriggerWarning;




    public TriggersRepo(RemoteWebDriver driver) {
        super(driver);
    }

}
