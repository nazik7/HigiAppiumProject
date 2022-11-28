Feature: Login functionality

  Scenario: Login functionality
    Given user launches higi app
    Then user login with "username" and "password"
    And user is on the higi home page

  Scenario: Login with valid credentials
    Given user launches higi app
    Then user login with "smykty@gmail.com" and "appium20"
    And user is on the higi home page