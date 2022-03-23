@tag
Feature: Health Conditions Records

  @tag1
  Scenario: Valid results of Health Condition records till date for the logged-in profile
    Given User is logged-in for Valid results of Health Condition records till date for the logged-in profile
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects Health Conditions
    Then all the previous Health Conditions records are displayed
    
  @tag2
  Scenario: Validate error message in case of No data available
  	Given User is logged-in to Validate error message in case of No data available for Health Condition records
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects Health Conditions
    Then No Data Available is displayed !!!
    
  @tag3
  Scenario: Validate the redirection to a particular Health Condition record
  	Given User is logged-in to Validate the redirection to a particular Health Condition record
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Health Conditions
    Then the page is redirected to detailed page for that particular record under Health Condition Records
    
  @tag4
  Scenario: Check the details of a particular Health Condition record
  	Given User is logged-in to Check the details of a particular Health Condition record
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Health Conditions
    Then the page is redirected to detailed page for that particular record
    And all the details for that record are displayed
    
  @tag5
  Scenario: Validate redirection to Health Conditions page from a particular record
  	Given User is logged-in to Validate redirection to Health Conditions page from a particular record
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Health Conditions
    Then the page is redirected to detailed page for that particular record
    And all the details for that record are displayed
    Then click on Back button
    And the page is redirected to Health Conditions page