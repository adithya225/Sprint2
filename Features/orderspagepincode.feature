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
#
#
#@tag
#Feature: Pincode Verification
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: invalid length of picode
    #Given Website  Opened
    #And User Loged Successfully in
    #And User Browse to the Orders page
    #When enters the pincode of invalid length 
    #And click on submit button
    #Then user not able to submit
    #
  #@tag2
  #Scenario: valid length of picode equal to 6 digits
    #Given Website Opened and up for running
    #And User Loged Successfully
    #And User Browsed on to the Orders page
    #When enters the pincode of  length 
    #And click on submit button
    #Then Error Message Thrown
    #And cursor on the Pincode Field 
#
