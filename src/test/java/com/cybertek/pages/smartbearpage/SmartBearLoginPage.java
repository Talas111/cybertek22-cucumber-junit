package com.cybertek.pages.smartbearpage;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {

    public SmartBearLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="ctl00_MainContent_username")
    public WebElement userName;

    @FindBy(css = "[type='password']")
    public WebElement password;

    @FindBy(css = "[type='submit']")
    public WebElement loginButton;
}
