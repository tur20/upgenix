Feature: Logout function

  User Story :
  As a user, I should be able to log out.
  AC1:User can log out and ends up in login page.

  Background:
    Given user is on the inbox page

  @UPG10-237 @logout
  Scenario: User can log out and ends up in login page.
    When user clicks Log out button
    Then user is on the login page

  Scenario: The user must be logged out if the user closes the open tab
    When user is on the inbox page
    And user closes the tab
    And user open web page again
    Then user is logged out

  Scenario: Verifying user can not go to the home page again by clicking the step back button
    When user clicks Log out button
    And user is on the login page
    And user clicks the step back button
    Then user should see the message "Your Odoo session expired. Please refresh the current web page."