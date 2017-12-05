package com.lava.holdadjustmenttables;

import com.lava.utils.Base;

/**
 * Created by jenkins on 11/07/17.
 */
public class HoldAdjustmentPage extends Base {
    HoldAdjustmentRepo hAr;
    public HoldAdjustmentPage(){hAr = new HoldAdjustmentRepo(driver);}
HoldAdjustmentTableCreationPage hAt = new HoldAdjustmentTableCreationPage();
    public boolean status() {
        hAt.navigateToHoldAdjustment();
        String unused = "UNUSED";
        String unusedText = hAr.status.get(0).getText();
        if (unusedText.equals(unused) == false) {
            return false;
        } else {
            String draft = "DRAFT";
            String draftText = hAr.status.get(1).getText();
            if (draftText.equals(draft) == false) {
                return false;
            } else {
                String inuse = "IN-USE";
                String inuseText = hAr.status.get(2).getText();
                return inuseText.equals(inuse);
            }
        }
    }

    public boolean columns() {
        String status = "STATUS";
        String statusText = hAr.columnName.get(0).getText();
        if (statusText.equals(status) == false) {
            return false;
        } else {
            String tableName = "TABLE NAME";
            String tableNameText = hAr.columnName.get(1).getText();
            if (tableNameText.equals(tableName) == false) {
                return false;
            } else {
                String owner = "OWNER";
                String ownerText = hAr.columnName.get(2).getText();
                if (ownerText.equals(owner) == false) {
                    return false;
                } else {
                    String created = "CREATED";
                    String createdText = hAr.columnName.get(3).getText();
                    if (createdText.equals(created) == false) {
                        return false;
                    } else {
                        String manager = "MANAGER";
                        String managerText = hAr.columnName.get(4).getText();
                        if (managerText.equals(manager) == false) {
                            return false;
                        } else {
                            String lastEdited = "LAST EDITED";
                            String lastEditedText = hAr.columnName.get(5).getText();
                            return (lastEditedText.equals(lastEdited));
                        }
                    }
                }
            }
        }
    }



    public boolean sortBtn() {
        int sort = hAr.sortBtn.size();
        return sort==6;
    }

    public boolean userToggleInHoldTablePage() {
        return (isElementVisible(hAr.userInfoToggle));
    }



}
