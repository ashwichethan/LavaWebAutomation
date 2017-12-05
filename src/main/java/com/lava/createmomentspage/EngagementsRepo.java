package com.lava.createmomentspage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Dewesh Yadav on 3/8/2017.
 */
public class EngagementsRepo extends ObjectsBase{

  public EngagementsRepo(RemoteWebDriver driver){
    super(driver);
  }

  @FindBy(xpath = "//*[@id='content-section']/div[1]/div[2]/div/div[2]/div/div[2]/div/div[6]/div[2]/div/div[5]/div[2]/div/div[1]/div[2]")
  protected static List<WebElement>  engagementsColumnsElement;

  @FindBy(xpath="//span[contains(text(),'Engage With')]")
  protected static WebElement engagmentsColumnTitle;

  @FindBy(xpath="//h6[@class='engagement-drag']")
  protected static List<WebElement> engagementsColumn;

  @FindBy(xpath="//div[@class=\"group-box engagement-group a-group\"]")
  protected static List<WebElement> engagementsColumn2;



  @FindBy(xpath = "//div[@class='float tabs-list engagement-tabs']/descendant::div[@class='scrtabs-tab-scroll-arrow scrtabs-js-tab-scroll-arrow-right']")
  protected static WebElement carouselrightarrow;

  @FindBy(xpath = "//div[@class='float list-engagement']/descendant::div[@class='float tab-pane ng-scope active']/descendant::span")
  protected static List<WebElement> allEngagementsNode;


  @FindBy(xpath = "//div[@class='scrtabs-tabs-fixed-container']/descendant::ul[@class='nav nav-tabs']/descendant::li[@ng-class='{active : engagementTab == engagementCategoriesList[0]}']")
  protected static List<WebElement> categoriesTabForEngagements;


  @FindBy(xpath = "//div[@class=\"float list-engagement\"]/descendant::div[@class=\"float tab-pane ng-scope active\"]/descendant::a[@class=\"bx-next\"]")
  protected static List<WebElement> nextArrowInCarousel;


  @FindBy(xpath = "//div[@id='dynamic-modal']/descendant::div[@class='modal-content']")
  protected static WebElement dynamicModel;

  @FindBy(xpath = "//*[@id='btn_Offers']")
  protected static WebElement doneBtn;

  @FindBy(xpath = "//h6[contains(.,'THEN')]")
  protected static WebElement engageWithColumn;


  @FindBy(xpath = "//div[@class=\"toast toast-warning\"]/descendant::div[contains(.,'Engagement test a mobile already exist')]")
  protected static WebElement getEngagementsWarning;



}
