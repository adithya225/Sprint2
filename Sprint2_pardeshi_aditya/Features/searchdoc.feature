#Author: your.email@your.domain.com
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
Feature: Search Doctors

@tag1
Scenario: Suggestions are available according to the input string

		Given User is logged in
		And search bar should be accessible
		When user types input string
		And available specialities appear
		Then user clicks on speciality

@tag2
Scenario: User Searches for results in particular city

		Given User is logged in
		And search bar should be accessible
		When user clicks on a city
		Then all the doctors from that city appear
		And User clicks on doctors name

@tag3
Scenario: User applies filters

		Given User is logged in
		And search bar should be accessible
		When user clicks on different filters
		Then results are sorted according to the filters


#@tag2
#Scenario: Valid Results with Valid Name
#
    #Given user is logged-in
    #And Clicks on Search Bar
    #And types Doctor Name to Search
    #Then valid results with Doctor name appear