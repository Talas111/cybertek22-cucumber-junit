package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {


    WikiSearchPage wikiSearchPage=new WikiSearchPage();



    @Given("user is on Wikipedia Home page")
    public void user_is_on_wikipedia_home_page() {
        String wikiUrl= ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(wikiUrl);
    }

    @Then("user sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
String actualTitle=Driver.getDriver().getTitle();
String expectedTitle="Steve Jobs - Wikipedia";
        Assert.assertTrue("Something went wrong your title doesnt match ", actualTitle.equals(expectedTitle));
    }

    @When("user types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikiSearchPage.searchBox.sendKeys(arg0);
    }

    @When("User clicks wiki search button")
    public void userClicksWikiSearchButton() {

        wikiSearchPage.searchButton.click();
    }

    @Then("user sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {

        String actualTitle=Driver.getDriver().getTitle();

        String expectedTitle= arg0+" - Wikipedia";
        Assert.assertTrue("Something went wrong your title doesnt match ", actualTitle.equals(expectedTitle));
    }



    @Then("user sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {
        String expectedHeader = arg0;
        String actualHeader = wikiSearchPage.firstHeader.getText();
        Assert.assertEquals(actualHeader, expectedHeader);
    }
}
