package com.project.step_definitions;

import com.project.pages.UpgenixPage;
import com.project.utilities.BrowserUtils;
import com.project.utilities.ConfigurationReader;
import com.project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.spi.MessageFactory2Adapter;
import org.ietf.jgss.MessageProp;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;

public class Login_StepDefinitions {

    UpgenixPage page = new UpgenixPage();

    WebDriver driver = Driver.getDriver();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters valid username {string}")
    public void user_enters_valid_username(String username) {
        page.usernameInput.sendKeys(username);
    }
    @When("user enters valid password {string}")
    public void user_enters_valid_password(String password) {
        page.passwordInput.sendKeys(password);
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        page.loginButton.click();
    }
    @Then("user is on the inbox page")
    public void user_is_on_the_home_page() {
        BrowserUtils.sleep(3);
        String expectedTitle = "#Inbox - Odoo";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user enters invalid username {string}")
    public void user_enters_invalid_username(String username) {
        page.usernameInput.sendKeys(username);

    }

    @When("user enters invalid password {string}")
    public void user_enters_invalid_password(String password) {
        page.passwordInput.sendKeys(password);

    }

    @Then("user should see {string} message")
    public void user_see_message(String expected) {
        String actual = page.wrongInputMessage.getText();
        Assert.assertEquals(expected,actual);
    }

    @When("user enter username: {string} and doesn't enter password")
    public void user_enter_username_and_doesn_t_enter_password(String username) {
        page.usernameInput.sendKeys(username);
    }

    @Then("user should see {string} warning message near username")
    public void user_should_see_warning_message_near_username(String expected) {
        JavascriptExecutor js = (JavascriptExecutor)driver;

        Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", page.usernameInput);
        String message = (String)js.executeScript("return arguments[0].validationMessage;", page.usernameInput);
        Assert.assertEquals(expected,message);
    }
    @Then("user should see {string} warning message near password")
    public void user_should_see_warning_message_near_password(String expected) {
        JavascriptExecutor js = (JavascriptExecutor)driver;

        Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", page.passwordInput);
        String message = (String)js.executeScript("return arguments[0].validationMessage;", page.passwordInput);
        Assert.assertEquals(expected,message);
    }

    @When("User doesn't enter username and enter password: {string}")
    public void user_doesn_t_enter_username_and_enter_password(String password) {
        page.passwordInput.sendKeys(password);
    }
    @Then("user should see the password in bullet signs by default")
    public void user_should_see_the_password_in_bullet_signs_by_default() {
        Assert.assertEquals("password",page.passwordInput.getAttribute("type"));
    }

    @When("user enter valid credentials\\(username: {string}, password: {string})")
    public void user_enter_valid_credentials_username_password(String username, String password) {
        page.usernameInput.sendKeys(username);
        page.passwordInput.sendKeys(password);
    }

    Actions actions = new Actions(driver);
    @When("user clicks Enter button on the keyboard")
    public void user_clicks_enter_button_on_the_keyboard() {
        actions.sendKeys(Keys.ENTER).perform();
    }







}
