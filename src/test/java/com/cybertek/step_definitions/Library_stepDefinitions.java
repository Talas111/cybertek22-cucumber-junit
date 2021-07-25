package com.cybertek.step_definitions;

import com.cybertek.pages.librarian_page.Librarian_LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Library_stepDefinitions {

    Librarian_LoginPage librarian_loginPage = new Librarian_LoginPage();


    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));

    }

    @When("user enters valid librarian  credentials")
    public void user_enters_valid_librarian_credentials() {
        String userName = ConfigurationReader.getProperty("librarianUserName");
        String password = ConfigurationReader.getProperty("librarianPassword");
        librarian_loginPage.emailInputBox.sendKeys(userName);
        librarian_loginPage.emailPassword.sendKeys(password);
        librarian_loginPage.submitButton.click();
    }

    @Then("user should able to see dashboard")
    public void user_should_able_to_see_dashboard() {
        String expectedDashboard = "dashboard";
       // BrowserUtils.sleep(3);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expectedDashboard));

        String actualDashboard = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("expected and actual doesnt match! ", actualDashboard.contains(expectedDashboard));
    }



    @When("user enters valid {string} and {string} credentials")
    public void userEntersValidAndCredentials(String userName, String password) {

        userName= ConfigurationReader.getProperty("studentUserName");
        password = ConfigurationReader.getProperty("studentPassword");
        librarian_loginPage.emailInputBox.sendKeys(userName);
        librarian_loginPage.emailPassword.sendKeys(password);
        librarian_loginPage.submitButton.click();


    }



    @Then("user should able to see {string}")
    public void userShouldAbleToSee(String arg0) {
        String expectedDashboard = "books";
        // BrowserUtils.sleep(3);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expectedDashboard));

        String actualDashboard = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("expected and actual doesnt match! ", actualDashboard.contains(expectedDashboard));
    }



    @Then("user sees {string}  {string}")
    public void userSees(String arg0, String arg1) {


    }


}
