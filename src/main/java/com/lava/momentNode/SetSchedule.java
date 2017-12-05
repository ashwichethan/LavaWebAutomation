package com.lava.momentNode;

import com.lava.utils.Base;

/**
 * Created by jenkins on 17/07/17.
 */
public class SetSchedule extends Base {
    SetScheduleRepo sSr;
    public SetSchedule(){ sSr = new SetScheduleRepo(driver);}

    public boolean setSchedule(){
        sSr.setScheduleBtn.click();
        waitUntilElementIsVisible(sSr.modalDialog);
        sSr.startDate.click();
        sleep(1000);
        sSr.selectStartandEndDate.get(4).click();
        sSr.endDate.click();
        sleep(1000);
       // sSr.selectStartandEndDate.get(20).click();
        sSr.startTime.clear();
        sSr.startTime.sendKeys("05:45 AM");
        sSr.endTime.clear();
        sSr.endTime.sendKeys("07:10 AM");

//        sSr.timeZones.get(0).click();
//        sSr.timeZones.get(1).click();
        sSr.saveBtn.click();
        sleep(500);
        return true;
    }


}
