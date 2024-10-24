Feature: LoginDemo
  
Scenario: Successful Login with Valid Credentials
  
		    Given User Launch Chrome browser
		    When  User opens URL "https://stage.net4medix.com/mmc/b2b/showLogin"
		    And enters Email as "StageYog@pwt.com" and Password as "1234567890"
		    And Click on Continue
		    Then  Page Title should be "Conversations"
		    And close browser