package com.lava.momentNode;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 17/07/17.
 */
public class SetScheduleRepo extends ObjectsBase {

    public SetScheduleRepo(RemoteWebDriver driver){super(driver);}
    @FindBy(xpath = "//span[@class=\"moment-schedule\"]")
    protected static WebElement setScheduleBtn;
    @FindBy(xpath = "//div[@id=\"schedule-modal\"]/descendant::div[@class='modal-content']")
    protected static WebElement modalDialog;
    @FindBy(xpath = "//input[@id='start-date']")
    protected static WebElement startDate;
    @FindBy(xpath = "//td[@class='day'or @class='new day']")
    protected static List<WebElement> selectStartandEndDate;
    @FindBy(xpath = "//input[@id='end-date']")
    protected static WebElement endDate;
    @FindBy(xpath = "//input[@id='start-time']")
    protected static WebElement startTime;
    @FindBy(xpath = "//input[@id='end-time']")
    protected static WebElement endTime;


    @FindBy(xpath = "//span[@class=\"current\"]")
    protected static List<WebElement> timeZones;
    @FindBy(xpath = "//button[@id='setSchedule']")
    protected static WebElement saveBtn;


}
