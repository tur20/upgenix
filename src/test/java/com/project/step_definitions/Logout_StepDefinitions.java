package com.project.step_definitions;

import com.project.pages.UpgenixPage;
import com.project.utilities.ConfigurationReader;
import com.project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class Logout_StepDefinitions {

    UpgenixPage page = new UpgenixPage();

    WebDriver driver = Driver.getDriver();

    @Given("user is logged in")
    public void userIsLoggedIn() {
        driver.get(ConfigurationReader.getProperty("url"));
        page.usernameInput.sendKeys("posmanager105@info.com");
        page.passwordInput.sendKeys("posmanager" + Keys.ENTER);

        Assert.assertTrue(page.loggedInUserName.isDisplayed());

    }
    @When("user clicks Log out button")
    public void userClicksLogOutButton() {
        page.loggedInUserName.click();
        page.logOutButton.click();
    }

    @And("user closes the tab")
    public void userClosesTheTab() {
     Actions actions = new Actions(driver);
     actions.keyDown(Keys.CONTROL).sendKeys("w").keyUp(Keys.CONTROL);

    }

    @And("user open web page again")
    public void userOpenWebPageAgain() {
        driver.get(ConfigurationReader.getProperty("url"));

    }

    @Then("user is logged out")
    public void userIsLoggedOut() {

        try {
            Assert.assertTrue(page.signinBtn.isDisplayed());
        }catch (NoSuchElementException e){
            Assert.assertFalse(page.POSManager105.isDisplayed());
        }
    }

    @And("user clicks the step back button")
    public void userClicksTheStepBackButton() {
        driver.navigate().back();
    }

    @Then("user should see the message {string}")
    public void userShouldSeeTheMessage(String expected) {
        String actual = page.sessionExpiredMessage.getText();
        Assert.assertEquals(expected,actual);
    }


}
