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
Feature: Login Functionality
  I want to use this template for my feature file

  @valid_login_with_valid_credentials
  Scenario: Check login is successful with valid credentials 
    Given browser is open
    And User is on login page
    When user enters phone number
    And click on get otp
    And user clicks on login page
    Then user is navigated to user profile
    
  @valid_login_with_invalid_credentials
  Scenario: Check login with invalid phone number 
    Given user is in website
    And User is on login page invalid
    When user enters invalid phone number
    Then user is not able click on get OTP button
  
  @valid_login_with_invalid_otp
  Scenario: Check login with invalid otp
    Given browser is ready
    And User is on login 
    When user enters phone number invalid
    And user press on login button
    And user enters wrong otp
    Then user is not able to click on login button.
  