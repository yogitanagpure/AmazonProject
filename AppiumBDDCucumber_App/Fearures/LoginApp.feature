Feature:Login

Scenario: Validate login account by providing valid username and password and accepting policy
 Given User Lanch App 
 When  User see login page of App on mobile device 
 And  User enter email as "StageAuto@pwt.com" and password as "1234567890"  
 And User click on Check Box
 And  User click on Login button
 Then  User verify page title should be "Home"