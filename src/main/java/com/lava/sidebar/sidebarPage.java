package com.lava.sidebar;

import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by jenkins on 21/07/17.
 */
public class sidebarPage extends Base {
        sidebarRepo sBr;
    public sidebarPage(){sBr = new sidebarRepo(driver);}


        public String homeTabCheck(){
          driver.navigate().refresh();
          sBr.homeTab.click();
            if(isElementVisible(sBr.spinnerOverlay)==true){
                waitForElementToBeInvisible(sBr.spinnerOverlay);
            }
          String title =sBr.homeTitle.getText();
         return title;
        }


      public Object[] analyzeTabCheck() {
          sBr.analyzeTab.click();
          List<WebElement> analyzeSubmenu = sBr.analyzeSubMenu;
          String a[] = new String[8];
          for (int index = 0; index < 8; index++) {

              WebElement analyze = analyzeSubmenu.get(index);
              String name =analyze.getText();
              System.out.println(name);
              a[index]=name;

          }
          System.out.println(a);
          return a;
      }

        public Object[] designTabCheck() {
            sBr.designTab.click();
            List<WebElement> designSubMenu = sBr.designSubMenu;
            String a[] = new String[3];
            for (int index = 0; index < 3; index++) {
                WebElement design = designSubMenu.get(index);
                String name =design.getText();
                System.out.println(name);
                a[index]=name;
            }
            System.out.println(a);
            return a;
        }
        public Object[] resourceTabCheck() {
            sBr.resourceTab.click();
            List<WebElement> resourceSubMenu = sBr.resourceSubMenu;
            String a[] = new String[5];
            for (int index = 0; index < 5; index++) {
                WebElement resource = resourceSubMenu.get(index);
                String name =resource.getText();
                System.out.println(name);
                a[index]=name;
            }
            System.out.println(a);
            return a;
        }


}
