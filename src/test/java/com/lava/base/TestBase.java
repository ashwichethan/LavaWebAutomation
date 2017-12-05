package com.lava.base;

import com.jayway.restassured.RestAssured;
import com.lava.utils.Base;
import com.lava.utils.InitiateDriver;
import com.lava.utils.PropertyReader;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;


/**
 * Created by codecraft on 13/09/16.
 */
public class TestBase implements IHookable {

    public static int testCasecount = 0;
    public static HashMap<String,String> configProperties;
    public static HashMap<String,String> credentialsProperties;
    public static HashMap<String,String> inAppProperties;
    public static HashMap<String,String> createmomentProperties;
    protected RemoteWebDriver driver;

    public TestBase() {
        configProperties = PropertyReader.getPropValues("config.properties");
        credentialsProperties = PropertyReader.getPropValues("credentials.properties");
        inAppProperties=PropertyReader.getPropValues("inAppPattern.properties");
      createmomentProperties=PropertyReader.getPropValues("createmoment.properties");
    }

    @BeforeSuite(alwaysRun=true)
    public void setup()
    {
        String url = configProperties.get("URL");
      //  String apiurl=configProperties.get("APIURL");
        InitiateDriver initiateDriver = new InitiateDriver();
        driver = initiateDriver.getDriver();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        String screenWidth = jse.executeScript("return screen.availWidth").toString();
        String screenHeight = jse.executeScript("return screen.availHeight").toString();
        int intScreenWidth = Integer.parseInt(screenWidth);
        int intScreenHeight = Integer.parseInt(screenHeight);
        Dimension d = new Dimension(intScreenWidth, intScreenHeight);
        driver.manage().window().setSize(d);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Base.driver = driver;
        System.out.println(url);
       // RestAssured.baseURI = apiurl;
        driver.get(url);
    }


    //Take Screenshot, whenever test cases Fail. The screenshots taken will be attached to Allure report
    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {

//        callBack.runTestMethod(testResult);
//        if (testResult.getThrowable() != null) {
//            try {
//                takeScreenShot(testResult.getMethod().getMethodName());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        callBack.runTestMethod(testResult);

        testCasecount++;
        int status = testResult.getStatus();
        switch (status) {
            case 1:
                System.out.println("Will update test result");
                break;
            case 2:
                System.out.println("Will update fail result");
                break;
            case 3:
                System.out.println("Will update skip result");
                break;
            case 16:
                System.out.println("Executing");
                break;
            default:
                break;
        }
    }

////    // Attach Screenshots taken to Allure report
//    @Attachment(value = "Failure in method {0}", type = "image/png")
//    private byte[] takeScreenShot(String methodName) throws IOException {
//       // return driver.getScreenshotAs(OutputType.BYTES);
//        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//    }

//    @AfterSuite(alwaysRun = true)
//    public void teardownAndTakeScreenShot()
//    {
//     //   ITestResult.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).testName();
//        driver.quit();
//    }

    //Take Screenshot, whenever test cases Fail. The screenshots taken will be attached to Allure report
//    @Override
//    public void run(IHookCallBack callBack, ITestResult testResult) {
//
//        callBack.runTestMethod(testResult);
//        if (testResult.getThrowable() != null) {
//            try {
//                takeScreenShot(testResult.getMethod().getMethodName());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

//    // Attach Screenshots taken to Allure report
//    @Attachment(value = "Failure in method {0}", type = "image/png")
//    private byte[] takeScreenShot(String methodName) throws IOException {
//        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//    }

//    @AfterSuite (alwaysRun = true)
//    public void teardownAndTakeScreenShot(ITestResult result)
//    {
//       result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).testName();
//
//        System.out.println(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).testName());
//        driver.quit();
//    }




    public void sleep(int duration)
    {
        try {
            Sleeper.SYSTEM_SLEEPER.sleep(new Duration(duration, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
