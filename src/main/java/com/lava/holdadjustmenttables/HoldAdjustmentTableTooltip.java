package com.lava.holdadjustmenttables;

import com.lava.utils.Base;

/**
 * Created by jenkins on 19/05/17.
 */
public class HoldAdjustmentTableTooltip extends Base {
    HoldAdjustmentTablesTooltipRepo hAtT;
    public HoldAdjustmentTableTooltip(){ hAtT = new HoldAdjustmentTablesTooltipRepo(driver);}

    HoldAdjustmentTableCreationPage HaTc = new HoldAdjustmentTableCreationPage();

    public boolean tooltipHoldAdjustmentTable(){
        HaTc.navigateToHoldAdjustment();
        tooltip(HoldAdjustmentTablesTooltipRepo.tablesInList, HoldAdjustmentTablesTooltipRepo.toolTipContents);
        return true;

    }


}
