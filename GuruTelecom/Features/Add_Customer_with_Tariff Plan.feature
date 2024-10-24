Feature: Add Customer and Add Tariff Plan to Customer
		
	Scenario: Add a new customer
		Given Open url as " https://demo.guru99.com/telecom/index.html"
		When click on Add Customer
    And User verify page title should be Guru99 Telecom Add Customer
    And I fill customer details info as "Radhika" and "Rao" and "Radhika.11@example.com" and "Pune" and "1234567890" 
    And I click on submit
    Then the customer should be added successfully
   
		When Add Tariff Plan to Customer
    And User verify page title should be Guru99 Add Tariff Plan to Customer
    And I fill CustomerID
    And I click on submit to add plan
    Then Tariff Plan to Customer should be added successfully