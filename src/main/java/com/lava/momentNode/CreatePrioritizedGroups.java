package com.lava.momentNode;

import com.lava.utils.Base;

/**
 * Created by jenkins on 14/07/17.
 */
public class CreatePrioritizedGroups extends Base {
   CreatePrioritizedGroupsRepo cPgR;
    public CreatePrioritizedGroups(){ cPgR = new CreatePrioritizedGroupsRepo(driver);}

    public boolean clickPrioritizedBtn(){
        sleep(2000);
        cPgR.addPrioritizedBtn.click();
        sleep(3000);
        return true;
    }


}
