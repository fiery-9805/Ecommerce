
@tag
Feature: Error Validation
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Title of your scenario outline
    Given I landed on Ecommerce Page
    When Logged in with the username <name> and password <password>
    Then "Incorrect email or password."messgae is displayed

    Examples: 
        | name             | password    | 
      | rtup13@gmail.com |     ritu@123 |
