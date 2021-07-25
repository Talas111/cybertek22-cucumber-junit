package com.cybertek.pages.librarian_page;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Librarian_LoginPage {
    public Librarian_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "inputEmail")
    public WebElement emailInputBox;


    @FindBy(id = "inputPassword")
    public WebElement emailPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    /**
     * Login method that logs in with specific usrname
     */

    public void login() {
        emailInputBox.sendKeys("username");
        emailPassword.sendKeys("password");
        submitButton.click();
    }


    public void loginWithAdmin() {
        emailInputBox.sendKeys("admin");
        emailPassword.sendKeys("password");
        submitButton.click();
    }

    public void loginWithConfigurationFile() {
        emailInputBox.sendKeys(ConfigurationReader.getProperty("librarianUserName"));
        emailPassword.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        submitButton.click();
    }

    /**
     * THIS METHOD ACCEPTS ARGUMENTS DIRECTLY FROM THE METHOD
     */
    public void login(String username, String password) {
        emailInputBox.sendKeys(username);
        emailPassword.sendKeys(password);
        submitButton.click();

    }

}
