package com.lava.readexcel;

import com.lava.Pages;
import com.lava.utils.Base;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Dewesh Yadav on 4/20/2017.
 */
public class HandleDialogs extends Base {

    public boolean isDialogVisible() {

        Boolean modalDisplayed = Pages.ModalDialog().isModalDialogDisplayed();
        return modalDisplayed;
    }

    public boolean processDialogsElements(String tabName, String fileName) throws IOException {

        if (isDialogVisible() == true) {

            String modalTitle = Pages.ModalDialog().getModalTitle();

            List popUpElements = Pages.readPopUpValues().pickJsonValuesForDialogElements(modalTitle, fileName, tabName);

            for (int elementsCount = 0; elementsCount < popUpElements.size(); elementsCount++) {
                Object elements = popUpElements.get(elementsCount);
                if (elements.toString().equalsIgnoreCase("dropDown")) {
                    Pages.ModalDialog().pickValuesFromDropDownRandomly(0);
                }
                if (elements.toString().equalsIgnoreCase("checkBoxList")) {
                    Pages.ModalDialog().selectCheckBoxValueRandomly();
                }
                if (elements.toString().equalsIgnoreCase("radioButtons")) {
                    Pages.ModalDialog().selectRadioButtonRandomly();
                }
                if (elements.toString().contains("textBox,")) {
                    String[] getTxtBoxType = elements.toString().split(",");
                    System.out.println(getTxtBoxType[1]);
                    String switchVariable = getTxtBoxType[1];

                    switch (switchVariable) {
                        case "percent":
                            Pages.ModalDialog().enterValuesInTextBoxRandomlyForOnlyNumerics();
                            break;
                        case "currency":
                            Pages.ModalDialog().enterValuesInTextBoxRandomlyForOnlyNumerics();
                            break;
                        case "unsign_int":
                            Pages.ModalDialog().enterValuesInTextBoxRandomlyForOnlyNumerics();
                            break;
                        case "string":
                            Pages.ModalDialog().enterValuesInTextBoxRandomlyForOnlyStrings();
                            break;
                    }
                }
            }
        }

        return true;
    }
}
