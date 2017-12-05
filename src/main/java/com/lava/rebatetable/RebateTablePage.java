package com.lava.rebatetable;

import com.lava.utils.Base;

/**
 * Created by jenkins on 11/07/17.
 */
public class RebateTablePage extends Base {
    RebateTableRepo rTr;
    public RebateTablePage(){rTr = new RebateTableRepo(driver);}
CreateRebatePage cRp = new CreateRebatePage();
    public boolean status() {
        cRp.navigateToRebateTable();
        String unused = "UNUSED";
        String unusedText = rTr.status.get(0).getText();
        if (unusedText.equals(unused) == false) {
            return false;
        } else {
            String draft = "DRAFT";
            String draftText = rTr.status.get(1).getText();
            if (draftText.equals(draft) == false) {
                return false;
            } else {
                String inuse = "IN-USE";
                String inuseText = rTr.status.get(2).getText();
                return inuseText.equals(inuse);
            }
        }
    }

    public boolean columns() {
        String status = "STATUS";
        String statusText = rTr.columnName.get(0).getText();
        if (statusText.equals(status) == false) {
            return false;
        } else {
            String tableName = "TABLE NAME";
            String tableNameText = rTr.columnName.get(1).getText();
            if (tableNameText.equals(tableName) == false) {
                return false;
            } else {
                String owner = "OWNER";
                String ownerText = rTr.columnName.get(2).getText();
                if (ownerText.equals(owner) == false) {
                    return false;
                } else {
                    String created = "CREATED";
                    String createdText = rTr.columnName.get(3).getText();
                    if (createdText.equals(created) == false) {
                        return false;
                    } else {
                        String manager = "MANAGER";
                        String managerText = rTr.columnName.get(4).getText();
                        if (managerText.equals(manager) == false) {
                            return false;
                        } else {
                            String lastEdited = "LAST EDITED";
                            String lastEditedText = rTr.columnName.get(5).getText();
                            return (lastEditedText.equals(lastEdited));
                        }
                    }
                }
            }
        }
    }



    public boolean sortBtn() {
        int sort = rTr.sortBtn.size();
        return sort==6;
    }

    public boolean userToggleInRebateTablePage() {
        return (isElementVisible(rTr.userInfoToggle));
    }


}
