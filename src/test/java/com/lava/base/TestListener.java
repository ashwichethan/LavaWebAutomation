package com.lava.base;

/**
 * Created by Dewesh Yadav on 3/14/2017.
 */

import com.lava.utils.Base;
import org.testng.*;
import org.testng.annotations.Test;
//import utils.Base;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.lava.base.TestBase.testCasecount;

/**
 * Created by codecraft on 28/02/17.
 */
public class TestListener extends Base implements ITestListener {
    @Override
    public void onFinish(ITestContext context) {

    }

    public void onTestStart(ITestResult result) {
    }


    public void onTestSuccess(ITestResult result) {
        String methodName;
        System.out.println("-----------");
        log("Test " + result.getName() + " PASSED");
        String testname = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).testName();
        String sheet = null;
        String[] sheetName = testname.split("_");
        switch (sheetName[0]) {
            case "Lava":
                sheet = "Sheet1";
                break;
            case "Create Moment":
                sheet = "Sheet1";
                break;
            default:
                break;
        }
        String[] testCase = testname.split(",");
        int length = testCase.length;

        for (String testCaseID : testCase) {
            try {
                updateTestResult(testCaseID, "PASS", sheet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        log("Class name " + result.getTestClass());
        System.out.println("------------");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("-----------");
        log("Test " + result.getName() + " FAILED");
        String testname = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class).testName();
        String sheet = null;
        String[] sheetName = testname.split("_");
        switch (sheetName[0]) {
            case "Lava":
                sheet = "Sheet1";
                break;
            case "Create Moment":
                sheet = "Sheet1";
                break;
            default:
                break;
        }

        String[] testCase = testname.split(",");
        int length = testCase.length;

        for (String testCaseID : testCase) {
            try {
                updateTestResult(testCaseID, "FAIL", sheet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        log("Class name " + result.getTestClass());
        System.out.println("------------");
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onStart(ITestContext context) {
    }

    private void log(String methodName) {
        System.out.println(methodName);
    }

    private void log(IClass testClass) {
        System.out.println(testClass);
    }

}
