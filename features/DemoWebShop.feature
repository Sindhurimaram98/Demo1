#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Demoweb Shop Login
 logging in to Demoweb shop to purchase goods.

  @login
  Scenario: Successfull login
    Given The user is on demowebshop home page 
    And chooses to login
    When the user enters valid username and password 
    And clicks on login
    Then user sees a  home page
   
   @search
   Scenario: searching for products
   Given Again the user is on home page
   And user searches for products in search bar 
   When user clicks on search
   Then product is displayed
   
   @parameterdemo
   Scenario Outline: mutiple logins
   Given Again the user is on Demoweb login 
   And user provides "<Email>" and "<Password>"
   When he clicks on login 
   Then he is on home page
   
   Examples:
   |Email|Password|
   |karthik456@gmail.com|karthik456|
   |karthik456@gmail.com|karthik456|
   
   

 