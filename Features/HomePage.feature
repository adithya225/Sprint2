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
Feature: Home Page Functionality

  @Login_button_Apperance
  Scenario: Verification of Login button on home Page
   Given Chrome is Opened
   When User is on WebPage
   Then Login button is Visible
   
  @Redirection_to_Home_Page
  Scenario: Redirection to Home Page on Clicking on the Header or Title on the Page
  
    Given website is opened
    When click on the logo on the Home Page
    Then Redirect to the Home Page
    
  @Redirection_to_menu_page
  Scenario: Redirection to Respective Section on Clicking on the Menu Option.
  
    Given HomePage is opened
    When click on the menu options on Home Page
    Then Redirect to the Respective Page
    

    

