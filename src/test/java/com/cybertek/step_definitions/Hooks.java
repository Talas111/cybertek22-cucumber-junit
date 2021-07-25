package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    // Hooks allow us to create pre and post conditioin for each scenario AND EACH STEP
    // @Before ans @After


    // this below method imported from cucumber not JUint
    @Before (value = "@login", order =1)// apples only login set up scenarios which ever test case has @login
    // hooks can be also limited to apply to certain scenarios with certain @tags ("value" keyword)
    public void setupScenario(){
        System.out.println("Setting up browser with further details....");
    }
    @After
    public void tearDownScenario(Scenario scenario){


      //  scenario.isFailed()----->  if scenario  fails returns true



      if (scenario.isFailed()){


        byte [] screenShot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        scenario.attach(screenShot,"image/png",scenario.getName());

      }
        System.out.println("-----Tear Down Steps are being applied-----");

        // Driver.closeDriver();
    }



    @BeforeStep
    public void setupStep(){
        System.out.println("----setup applying for each step----");
    }


    @AfterStep
    public void afterStep(){
        System.out.println("----teardown applying for each step");
    }
}
