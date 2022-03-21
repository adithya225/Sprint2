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
Feature: Purchase Medicine


  @Search_medicine
  Scenario: Search Medicine
    Given website is upon running
    And navigate to medicines page
    When user type on Search box
    And user click on Search button
    Then list of Searched Products should display

  @add_medicine_to_cart
  Scenario: Adding Medicine to the Cart
    Given search Medicine is done
    When User click on add to cart button
    Then Medicine Successfully add to cart

  @adding_or_deleting_the_quantity_in_cart
  Scenario: Updating the Cart
    Given Medicine is added to the Cart
    When user click on adding or deleting 
    Then quantity of products need to be updated in the cart
    
  @place_order
  Scenario: Place order for Medicine
     Given add the medicines to the cart
     When User click on the Proceed button
     And User Select the Prescription type
     And User click on proceed button
     Then Payment options Page should come
  
  
  
  