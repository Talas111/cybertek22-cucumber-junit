package com.cybertek.pages.smartbearpage;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrderPage {
    public ViewAllOrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


@FindBy(xpath = "//table[@class='SampleTable']//tr[2]/td[2]")
    public WebElement firstNameOnTheList;
}
