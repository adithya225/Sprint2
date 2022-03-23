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
Feature: Book Test

  @tag1
  Scenario: Validate appearance of valid tests
    Given Website is accessible
    And User can access Lab Test Page
    Then Valid Lab Tests appear
    
  @tag2
  Scenario: Validate addition of test to cart
    Given Website is accessible
    And User can access Lab Test Page
    And User is logged in
    When User clicks Add to cart
    Then Test is added to cart
    
  @tag3
  Scenario: Validate addition of recommended test to cart
    Given Website is accessible
    And User can access Lab Test Page
    And User is logged in
    When User clicks Add to cart
    And User clicks on View Details
    Then User can add recommended test to cart
    
  @tag4
  Scenario: Validate removal of test from cart
    Given Website is accessible
    And User can access Lab Test Page
    And User is logged in
    When User clicks Add to cart
    And User clicks on View Details
    And User clicks on remove test 
    Then Test is removed from cart
    
  @tag5
  Scenario: Add new member as patient
    Given Website is accessible
    And User can access Lab Test Page
    And User is logged in
    And User clicks on Add to cart
    And User clicks on Go to cart
    When User clicks Add Member
    And User fills the form
    Then New member is added as Patient

  @tag6
  Scenario: Add patient for test
    Given Website is accessible
    And User can access Lab Test Page
    And User is logged in
    And User clicks on Add to cart
    And User clicks on Go to cart
    And User selects patient for the test
    Then Patients are added
    
  @tag7
  Scenario: User can access Payment Page
    Given Website is accessible
    And User can access Lab Test Page
    And User is logged in
    And User clicks on Add to cart
    And User clicks on Go to cart
    And User selects patient for the test
    Then User is redirected to payment page

   
    