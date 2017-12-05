package com.lava.engagementspage;

import com.lava.Pages;
import com.lava.base.TestBase;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by codecraft on 25/11/16.
 */
public class EngagementPageTest extends TestBase {
    public static int tag = 0, indexCount = 0;

//    @TestCaseId("TM 1")
//    @Step("Login {0}")
//    @BeforeMethod
//    public void login() {
//        String email = credentialsProperties.get("USERNAME");
//        String password = credentialsProperties.get("PASSWORD");
//        Assert.assertTrue(Pages.LoginPage().login(email, password), "Failed to Login");
//    }


    public void engagementsTest() {
        int retainStatus = 0, retainedValue = 4, bodyPatternCount = 0; //variable set to dynamic handling of video button. Index value is retained.
        int patternCount = 1, popupClickCount = 1;
        String content;
       // Pages.Sidebar().clickEngagements();
        Pages.EngagementsPage().clickMobileInAppNotificationType();
        //Creating different types of mobile in app notifications
//        do {
//            int patternIndex = 0;
//            if (patternCount > 1) {
//                retainStatus = 0;
//                retainedValue = 4;
//                Pages.EngagementsPage().clickMobileInappNotificationButton();
//            }
//            String pattern = inAppProperties.get("PATTERN" + patternCount);
//            String[] value = pattern.split("_");
//            String headerValue = value[0];
//            String bodyValue = value[1];
//            String footerValue = value[2];
//            String actionNameToEnter = "Action Name_" + headerValue + "_" + bodyValue + "_" + footerValue;
//            String title = "Title has been entered";
//
//            //enter action name
//            Pages.MobileInAppNotification().clickOnActionName();
//            Pages.MobileInAppNotification().enterActionName(actionNameToEnter);
//
//            //enter title
//            Pages.MobileInAppNotification().clickOnTitleField();
//            Pages.MobileInAppNotification().enterTitle(title);
//
//            while (pattern != null && patternIndex <= 2) {
//                if (popupClickCount == 2) {
//                    Pages.MobileInAppNotification().switchToPopUpAndScroll();
//                }
//
//                //Checking for header, body and footer
//                switch (patternIndex) {
//                    case 0:
//                        Pages.MobileInAppNotification().clickHeaderSelectType();
//                        tag = 0;
//                        break;
//                    case 1:
//                        if (bodyValue.matches(headerValue)) {   //conditional  check done for repeating patters ex: TXT_TXT
//                            bodyPatternCount = 1;
//                        } else {
//                            bodyPatternCount = 0;
//                        }
//                        Pages.MobileInAppNotification().clickBodySelectType(bodyPatternCount);
//                        tag = 1;
//                        break;
//                    case 2:
//                        Pages.MobileInAppNotification().clickFooterSelectType();
//                        tag = 2;
//                        if (footerValue.matches(headerValue) && footerValue.matches(bodyValue)) {
//                            indexCount = 2;
//                        } else if (footerValue.matches(headerValue) || footerValue.matches(bodyValue)) {
//                            indexCount = 1;
//                        } else {
//                            if (footerValue.matches("TXT")) {
//                                indexCount = 2; //count set to 2 to handle TXT (single) in footer part
//                            } else {
//                                indexCount = 0;
//                            }
//                        }
//                        break;
//                }
//                //Random selection of contents
//                switch (value[patternIndex]) {
//                    case "TXT":
//                        Pages.MobileInAppNotification().clickTextMessage(tag);
//                        Pages.MobileInAppNotification().enterText(indexCount);
//                        break;
//                    case "VID":
//                        Pages.MobileInAppNotification().clickVideo(tag);
//                        if (patternIndex == 0) {
//                            Pages.MobileInAppNotification().selectOfferVideo(0);  //Initial Value = 2,5 and 8 => changed to 0,1 and 2
//                            retainStatus = 1;
//                            retainedValue = 0;
//                        } else if (patternIndex == 1) {
//                            if (retainStatus == 1) {
//                                Pages.MobileInAppNotification().selectOfferVideo(retainedValue);
//                            } else {
//                                Pages.MobileInAppNotification().selectOfferVideo(1);
//                                retainStatus = 1;
//                                retainedValue = 1;
//                            }
//                        } else {
//                            if (retainStatus == 1) {
//                                Pages.MobileInAppNotification().selectOfferVideo(retainedValue);
//
//                            } else {
//                                Pages.MobileInAppNotification().selectOfferVideo(2);
//                            }
//
//                        }
//                        break;
//                    case "IMG":
//                        Pages.MobileInAppNotification().clickImage(tag);
//                        if (patternIndex == 0) {
//                            Pages.MobileInAppNotification().selectImageOffer(0);  //Initial value = 1,4,7 => changed to 0,1,2
//                            Pages.MobileInAppNotification().doNothingFalse(0);
//                        } else if (patternIndex == 1) {
//                            Pages.MobileInAppNotification().selectImageOffer(1);
//                            Pages.MobileInAppNotification().doNothingFalse(1);
//                        } else {
//                            Pages.MobileInAppNotification().selectImageOffer(2);
//                            Pages.MobileInAppNotification().doNothingFalse(2);
//                        }
//                        break;
//                }
//
//                patternIndex++;
//                popupClickCount = 2;
//            }
//
//            //Click on Set Engagement button
//            Pages.MobileInAppNotification().clickOnSetEngagementButton();
//            Assert.assertTrue(true, "Action with action name - " + actionNameToEnter + " has been created");
//            patternCount++;
//
//        } while (patternCount != 4);

    }

 }
