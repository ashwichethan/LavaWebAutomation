package com.lava.engagementbuilderpage;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 22/03/17.
 */
public class EngagementsCreationRepo extends ObjectsBase {
    @FindBy(xpath = "//div[@class='page dashboard engagements-page ng-scope']")
    protected static WebElement engagementsPage;
    @FindBy(xpath = "//a[contains(.,'Design')]")
    protected static WebElement designTab;
    @FindBy(xpath = "//li[@class='design has-submenu active']/descendant::a[contains(.,'Design')]")
    protected static WebElement designTabActive;
    @FindBy(xpath = "//ul[@class='submenu show']/descendant::a[contains(.,'Engagements')]")
    protected static WebElement engagementsTab;
    @FindBy(xpath = "//div[@ng-model=\"engagementItem\"]")
    protected static List<WebElement> engagementslist;
    @FindBy(xpath = "//div[@class=\"engagement-outer text-center ng-scope\"]")
    protected static WebElement isNodesVisibleEngagement;

    @FindBy(xpath = "//section[@id='content-section']")
    protected static WebElement hoverMe;
    @FindBy(xpath = "//div[@class='dynamic-form']/descendant::button[contains(text(),'Cancel')]")
    protected static WebElement cancelButton;
    @FindBy(xpath = "//button[contains(.,'Set Engagement')]")
    protected static WebElement setEngagementsButton;
    @FindBy(xpath = "//button[contains(.,'Set engagement')]")
    protected static WebElement setEngagementsButton2;
    @FindBy(xpath = "//div[@id=\"dynamic-modal\"]/descendant::div[@class='modal-header']/descendant::button[@class='close']")
    protected static WebElement closeButton;
    @FindBy(xpath = "//div[@class=\"modal-content\"]/descendant::div[@class=\"modal-header\"]/descendant::h4[@class=\"modal-title ng-binding\"]")
    protected static WebElement engagementTitle;
    @FindBy(xpath = "//div[@class=\"dynamic-form\"]/descendant::div[@class=\"modal-body\"]/descendant::input[@class=\"input-textbox linear ng-touched ng-dirty ng-empty ng-invalid ng-invalid-required\"]")
    protected static WebElement engagementName1;
    @FindBy(xpath = "//div[@class=\"dynamic-form\"]/descendant::div[@class=\"modal-body\"]/descendant::input[@placeholder=\"Enter engagement name\"]")
    protected static WebElement engagementName;
    @FindBy(xpath = "//div[@class='dynamic-form']/descendant::div[@class='modal-body']/descendant::div[@class='input-checkbox input-check-single ng-scope']")
    protected static WebElement noLimitRadioButton;
    @FindBy(xpath = "//div[@class=\"dynamic-form\"]/descendant::div[@class=\"modal-body\"]/descendant::input[contains(@class,'input-textbox right-middle curve')]")
    protected static WebElement enterLimit;
    @FindBy(xpath = "//div[@class=\"engagement-outer text-center ng-scope\"]/descendant::span[contains(.,'Discount Offer')]")
    protected static WebElement discountOfferNode;
    @FindBy(xpath = "//div[@id='toast-container']/descendant::div[@class='toast-title']")
    protected static WebElement toastMessage;
    @FindBy(xpath = "//div[@class='toast toast-warning']/descendant::div[contains(.,'Warning')]")
    protected static WebElement warningToastMessage;
    @FindBy(xpath = "//div[@class='toast toast-success']/descendant::div[contains(.,'Success')]")
    protected static WebElement successToastMessage;
    @FindBy(xpath = "//div[@class=\"modal-body\"]/descendant::input[@placeholder=\"Enter discount offer in %\"]")
    protected static WebElement discountTextMsg;
    @FindBy(xpath = "//textarea[@name=\"message\"]")
    protected static WebElement smsTextMsg;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::div[@class='input-radio ng-scope']/descendant::label[contains(.,'LIST')]")
    protected static WebElement listRadioButton;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::div[@class='input-radio ng-scope']/descendant::label[contains(.,'URL')]")
    protected static WebElement urlRadioButton;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::input[@placeholder=\"Enter URL\"]")
    protected static WebElement enterUrl;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::span[contains(.,'Select URL from the below list')]")
    protected static WebElement clickSelectUrlFromList;
    @FindBy(xpath = "//div[@class='nice-select drop-select [\"content_url\",\"content_type\"]-disable open']/descendant::li[@class='option']")
    protected static List<WebElement> selectUrlFromList;
    @FindBy(xpath = "//div[@class='modal-body']/descendant::span[contains(.,'Select type')]")
    protected static WebElement clickSelectTypeUrl;
    @FindBy(xpath = "//div[@class='nice-select drop-select [\"content_type\"]-disable open']/descendant::li[@class='option']")
    protected static List<WebElement> selectTypeUrl;
    @FindBy(xpath = "//div[@class=\"modal-body\"]/descendant::input[@placeholder=\"Enter title\"]")
    protected static WebElement enterSponsorOrSurveyTitle;
    @FindBy(xpath = "//div[@class=\"modal-body\"]/descendant::input[@placeholder=\"Sponsor name\"]")
    protected static WebElement enterSponsorName;
    @FindBy(xpath = "//div[@class=\"modal-body\"]/descendant::textarea[@placeholder=\"Sponsor Yes/No Question\"]")
    protected static WebElement enterSponsorQuestion;
    @FindBy(xpath = "//span[contains(.,'If Yes, Show')]")
    protected static WebElement ifYesDropdown;
    @FindBy(xpath = "//div[contains(@class,'[\"content1_url\",\"content1_type\"]-disable open')]/descendant::li[@class='option']")
    protected static List<WebElement> selectIfYesMedia;
    @FindBy(xpath = "//span[contains(.,'If No, Show')]")
    protected static WebElement ifNoDropdown;
    @FindBy(xpath = "//div[contains(@class,'nice-select drop-select [\"content2_url\",\"content2_type\"]-disable open')]/descendant::li[@class='option']")
    protected static List<WebElement> selectIfYNoMedia;
    @FindBy(xpath = "//div[@class=\"modal-body\"]/descendant::input[@placeholder=\"Survey ID\"]")
    protected static WebElement enterSurveyID;
    @FindBy(xpath = "//div[@class=\"modal-body\"]/descendant::textarea[@placeholder=\"Customer Yes/No Question\"]")
    protected static WebElement enterSurveyQuestion;
    @FindBy(xpath = "//div[@class=\"modal-body\"]/descendant::input[@placeholder=\"Enter your welcome message\"]")
    protected static WebElement enterMobileInAppBannerTitle;

    @FindBy(xpath = "//div[contains(@class,'header_type-disable')]")
    protected static WebElement mobileInAppHeader;

    @FindBy(xpath = "//div[contains(@class,'header_type-disable')]/descendant::li[contains(.,'Text message')]")
    protected static WebElement headerTextMsg;

    @FindBy(xpath = "//div[contains(@class,'header_type-disable')]/descendant::li[contains(.,'Video')]")
    protected static WebElement headerVideo;

    @FindBy(xpath = "//div[contains(@class,'header_content-disable')]/descendant::span[contains(.,'Select a offer video')]")
    protected static WebElement selectHeaderVideo;

    @FindBy(xpath = "//div[contains(@class,'header_content-disable open')]/descendant::ul[@class=\"list\"]/descendant::li[@class='option']")
    protected static List<WebElement> selectHeaderVideoFromList;
    @FindBy(xpath = "//div[contains(@class,'header_type-disable')]/descendant::li[contains(.,'Image')]")
    protected static WebElement headerImage;

    @FindBy(xpath = "//div[contains(@class,'header_content-disable')]/descendant::span[contains(.,'Select a offer image')]")
    protected static WebElement selectHeaderImage;
    @FindBy(xpath = "//div[contains(@class,'header_content-disable')]/descendant::ul[@class=\"list\"]/descendant::li[@class='option']")
    protected static List<WebElement> selectHeaderImageFromList;

    @FindBy(xpath = "//div[contains(@class,'body_type-disable')]")
    protected static WebElement mobileInAppBody;
    @FindBy(xpath = "//div[contains(@class,'body_type-disable')]/descendant::li[contains(.,'Text message')]")
    protected static WebElement bodyTextMsg;

    @FindBy(xpath = "//div[contains(@class,'body_type-disable')]/descendant::li[contains(.,'Video')]")
    protected static WebElement bodyVideo;
    @FindBy(xpath = "//div[contains(@class,'body_content-disable')]/descendant::span[contains(.,'Select a offer video')]")
    protected static WebElement selectBodyVideo;

    @FindBy(xpath = "//div[contains(@class,'body_content-disable open')]/descendant::ul[@class=\"list\"]/descendant::li[@class='option']")
    protected static List<WebElement> selectBodyVideoFromList;

    @FindBy(xpath = "//div[contains(@class,'body_type-disable')]/descendant::li[contains(.,'Image')]")
    protected static WebElement bodyImage;
    @FindBy(xpath = "//div[contains(@class,'body_content-disable')]/descendant::span[contains(.,'Select a offer image')]")
    protected static WebElement selectBodyImage;
    @FindBy(xpath = "//div[contains(@class,'body_content-disable')]/descendant::ul[@class=\"list\"]/descendant::li[@class='option']")
    protected static List<WebElement> selectBodyImageFromList;

    @FindBy(xpath = "//textarea[@ng-model=\"colData.arg_selected_value\"]")
    protected static List<WebElement> textArea;


    @FindBy(xpath = "//div[contains(@class,'footer_type-disable')]")
    protected static WebElement mobileInAppFooter;
    @FindBy(xpath = "//div[contains(@class,'footer_type-disable')]/descendant::li[contains(.,'Text message')]")
    protected static WebElement footerTextMsg;

    @FindBy(xpath = "//div[contains(@class,'footer_type-disable')]/descendant::li[contains(.,'Video')]")
    protected static WebElement footerVideo;
    @FindBy(xpath = "//div[contains(@class,'footer_content-disable')]/descendant::span[contains(.,'Select a offer video')]")
    protected static WebElement selectFooterVideo;

    @FindBy(xpath = "//div[contains(@class,'footer_content-disable open')]/descendant::ul[@class=\"list\"]/descendant::li[@class='option']")
    protected static List<WebElement> selectFooterVideoFromList;

    @FindBy(xpath = "//div[contains(@class,'footer_type-disable')]/descendant::li[contains(.,'Image')]")
    protected static WebElement footerImage;
    @FindBy(xpath = "//div[contains(@class,'footer_content-disable')]/descendant::span[contains(.,'Select a offer image')]")
    protected static WebElement selectFooterImage;
    @FindBy(xpath = "//div[contains(@class,'footer_content-disable')]/descendant::ul[@class=\"list\"]/descendant::li[@class='option']")
    protected static List<WebElement> selectFooterImageFromList;

    @FindBy(xpath = "//label[contains(.,'Do nothing')]")
    protected static List<WebElement> doNothingRadioButton;

    @FindBy(xpath = "//label[contains(.,'Open URL')]")
    protected static List<WebElement> openURLRadioButton;

    @FindBy(xpath = "//label[contains(.,'Enlarge')]")
    protected static List<WebElement> enlargeRadioButton;



    @FindBy(xpath = "//input[@placeholder=\"Enter loading text\"]")
    protected static WebElement loadingTextMessage;

    @FindBy(xpath = "//ul[@class='list']")
    protected static List<WebElement> dropdownList;
    @FindBy(xpath = "//li[contains(.,'Text message')]")
    protected static List<WebElement> textMessage;
    @FindBy(xpath = "//li[contains(.,'Video')]")
    protected static List<WebElement> video;
    @FindBy(xpath = "//li[contains(.,'Image')]")
    protected static List<WebElement> image;
    @FindBy(xpath = "//table[@class=\"table-moments table-fixedheader table-scrollcontent ng-scope\"]/descendant::tr[@class=\"ng-scope\"]")
    protected static List<WebElement> selectEngagementInlist;

    @FindBy(xpath = "//input[@ng-click=\"repeatableAddRow(rowData,$index)\"]")
    protected static WebElement addlimitButton;

    @FindBy(xpath = "//input[@ng-click=\"repeatableRemoveRow(rowData,$index)\"]")
    protected static WebElement removelimitButton;

    @FindBy(xpath = "//label[contains(.,'Sandbox')]")
    protected static WebElement sandboxCheckButton;

    @FindBy(xpath = "//input[@name=\"limit_value\"]")
    protected static WebElement limitInput;
    @FindBy(xpath = "//label[contains(.,'Override')]")
    protected static WebElement overrideCheckButton;

    @FindBy(xpath = "//input[@name=\"individual_value_override\"]")
    protected static WebElement individualValue;


    @FindBy(xpath = "//div[@class=\"nice-select drop-select award_type-disable\"]")
    protected static WebElement awardType;

@FindBy(xpath = "//div[@class=\"nice-select drop-select award_type-disable open\"]/descendant::li[@class=\"option\"]")
protected static List<WebElement> selectAwardType;

    @FindBy(xpath = "//input[@name=\"award_value\"]")
    protected static WebElement awardValue;

    @FindBy(xpath = "//div[@class=\"nice-select drop-select table_id-disable\"]")
    protected static WebElement holdAdjustmentTable;

    @FindBy(xpath = "//div[@class=\"nice-select drop-select table_id-disable open\"]/descendant::li[@class=\"option\"]")
    protected static List<WebElement> selectHoldAdjustmentTable;


    @FindBy(xpath = "//div[@class=\"ui-tooltip-content\"]")
    protected static WebElement toolTipContent;

    @FindBy(xpath = "//div[@class=\"ui-tooltip-content\"]/p")
    protected static List<WebElement> toolTipContents;

    @FindBy(xpath = "//input[@name=\"delivery_probability\"]")
    protected static WebElement deliveryProbability;

    @FindBy(xpath = "//input[@name=\"award_percentage\"]")
    protected static WebElement awardPercentage;

    @FindBy(xpath = "//label[contains(.,'Coin In')]")
    protected static WebElement rebateTypeCoinIn;

    @FindBy(xpath = "//label[contains(.,'Theoretical Loss')]")
    protected static WebElement rebateTypeTheoreticalLoss;

    @FindBy(xpath = "//input[@name=\"rebate_percentage\"]")
    protected static WebElement rebatePercentage;

    @FindBy(xpath = "//span[contains(.,'Select an award type')]")
    protected static WebElement awardTypeRebate;

    @FindBy(xpath = "//div[@class=\"nice-select drop-select award_type-disable open\"]/descendant::li[@class=\"option\"]")
    protected static List<WebElement> selectAwardTypeRebate;

    @FindBy(xpath = "//div[@class=\"input-checkbox ng-scope\"]")
    protected static List<WebElement> deliveryMode;

    @FindBy(xpath = "//span[contains(.,'Select a table')]")
    protected static WebElement rebateTable;

    @FindBy(xpath = "//div[@class=\"nice-select drop-select rebate_table_id-disable open\"]/descendant::li[@class=\"option\"]")
    protected static List<WebElement> selectRebateTable;

    @FindBy(xpath = "//div[contains(@class,'hold_adjustment_table_id-disable open')]/descendant::li[@class='option']")
    protected static List<WebElement> selectHoldPercenatageTable;

    @FindBy(xpath = "//input[@name=\"ios_offer_pass_url\"]")
    protected static WebElement iosPassOfferURL;

    @FindBy(xpath = "//input[@name=\"android_offer_pass_url\"]")
    protected static WebElement androidPassOfferURL;

    @FindBy(xpath = "//input[@name=\"min_value\"]")
    protected static WebElement minValue;
    @FindBy(xpath = "//input[@name=\"max_value\"]")
    protected static WebElement maxValue;

@FindBy(xpath = "//input[@name=\"min_range_value\"]")
protected static WebElement minRangeValue;
    @FindBy(xpath = "//input[@name=\"max_range_value\"]")
    protected static WebElement maxRangeValue;
    @FindBy(xpath = "//input[@name=\"range_value\"]")
    protected static WebElement rangeValue;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;

    @FindBy(xpath = "//div[@class=\"toast toast-success\"]/descendant::div[@class=\"toast-message\"]")
    protected static WebElement getSuccessToastMessage;

    public EngagementsCreationRepo(RemoteWebDriver driver) {
        super(driver);
    }

}
