
Feature: Login page Automation of saucedemo App

   Scenario: Check login is sucessful with valid creds
   
    Given User is on login page
    When when user enters valid username and password
    And click on login button
    Then User is navigated to home page
    And close the browser