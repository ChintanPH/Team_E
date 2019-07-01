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
 @cs_cart_Registration
Feature: Registraion
  To validate that I am able to Registraion in to the application

 
  Scenario: validate the Registration in pop up
		Given As a user when I launch application in "chrome" 
	  And navigate to url as "https://demo.cs-cart.com"
	  Then I click on My account 
	  And  I click on signout
	  Then I click on My account1 
    And  I click on Registration link at top of right
    Then I enter first name
		And  I enter last name
		And  I enter phone
		And  I enter email
		And  I enter password
		And  I enter confirm password
		And  I enter birthday
		And I check the checkbox
		Then I click on Registration button
		
		


 