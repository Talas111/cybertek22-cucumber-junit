package com.cybertek.step_definitions.smartbear;

import com.cybertek.pages.smartbearpage.OrderPage;
import com.cybertek.pages.smartbearpage.SmartBearLoginPage;
import com.cybertek.pages.smartbearpage.ViewAllOrderPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDefinitions {

    OrderPage orderPage = new OrderPage();
    ViewAllOrderPage viewAllOrderPage = new ViewAllOrderPage();


    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearUrl"));
        SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();

        String userName = ConfigurationReader.getProperty("smartBearUserName");
        String password = ConfigurationReader.getProperty("smartBearPassword");
        smartBearLoginPage.userName.sendKeys(userName);
        smartBearLoginPage.password.sendKeys(password);
        smartBearLoginPage.loginButton.click();
        orderPage.orderLink.click();

    }


    @Given("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        BrowserUtils.sleep(1);
        Select select = new Select(orderPage.selectDropDown);
        select.selectByVisibleText(string);
    }

    @Given("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
//orderPage.quantity.clear();
        BrowserUtils.sleep(3);
        orderPage.quantity.sendKeys(string);// int1+"";


    }

    @And("User enters {string}to costumer name")
    public void userEntersToCostumerName(String arg0) {
        orderPage.usernameInput.sendKeys(arg0);
    }

    @Given("User enters {string} to street")
    public void user_enters_to_street(String string) {
        orderPage.inputStreet.sendKeys(string);
    }

    @Given("User enters {string} to city")
    public void user_enters_to_city(String string) {
        orderPage.city.sendKeys(string);
    }

    @Given("User enters {string} to state")
    public void user_enters_to_state(String string) {
        orderPage.state.sendKeys(string);
    }

    @Given("User enters {string}")
    public void user_enters(String string) {
        orderPage.zipcodeInput.sendKeys(string);
    }

    @And("User selects {string} as card type")
    public void userSelectsAsCardType(String arg0) {
        switch (arg0.toLowerCase()) {
            case "visa":
                orderPage.visaButton.click();
                break;
            case "mastercard":
                orderPage.masterCardButton.click();
                break;
            case "american express":
                orderPage.americanExpressButton.click();
                break;
        }
    }

    @Given("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        orderPage.cardNumberInput.sendKeys(string);
    }

    @Given("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        orderPage.expireDate.sendKeys(string);
    }

    @Given("User clicks process button")
    public void user_clicks_process_button() {
        orderPage.processButton.click();
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        orderPage.viewAllOrders.click();
        String expectedResult = string;
        String actualResult = viewAllOrderPage.firstNameOnTheList.getText();
        Assert.assertEquals("Expected is not equal as actual ", actualResult, expectedResult);
    }


}
