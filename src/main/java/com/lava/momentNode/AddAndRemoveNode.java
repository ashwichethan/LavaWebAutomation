package com.lava.momentNode;

import com.lava.utils.Base;

/**
 * Created by jenkins on 13/07/17.
 */
public class AddAndRemoveNode extends Base{
    AddAndRemoveNodeRepo aRnR;
    public AddAndRemoveNode(){ aRnR = new AddAndRemoveNodeRepo(driver);}

    public boolean scrollOnNode(int node){
        scrollToElement(aRnR.scrollOnNode.get(node));
        mouseHoverOnElement(aRnR.scrollOnNode.get(node));
        //return (isElementVisible(aRnR.removeText.get(node)));
        return true;
    }

    public boolean clickRemoveBtn(int node){
        aRnR.removeText.get(node).click();
        return (isElementVisible(aRnR.areYouSureText));
    }
//    public boolean areYouSure(){
//        String areYousure = "Are you sure?";
//        String text = aRnR.areYouSureText.getText();
//        return (text.equals(areYousure));
//    }

    public boolean remove(int node){
        aRnR.removeConfirm.get(node).click();
        sleep(500);
        //return (isElementVisible(aRnR.emptyEng));
        return true;
    }
      public boolean navigateHome(){
          refreshPage();
          if(isElementVisible(aRnR.spinnerOverlay)==true){
              waitUntilElementIsVisible(aRnR.spinnerOverlay);
          }
       aRnR.homeTab.click();
        return true;
    }


}
