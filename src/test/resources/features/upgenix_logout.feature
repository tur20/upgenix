@logout
Feature: Logout function

  User Story :
  As a user, I should be able to log out.
  AC1:User can log out and ends up in login page.

  Background:
    Given user is logged in


    @UPG10-256
  Scenario: User can log out and ends up in login page.
    When user clicks Log out button
    Then user is logged out

@UPG10-260
  Scenario: The user must be logged out if the user closes the open tab
    When user is on the inbox page
    And user closes the tab
    And user open web page again
    Then user is logged out

 @UPG10-258
  Scenario: Verifying user can not go to the home page again by clicking the step back button
    When user clicks Log out button
    And user is on the login page
    And user clicks the step back button
    Then user should see the message "Your Odoo session expired. Please refresh the current web page."