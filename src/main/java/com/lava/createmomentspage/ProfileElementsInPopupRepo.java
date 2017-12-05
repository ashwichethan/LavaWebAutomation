package com.lava.createmomentspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by jenkins on 14/03/17.
 */
public class ProfileElementsInPopupRepo {



    @FindBy(xpath = "//div[@class='modal-header']/descendant::h4[contains(.,'Create profile type ticket holders')]")
    protected static WebElement ticketHolderTitle;

    @FindBy(xpath = "//div[@class='field-col field-textBox horizontal-align- vertical-align- arg-type-']/descendant::input[@placeholder='Enter profile name']")
    protected static WebElement enterProfileNameField;

    @FindBy(xpath = "//img[@src='images/overlay/engagement-title.png']")
    protected static WebElement textFieldIcon;




}
