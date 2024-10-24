Feature: Add Customer

 Scenario Outline: Add a new customer
		Given Open url as "https://demo.guru99.com/telecom/index.html"
		When click on Add Customer
    And User verify page title should be Guru99 Telecom Add Customer
    And I fill customer details info as "Fname" and "Lname" and "Email" and "Address" and "Mobile No" 
    And I click on submit
    Then the customer should be added successfully
    
    
    Examples:
   |Fname		|lname		|Email						|Address		|Mobile No|
   |Raj			|Chudhari	|raj12@gmail.com	|Pune				|9876543210|