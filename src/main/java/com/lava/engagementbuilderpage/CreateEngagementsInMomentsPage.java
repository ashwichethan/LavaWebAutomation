package com.lava.engagementbuilderpage;

import com.lava.utils.Base;

/**
 * Created by jenkins on 20/07/17.
 */
public class CreateEngagementsInMomentsPage extends Base{
    CreateEngagementsInMomentsRepo cEmR;
    public CreateEngagementsInMomentsPage(){cEmR = new CreateEngagementsInMomentsRepo(driver);}

EngagementsCreationPage eCp = new EngagementsCreationPage();
    public boolean createEngagements(){

    eCp.mobileInAppNotification();

        return true;
    }

}
