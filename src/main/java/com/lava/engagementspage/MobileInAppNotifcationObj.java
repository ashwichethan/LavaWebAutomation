package com.lava.engagementspage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by codecraft on 25/11/16.
 */
public class MobileInAppNotifcationObj extends ObjectsBase {

    public MobileInAppNotifcationObj(RemoteWebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//form[@id='engagement-form']/descendant::span[contains(.,'Select type')]")
    protected static List<WebElement> selectTypeFields;

    @FindBy(xpath="//div[@class='inapp-form']/descendant::a[@class='sbToggle'][1]")
    protected static WebElement selectHeader;

    @FindBy(xpath="//div[@class='inapp-form']/descendant::a[@class='sbToggle'][4]")
    protected static WebElement selectBody;

    @FindBy(xpath="//div[@class='inapp-form']/descendant::a[@class='sbToggle'][7]")
    protected static WebElement selectFooter;

    @FindBy(xpath="//div[@class='field-item field-select ng-scope']/descendant::ul[@class='sbOptions']/li")
    protected static List<WebElement> selectListValues;

    @FindBy(how = How.PARTIAL_LINK_TEXT, using ="Text message")
    @CacheLookup
    protected static List<WebElement> selectMsg;

    @FindBy(xpath = "//div[@class='inapp-form']/descendant::textarea[@class='ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
    protected static List<WebElement> textArea;

    @FindBy(xpath = "//div[@class='inapp-form']/descendant::ul[@class='sbOptions']")
    protected static List<WebElement> offerVideoList;

//    @FindBy(xpath = "//div[@class='inapp-form']/descendant::a[@class='sbToggle']")
//    protected static List<WebElement> offer;

    @FindBy(xpath = "//form[@id='engagement-form']/descendant::span[contains(.,'Select a offer video')]")   //1=header, 2=body, 3= footer
    protected static List<WebElement> offerVideo;

    @FindBy(xpath = "//form[@id='engagement-form']/descendant::span[contains(.,'Select a offer image')]")   //1=header, 2=body, 3= footer
    protected static List<WebElement> offerImage;

//    @FindBy(xpath="//div[@class='field-item field-select ng-scope']/descendant::ul[@class='list']/li[5]")
    @FindBy(xpath = "//div[@class='nice-select drop-select ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty open']/descendant::li[5]")
    protected static WebElement offerList;

    @FindBy(xpath = "//div[@class='inapp-form']/descendant::h3[contains(.,'BODY')]")
    protected static WebElement popup;

    @FindBy(xpath = "//div[@class=\'dashboard-wrapper\']/descendant::h3[contains(.,\'Select engagement type:\')]")
    protected static WebElement parentPopUp;

    @FindBy(how=How.PARTIAL_LINK_TEXT, using = "Text message")
    protected static List<WebElement> textMessage;

    @FindBy(how=How.PARTIAL_LINK_TEXT, using = "Select type")
    protected static List<WebElement> selectType;



    @FindBy(xpath="//div[@class='inapp-form']/descendant::ul[@class='list']/li[@class='option']")
    protected static List<WebElement> video;

    @FindBy(xpath = "//div[@class='inapp-form']/descendant::li[contains(.,'Video')]")
    protected static List<WebElement> videoText;

    @FindBy(xpath = "//div[@class='inapp-form']/descendant::ul[@class='list']/li[@class='option']")
    protected static List<WebElement> image;

    @FindBy(xpath = "//div[@class='inapp-form']/descendant::li[contains(.,'Image')]")
    protected static List<WebElement> imageText;

    @FindBy(xpath = "//div[@class='inapp-form']/descendant::ul[@class='list']/li[@class='option']")
    protected static List<WebElement> message;

    @FindBy(xpath = "//div[@class='inapp-form']/descendant::li[contains(.,'Text message')]")
    protected static List<WebElement> messageText;

    @FindBy(xpath="//form[@id='engagement-form']/descendant::input[@placeholder='Enter action name']")
    protected static WebElement actionName;

    @FindBy(xpath = "//form[@id='engagement-form']/descendant::input[@placeholder='Enter your welcome message']")
    protected static WebElement title;

    @FindBy(xpath = "//div[@class='modal-footer']/descendant::button[@id='btn_Offers']")
    protected static WebElement setEngagement;

    @FindBy(xpath = "//form[@id='engagement-form']/descendant::label[contains(.,'Do nothing')]")
    protected static List<WebElement> doNothing;

}
