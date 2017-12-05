package com.lava.cms;

import com.lava.Pages;
import com.lava.utils.Base;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by jenkins on 23/05/17.
 */
public class DeleteCMSMedia extends Base {
    DeleteCMSMediaRepo DcmsR;
    public DeleteCMSMedia(){DcmsR = new DeleteCMSMediaRepo(driver);}


    public void waitUntilCMSPageIsVisible(){waitUntilElementIsVisible(DeleteCMSMediaRepo.CMSMediaPage);}
    public void waitForSpinnerToBeInvisible(){waitForElementToBeInvisible(DeleteCMSMediaRepo.loadingSpinner);}

     AddMediaFiles aCf = new AddMediaFiles();
    public boolean deleteCMS(){
        refreshPage();
        if(isElementVisible(DcmsR.spinnerOverlay)==true){
            waitUntilElementIsVisible(DcmsR.spinnerOverlay);
        }

        aCf.navigateToCMS();
        Delete();
        return true;
    }

    public void Delete(){
        sleep(4000);
    List<WebElement> FileNames = DeleteCMSMediaRepo.fileName;
    int count=0;
    System.out.println("Total Media before deleting "+FileNames.size());
    for(int index=0; index<FileNames.size(); index++){
        WebElement cms = FileNames.get(index);
        String CMSname = cms.getText();
        if(CMSname.contains("testimage001")){
           DeleteCMSMediaRepo.deleteButton.get(index).click();
            Pages.ModalDialog().waitUntilModalDialogIsDisplayed();
            DeleteCMSMediaRepo.yesButton.click();
            ++count;

                waitUntilElementIsVisible(DeleteCMSMediaRepo.successToastMessage);
                String successMsg = DeleteCMSMediaRepo.successToastMessage.getText();
                System.out.println("Success toast message is "+successMsg);
                waitForElementToBeInvisible(DeleteCMSMediaRepo.successToastMessage);

        }

    }
    System.out.println("Total Media after deleting "+FileNames.size());
    System.out.println("Total Deleted "+count);

}




}
