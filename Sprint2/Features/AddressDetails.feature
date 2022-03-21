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
Feature: Order Medicines

@tag1
    Scenario: Invalid length of input less than lowerbound.  
    Given home page opened
    And user enters the medicine details 
    When user enters pincode of length less than six digits
    Then error message displayed
    
@tag2
    Scenario: Invalid length of input less than upperbound.  
    Given homepage is opened
    And user enters the cart details 
    When user enters pincode of length greater than six digits
    Then error is displayed
    
@tag3
    Scenario: Pincode input is unavailable to service in that area
    Given user is in chorme website
    And user enters the order details 
    When user enters unavailable pincode services on address form
    Then error displayed

 @tag4
    Scenario: Valid entry of pincode   
    Given user is logged-in in the website
    And user enters the details of medicine 
    When user enters valid pincode length on address form
    Then the address details is saved