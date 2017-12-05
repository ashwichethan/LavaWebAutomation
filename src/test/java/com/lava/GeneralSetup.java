package com.lava;

import com.lava.base.TestBase;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import java.io.IOException;

/**
 * Created by Dewesh Yadav on 4/3/2017.
 */
public class GeneralSetup extends TestBase {

    @TestCaseId("TMS-1")
    @Features("Launch app")
    @Step(" Launch {0} screen. ")
    @Test(testName = "Lava_TC1")
    public void InitialSetup() throws IOException {
        Pages.LoginPage().initialSetup();

    }
}
