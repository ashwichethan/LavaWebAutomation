package com.lava;


import com.lava.cms.AddMediaFiles;
import com.lava.cms.DeleteCMSMedia;
import com.lava.engagementbuilderpage.*;
import com.lava.geolocation.CreateGeoLocationPage;
import com.lava.createmomentspage.CreateNewMomentPage;
import com.lava.deletemomentspage.DeleteMomentsPage;
import com.lava.createmomentspage.*;
import com.lava.engagementspage.EngagementPage;
import com.lava.engagementspage.MobileInAppNotification;
import com.lava.engagementspage.MobileInAppNotificationOptimized;
import com.lava.geolocation.DeleteGeolocationPage;
import com.lava.geolocation.GeolocationPage;
import com.lava.geolocation.GeolocationTooltip;
import com.lava.globalplatformdashboard.GlobalPlatformDashboard;
import com.lava.holdadjustmenttables.*;
import com.lava.homepage.HomePage;
import com.lava.loginpage.LoginPage;
import com.lava.loginpage.ReloginPage;

import com.lava.modaldialog.ModalDialog;
import com.lava.momentNode.AddAndRemoveNode;
import com.lava.momentNode.CreatePrioritizedGroups;
import com.lava.momentNode.MomentView;
import com.lava.momentNode.SetSchedule;
import com.lava.momentStatisticBackend_Age_Tier_Gender_Ethnic.CardoutTriggerStatistics;
import com.lava.momentdashboard.MomentDashboard1;
import com.lava.momentspage.momentsStartEndDatesVerifyPage;
import com.lava.profilespage.*;
import com.lava.readexcel.HandleDialogs;
import com.lava.readexcel.ReadPopUpValues;
import com.lava.rebatetable.*;
import com.lava.utils.Base;
import com.lava.Api.profileApi;
import com.lava.sidebar.sidebarPage;
import com.lava.Api.hashmapsample;

/**
 * Created by codecraft on 13/09/16.
 */
public class Pages {

    private static <T extends Base> T getPage(Class<T> pageType)  {
        T page;
        try {
            page = pageType.newInstance();
        } catch (InstantiationException e) { //make sure you use JDK 1.7
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return page;
    }

    public static LoginPage LoginPage(){return getPage(LoginPage.class);}
    public static ModalDialog ModalDialog(){return getPage(ModalDialog.class);}
    public static HomePage HomePage(){return getPage(HomePage.class);}
   // public static MomentsPage MomentsPage(){return getPage(MomentsPage.class);}
    public static EngagementPage EngagementsPage(){ return getPage(EngagementPage.class);}
    public static MobileInAppNotification MobileInAppNotification(){ return getPage(MobileInAppNotification.class);}
    public static MobileInAppNotificationOptimized MobileInAppNotificationOptimized(){ return getPage(MobileInAppNotificationOptimized.class);}
    public static CreateNewMomentPage CreateNewMomentPage(){return getPage(CreateNewMomentPage.class);}
    public static ProfilesPage DragAndDropProfilesPage() {
        return getPage(ProfilesPage.class);
    }
    public static TriggersPage DragAndDropTriggersPage() {
        return getPage(TriggersPage.class);
    }
    public static QualifiersPage DragAndDropQualifiersPage() {
        return getPage(QualifiersPage.class);
    }
    public static EngagementsPage DragAndDropEngagmentPage() {
        return getPage(EngagementsPage.class);
    }
    public static ReadPopUpValues readPopUpValues() {
        return getPage(ReadPopUpValues.class);
    }
    public static HandleDialogs handleAllDialogs() {
        return getPage(HandleDialogs.class);
    }
//    public static ProfilesPage DragAndDropProfilesPage(){return getPage(ProfilesPage.class);}
//    public static TriggersPage DragAndDropTriggersPage(){return getPage(TriggersPage.class);}
    public static DeleteMomentsPage DeleteMomentsPage(){return getPage(DeleteMomentsPage.class);}
    public static  ProfilesCreationPage ProfilesCreationPage(){return getPage(ProfilesCreationPage.class);}
    public static EngagementsCreationPage EngagementsCreationPage(){return getPage(EngagementsCreationPage.class);}
    public static  DeleteProfiles DeleteProfiles(){return getPage(DeleteProfiles.class);}
    public static  ProfileSortingInList ProfileSortingInList(){return getPage(ProfileSortingInList.class);}
    public static CreateGeoLocationPage CreateGeoLocationPage(){return getPage(CreateGeoLocationPage.class);}
    public static DeleteGeolocationPage DeleteGeolocationPage(){return getPage(DeleteGeolocationPage.class);}
    public static HoldAdjustmentTableCreationPage HoldAdjustmentTableCreationPage(){return getPage(HoldAdjustmentTableCreationPage.class);}
    public static DeleteEngagementsPage DeleteEngagementsPage(){return getPage(DeleteEngagementsPage.class);}
    public static EngagementsTooltip EngagementsTooltip(){return getPage(EngagementsTooltip.class);}
    public static ProfileTooltip ProfileTooltip(){return getPage(ProfileTooltip.class);}
    public static GeolocationTooltip GeolocationTooltip(){return getPage(GeolocationTooltip.class);}
    public static MomentsCardsPage MomentsCardsPage(){return getPage(MomentsCardsPage.class);}
    public static AddMediaFiles AddMediaFiles(){return getPage(AddMediaFiles.class);}
    public static DeleteCMSMedia DeleteCMSMedia(){return getPage(DeleteCMSMedia.class);}
    public static MomentDashboard1 MomentDashboard1(){return getPage(MomentDashboard1.class);}
    public static CreateRebatePage CreateRebatePage(){return getPage(CreateRebatePage.class);}
    public static momentsStartEndDatesVerifyPage momentsStartEndDatesVerifyPage(){return getPage(momentsStartEndDatesVerifyPage.class);}
    public static DeleteRebateTablePage DeleteRebateTablePage(){return getPage(DeleteRebateTablePage.class);}
    public static CreateCopyOfRebateTable CreateCopyOfRebateTable(){return getPage(CreateCopyOfRebateTable.class);}
    public static CreateAndViewRebateTablePage CreateAndViewRebateTablePage(){return getPage(CreateAndViewRebateTablePage.class);}
    public static EditRebateTablePage EditRebateTablePage(){return getPage(EditRebateTablePage.class);}
    public static DeleteHoldAdjustmentTablePage DeleteHoldAdjustmentTablePage(){return getPage(DeleteHoldAdjustmentTablePage.class);}
    public static GlobalPlatformDashboard GlobalPlatformDashboard(){return getPage(GlobalPlatformDashboard.class);}
    public static profileApi profileApi(){return getPage(profileApi.class);}
    public static CardoutTriggerStatistics CardoutTriggerStatistics(){return getPage(CardoutTriggerStatistics.class);}
    public static HoldAdjustmentTableInDraftPage HoldAdjustmentTableInDraftPage(){return getPage(HoldAdjustmentTableInDraftPage.class);}
    public static ReloginPage ReloginPage(){return getPage(ReloginPage.class);}
    public static HoldAdjustmentTableDuplicatePage HoldAdjustmentTableDuplicatePage(){return getPage(HoldAdjustmentTableDuplicatePage.class);}
    public static HoldAdjustmentTableViewPage HoldAdjustmentTableViewPage(){return getPage(HoldAdjustmentTableViewPage.class);}
    public static GeolocationPage GeolocationPage(){return getPage(GeolocationPage.class);}
    public static HoldAdjustmentPage HoldAdjustmentPage(){return getPage(HoldAdjustmentPage.class);}
    public static RebateTablePage RebateTablePage(){return getPage(RebateTablePage.class);}
    public static RebateTableStatusChangePage RebateTableStatusChangePage(){return getPage(RebateTableStatusChangePage.class);}
    public static AddAndRemoveNode AddAndRemoveNode(){return getPage(AddAndRemoveNode.class);}
    public static CreatePrioritizedGroups CreatePrioritizedGroups(){return getPage(CreatePrioritizedGroups.class);}
    public static SetSchedule SetSchedule(){return getPage(SetSchedule.class);}
    public static ProfileCreationInMomentpage ProfileCreationInMomentpage(){return getPage(ProfileCreationInMomentpage.class);}
    public static CreateEngagementsInMomentsPage CreateEngagementsInMomentsPage(){return getPage(CreateEngagementsInMomentsPage.class);}
    public static sidebarPage sidebarPage(){return getPage(sidebarPage.class);}
    public static MomentView MomentView(){return getPage(MomentView.class);}
    public static EngagementPopup EngagementPopup(){return getPage(EngagementPopup.class);}
    public static ProfileStatusCheck ProfileStatusCheck(){return getPage(ProfileStatusCheck.class);}
    public static EngagementStatusCheck EngagementStatusCheck(){return getPage(EngagementStatusCheck.class);}
    public static DeleteDraftAndInUseEngagements DeleteDraftAndInUseEngagements(){return getPage(DeleteDraftAndInUseEngagements.class);}


    public static hashmapsample hashmapsample(){return getPage(hashmapsample.class);}


}
