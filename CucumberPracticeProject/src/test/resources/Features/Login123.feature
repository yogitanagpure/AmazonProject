Feature: Login Facebook Feature
  In order to perform sucesful login
  As a User
  I have to enter correct username and password

  Scenario: Login to the Facebook Website
    Given uesr navigate to the facebook website
    When user validates the homepage title
    Then user enters username
    And user enters passowrd
    And user clicks on signin button
