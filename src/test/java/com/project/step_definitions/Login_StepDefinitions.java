package com.project.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
    }

    @When("user enters valid <username>")
    public void userEntersValidUsername() {
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
    }

    @Then("user is on the home page")
    public void userIsOnTheHomePage() {
    }

    @When("user enters invalid <username>")
    public void userEntersInvalidUsername() {
    }

    @Then("user see {string} message")
    public void userSeeMessage(String arg0) {
    }

    @Then("user should see {string} message")
    public void userShouldSeeMessage(String arg0) {
    }

    @When("user enter username: {string} and doesn't enter password")
    public void userEnterUsernameAndDoesnTEnterPassword(String arg0) {
    }

    @Then("user should see {string} warning message")
    public void userShouldSeeWarningMessage(String arg0) {
    }

    @When("User doesn't enter username and enter password: {string}")
    public void userDoesnTEnterUsernameAndEnterPassword(String arg0) {
    }

    @When("user enters password {string}")
    public void userEntersPassword(String arg0) {
    }

    @Then("user shoud see the password in bullet signs by default")
    public void userShoudSeeThePasswordInBulletSignsByDefault() {
    }

    @When("user enter valid credentials\\(username: {string}, password: {string})")
    public void userEnterValidCredentialsUsernamePassword(String arg0, String arg1) {
    }

    @And("user clicks Enter button on the keyboard")
    public void userClicksEnterButtonOnTheKeyboard() {
    }
}
