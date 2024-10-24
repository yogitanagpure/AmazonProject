Feature: Search and Add to Cart functionality on Amazon site

	Scenario Outline: Search for an existing and non-existing product
   
    Given I am on the Amazon homepage
    When I Enter product as "<product>" in the search bar
    And I should see product results containing "<product>"
    Then I add the 4th product from the results to the cart
    
    Examples:
   |product|
   |Laptop|
   |Mobile|