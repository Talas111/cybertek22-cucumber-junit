package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    @Given("user is on Login page")
    public void user_is_on_login_page() {
        System.out.println("User is on the login page ");
    }
    @When("user  enters valid Librarian username")
    public void user_enters_valid_librarian_username() {
        System.out.println("User enters Librarian userName");
      //  Assert.fail("INTENTIONAL FAILING, DELETE IT LATER");

    }
    @When("user  enters valid Librarian password")
    public void user_enters_valid_librarian_password() {
        System.out.println("user enters valid Librarian password");
    }
    @Then("user  should see the  Dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user  should see the  Dashboard");

    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters Student username");
    }
    // write code to implement above line into

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters  Student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");

    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }
}
