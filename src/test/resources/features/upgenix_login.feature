@login
Feature: Login function

  User story:
  As a user, I should be able to log in so that I can land on homepage.
  AC1:Users can log in with valid credentials


  Background:
    Given  user is on the login page
  @wip
  @UPG10-237
  Scenario Outline: Verifying login functionality with first valid credentials
    When user enters valid username "<username>"
    And user enters valid password "<password>"
    And user clicks login button
    Then user is on the inbox page
    Examples:
      | username               | password   |
      | posmanager105@info.com | posmanager |
      | posmanager15@info.com  | posmanager |
      | posmanager23@info.com  | posmanager |
      | posmanager65@info.com  | posmanager |
      | posmanager78@info.com  | posmanager |
  @wip
  @UPG10-239
  Scenario Outline: Verifying login functionality with second valid credentials
    When user enters valid username "<username>"
    And user enters valid password "<password>"
    And user clicks login button
    Then user is on the inbox page
    Examples:
      | username                 | password     |
      | salesmanager53@info.com  | salesmanager |
      | salesmanager101@info.com | salesmanager |
      | salesmanager34@info.com  | salesmanager |
      | salesmanager12@info.com  | salesmanager |
      | salesmanager86@info.com  | salesmanager |
  @wip
  @UPG10-240
  Scenario Outline: Verifying login functionality with invalid username
    When user enters invalid username "<username>"
    And user enters valid password "<password>"
    And user clicks login button
    Then user should see "Wrong login/password" message
    Examples:
      | username                 | password     |
      | posmanager163@info.com   | posmanager   |
      | salesmanager132@info.com | salesmanager |
      | wrongusername@info.com   | salesmanager |
      | fdxnjk@info.com          | posmanager   |

  @UPG10-241
  Scenario Outline: Verifying login functionality with invalid password
    When user enters valid username "<username>"
    And user enters invalid password "<password>"
    And user clicks login button
    Then user should see "Wrong login/password" message
    Examples:
      | username                | password     |
      | posmanager123@info.com  | salesmanager |
      | salesmanager44@info.com | wrongpass    |
      | salesmanager15@info.com | fsdh         |
      | posmanager1@info.com    | 1234         |

  @UPG10-242
  Scenario: Verifying login functionality with empty password
    When user enter username: "posmanager22@info.com" and doesn't enter password
    And user clicks login button
    Then user should see "Please fill out this field." warning message near password

  @UPG10-243
  Scenario: Verifying login functionality with empty username
    When User doesn't enter username and enter password: "posmanager"
    And user clicks login button
    Then user should see "Please fill out this field." warning message near username

  @UPG10-244
  Scenario: Verifying password is in bullet signs
    When user enters valid password "posmanager"
    Then user should see the password in bullet signs by default

  @UPG10-245
  Scenario: Verifying ‘Enter’ key of the keyboard is working correctly
    When user enter valid credentials(username: "posmanager152@info.com", password: "posmanager")
    And user clicks Enter button on the keyboard
    Then user is on the inbox page