
Feature: Search and Add to Cart functionality on Amazon site

	Scenario: Search for an existing product
   
    Given I am on the Amazon homepage
    When I Enter product as "IAD345786" in the search bar
    And I should see a "No results for" message 
    And I click on amazon.in label go to home page
    And I Enter product as "Laptop" in the search bar
    And I should see product results containing "Laptop"
    And I add the 4th product from the results to the cart   
    And I am on the cart page
    And I should see product in cart  
    And The cart should reflect the updated quantity and price
    And I remove the product from the cart
    Then the cart should be empty
    
   
   
   
   


