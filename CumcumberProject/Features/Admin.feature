Feature: Login
  
Scenario: Sucessful Login with Valid Credentials
  
		    Given User Launch Chrome browser
		    When  User opens URL "https://admin-demo.nopcommerce.com/login"
		    And User enters Email as "admin@yourstore.com" and Password as "admin"
		    And Click on Login
		    Then  Page Title should be "Dashboard / nopCommerce administration"
		    When User click on Log out link
		    And close browser
		    
Scenario: Login with InValid Credentials
  
		    Given User Launch Chrome browser
		    When  User opens URL "https://admin-demo.nopcommerce.com/login"
		    And User enters Email as "admin123@yourstore.com" and Password as "admin123"
		    And Click on Login
		    Then  Page Title should be "Dashboard / nopCommerce administration"
		    When User click on Log out link
		    And close browser  

Scenario Outline: Login data driven
			 Given User Launch Chrome browser
			 When  User opens URL "https://admin-demo.nopcommerce.com/login"
			 And   User enters Email as "<email>" and Password as "<password>"  
			 And   Click on Login
			 Then  Page Title should be "Dashboard / nopCommerce administration"
			 And   close browser
			 
 Examples:
|email                     |password  |
|admin@yourstore.com       |admin     |
|admin123@yourstore.com    |admin12    |

