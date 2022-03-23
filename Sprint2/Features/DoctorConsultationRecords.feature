@tag
Feature: Previous Doctor Consultation Records

  @tag1
  Scenario: Valid results of Consultation records till date for the logged-in profile
    Given User is logged-in for Valid results of Consultation records till date for the logged-in profile
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects Doctor Consultations
    Then all the previous Doctor Consultations records are displayed
    
  @tag2
  Scenario: Validate error message in case of No data available
  	Given User is logged-in to Validate error message in case of No data available
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects Doctor Consultations
    Then No Data Available is displayed !!!
    
  @tag3
  Scenario: Validate the redirection to a particular Consultation record
  	Given User is logged-in to Validate the redirection to a particular Consultation record
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Doctor Consultations
    Then the page is redirected to detailed consultation page for that particular record
    
  @tag4
  Scenario: Check the details of a particular Consultation record
  	Given User is logged-in to Check the details of a particular Consultation record
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Doctor Consultations
    Then the page is redirected to the consultation page for that particular record
    And all the details for that record are displayed
    