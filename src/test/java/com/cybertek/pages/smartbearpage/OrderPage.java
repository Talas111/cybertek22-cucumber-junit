package com.cybertek.pages.smartbearpage;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
    public OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(linkText = "Order")
    public WebElement orderLink;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement selectDropDown;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    public WebElement inputStreet;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    public WebElement city;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")

    public WebElement state;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")
    public WebElement zipcodeInput;


    @FindBy(css = "[value='Visa']")
    public WebElement visaButton;


    @FindBy(css = "[value='MasterCard']")
    public WebElement masterCardButton;

    @FindBy(css = "[value='American Express]")
    public WebElement americanExpressButton;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
    public WebElement cardNumberInput;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    public WebElement expireDate;


    @FindBy(linkText = "Process")
    public WebElement processButton;

    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrders;
}
