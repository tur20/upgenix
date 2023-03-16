package com.project.step_definitions;

import com.project.utilities.ConfigurationReader;
import com.project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Login_StepDefinitions {

    WebDriver driver = Driver.getDriver();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters valid username {string}")
    public void user_enters_valid_username(String string) {

    }
    @When("user enters valid password {string}")
    public void user_enters_valid_password(String string) {

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {

    }
    @Then("user is on the inbox page")
    public void user_is_on_the_home_page() {

    }

    @When("user enters invalid username {string}")
    public void user_enters_invalid_username(String string) {

    }

    @When("user enters invalid password {string}")
    public void user_enters_invalid_password(String string) {

    }

    @Then("user should see {string} message")
    public void user_see_message(String string) {

    }

    @When("user enter username: {string} and doesn't enter password")
    public void user_enter_username_and_doesn_t_enter_password(String string) {

    }

    @Then("user should see {string} warning message")
    public void user_should_see_warning_message(String string) {
    }

    @When("User doesn't enter username and enter password: {string}")
    public void user_doesn_t_enter_username_and_enter_password(String string) {

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {

    }
    @Then("user should see the password in bullet signs by default")
    public void user_should_see_the_password_in_bullet_signs_by_default() {

    }

    @When("user enter valid credentials\\(username: {string}, password: {string})")
    public void user_enter_valid_credentials_username_password(String string, String string2) {

    }

    @When("user clicks Enter button on the keyboard")
    public void user_clicks_enter_button_on_the_keyboard() {

    }







}
