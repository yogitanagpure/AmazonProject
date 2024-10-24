@Login
Feature: Login Scenarios
  This cases is for Login feature which is every case will started with Background first.

  Background: User launch the AUT
    Given user launch the Sauce Demo app
    Then Sauce Demo app will displayed

  Scenario: TC001 - User login with correct credential
    Given user input username as "standard_user"
    And user input password as "secret_sauce"
    And user click Login button
    Then user redirected to "PRODUCTS" page

 