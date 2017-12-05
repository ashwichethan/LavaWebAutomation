package com.lava.momentNode;

import com.lava.utils.ObjectsBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 13/07/17.
 */
public class AddAndRemoveNodeRepo extends ObjectsBase {
    public AddAndRemoveNodeRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//a[@class='remove-item' and contains(.,'Remove')]")
    protected static List<WebElement> removeText;
    @FindBy(xpath = "//div[@jqyoui-draggable=\"{index:0,animate:true}\"]")
    protected static List<WebElement> scrollOnNode;
    @FindBy(xpath = "//div[@class=\"confirm-popup\"]/descendant::span")
    protected static WebElement areYouSureText;
    @FindBy(xpath = "//a[contains(.,'Yes')]")
    protected static List<WebElement> removeConfirm;
    @FindBy(xpath = "//h6[@class=\"engagement-drag\"]")
    protected static WebElement emptyEng;
    @FindBy(xpath = "//a[contains(.,'Home')]")
    protected static WebElement homeTab;
    @FindBy(xpath = "//treasure-overlay-spinner[@class='ng-isolate-scope']/descendant::div[@class='treasure-overlay-spinner']")
    protected static WebElement spinnerOverlay;


}
