@tag
Feature: Hospitalization Records

  @tag1
  Scenario: Valid results of Hospitalization records till date for the logged-in profile
    Given User is logged-in for Valid results of Hospitalization records till date for the logged-in profile
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects Hospitalization
    Then all the previous Hospitalization records are displayed
    
  @tag2
  Scenario: Validate error message in case of No data available
  	Given User is logged-in to Validate error message in case of No data available under Hospitalization records
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects Hospitalization
    Then No Data Available is displayed !!!
    
  @tag3
  Scenario: Validate the redirection to a particular Hospitalization record
  	Given User is logged-in to Validate the redirection to a particular Hospitalization record
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Hospitalization
    Then the page is redirected to detailed page for that particular record under Hospitalization records
    
  @tag4
  Scenario: Check the details of a particular Hospitalization record
  	Given User is logged-in to Check the details of a particular Hospitalization record
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Hospitalization
    Then the page is redirected to detailed page for that particular record
    And all the details for that record are displayed
    
  @tag5
  Scenario: Validate redirection to Hospitalization page from a particular record
  	Given User is logged-in to Validate redirection to Hospitalization page from a particular record
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Hospitalization
    Then the page is redirected to detailed page for that particular record
    And all the details for that record are displayed
    Then click on Back button
    And the page is redirected to Hospitalization page