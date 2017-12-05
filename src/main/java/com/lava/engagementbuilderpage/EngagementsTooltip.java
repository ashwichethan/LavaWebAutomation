package com.lava.engagementbuilderpage;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

/**
 * Created by jenkins on 19/05/17.
 */
public class EngagementsTooltip extends Base{
    EngagementsTooltipRepo EgTt;
    public EngagementsTooltip(){ EgTt = new EngagementsTooltipRepo(driver);}

    EngagementsCreationPage enC = new EngagementsCreationPage();
public boolean tooltipEngagement(){
    refreshPage();
    if(isElementVisible(EgTt.spinnerOverlay)==true){
        waitUntilElementIsVisible(EgTt.spinnerOverlay);
    }

    enC.goToEngagementPage();
    tooltip(EngagementsTooltipRepo.engagementsInList, EngagementsTooltipRepo.toolTipContents);
    return true;
    }



}
