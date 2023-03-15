Feature: login function

  Background: user is on the login page

  User story:
  As a user, I should be able to log in so that I can land on homepage.

  AC1:Users can log in with valid credentials

  @UPG10-237
  Scenario Outline: Verifying login functionality with first valid credentials
    When user enters valid <username>
    And user enters valid <password>
    And user clicks login button
    Then user is on the home page
    Examples:
      | username               | password   |
      | posmanager105@info.com | posmanager |
      | posmanager15@info.com  | posmanager |
      | posmanager23@info.com  | posmanager |
      | posmanager65@info.com  | posmanager |
      | posmanager78@info.com  | posmanager |
