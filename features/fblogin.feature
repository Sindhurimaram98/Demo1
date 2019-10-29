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
Feature: Facebook login	
Signing in to facebook to post updates

  @	login
  Scenario: Successfull login
   Given user have chosen to sign in from home page
   When user gives valid username and password
   And clicks on login button
   Then user shall be able to login and should be taken to home page
   And sees his timeline page .
   
   @search
 
 
