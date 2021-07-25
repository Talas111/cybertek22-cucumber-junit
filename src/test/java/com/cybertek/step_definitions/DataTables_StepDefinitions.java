package com.cybertek.step_definitions;

import com.cybertek.pages.DropDownPage;
import com.cybertek.pages.librarian_page.Librarian_LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
Librarian_LoginPage librarian_loginPage=new Librarian_LoginPage();
DropDownPage dropDownPage = new DropDownPage();


    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        // Write code here that turns the phrase above into concrete actions
//Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
String url1= ConfigurationReader.getProperty("dropDownUrl");
Driver.getDriver().get(url1);
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedList) {
// 1 get the dropdown as a select object
        Select monthDropDown= new Select(dropDownPage.month);

//      // get the all the options from the store inside of a list
     List<WebElement>  actualMonthAsWebElement  = monthDropDown.getOptions();
        Assert.assertEquals(expectedList, BrowserUtils.getElementsText( actualMonthAsWebElement));
//      // feature file has july june august all as a string but actual is list of Webelement
//        // so we need to convert them to the string
//        //3 Convert the actualMonth from list<WebElement> to List<String>
//
//        List<String> actualMonthAsString = new ArrayList<>();
//
//        for (WebElement each : actualMonthAsWebElement) {
//            actualMonthAsString.add(each.getText());
//        }

      //  Assert.assertEquals(actualMonthAsString, expectedList);
    }







    @Given("user is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {

        String url= ConfigurationReader.getProperty("library_url");
        Driver.getDriver().get(url);

    }
    @When("user enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String, String> loginInformation) {
//        System.out.println("loginInformation.get(\"username\") = " + loginInformation.get("username"));
//        System.out.println("loginInformation.get(\"password\") = " + loginInformation.get("password"));
        librarian_loginPage.emailInputBox.sendKeys(loginInformation.get("username"));
        librarian_loginPage.emailPassword.sendKeys(loginInformation.get("password"));
        librarian_loginPage.submitButton.click();
    }
    @Then("user should see title is Library")
    public void userShouldSeeTitleIsLibrary() {

          System.out.println("User is on the login page! ");
String expectedTitle="dashboard";
        BrowserUtils.sleep(3);
String actualTitle=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("not same url", actualTitle.contains(expectedTitle));
    }



    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {
        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println("listOfFruits = " + listOfFruits);
    }




}
