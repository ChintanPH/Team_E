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
@cs_cart @cs_cart_AddToCart 
Feature: Add to Cart
  To validate products are added in the cart
  
  
 Background: Pre Requsite open and sign in
		Given As a user when I launch application in "chrome" 
	  And navigate to url as "https://demo.cs-cart.com"
    When I click on My account 
    And click on Sign in button
    Then sign in pop up is displayed
		And username and password already entered
		When I click on sign in button
		Then I am logged in to the application
		
	Scenario: Add to cart single product
	    When I enter "computer" in top search box
	    And click on search submit button 
	    And product results are displayed
	    When I click on list view button
	    Then products are displayed in list view
	    When I click add to cart for product code H0217E3OE9
			Then my cart is updated with product quantity as 1 and correct total price
	    And close the browser
		