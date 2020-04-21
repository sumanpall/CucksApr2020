
Feature: Refund return policy


 Background: 
    Given operator logged into the system
 
   @FunctionalTest
   Scenario: Refund of an item
    
    Given Alex purchased microwave for 100 dollors
    And Alex has receipt
    When Alex returns the faulty microwave
    Then Alex should get refund of 100 dollors
   @FunctionalTest @SmokeTest
   Scenario Outline: Refund of an item1
    Given Alex purchased microwave for <price> dollors
    And Alex has receipt
    When Alex returns the faulty microwave
    Then Alex should get refund of <price> dollors
    Examples:
      |price|
      |200|
      |300|
      
   @RegressionTest  
   Scenario: App SignIn  
   Given User provides valid credentials
   Then SignIn is successful  
   
   
   @Datadriven
   Scenario: app credentials
   Given user is at signIn page
   When user provides valid user and password
       |Mike|Smith|
       |James|Cameron|
       |Will|David|
   Then user sign in is success
   
   
   
   
   
      
   