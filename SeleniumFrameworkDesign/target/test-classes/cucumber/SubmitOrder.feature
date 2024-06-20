 
@tag
Feature: Purchase the order from Ecommerce Website
  I want to use this template for my feature file
 
 Background:
 Given I landed on Ecommerce Page


  @tag2
  Scenario Outline: Positive Test of Submitting the order
    Given Logged in with the username <name> and password <password>
    When I add the product  <productName> from the Cart
    And  Checkout <productName> and submit  the order
    Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage

    Examples: 
      | name             | password      | productName |
      | rtup13@gmail.com |     ritu@123P | ZARA COAT 3 |
   
