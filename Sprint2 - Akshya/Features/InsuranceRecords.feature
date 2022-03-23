@tag
Feature: Insurance Records

  @tag1
  Scenario: Valid results of Insurance records till date for the logged-in profile
    Given User is logged-in for Valid results of Insurance records till date for the logged-in profile
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects Insurance
    Then all the previous Insurance Bills are displayed
    
  @tag2
  Scenario: Validate error message in case of No data available
  	Given User is logged-in to Validate error message in case of No data available under Insurance Records
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects Insurance
    Then No Data Available is displayed !!!
    
  @tag3
  Scenario: Validate the redirection to a particular Insurance
  	Given User is logged-in to Validate the redirection to a particular Insurance
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Insurance
    Then the page is redirected to detailed page for that particular Insurance report
    
  @tag4
  Scenario: Check the details of a particular Insurance report
  	Given User is logged-in to Check the details of a particular Insurance report
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Insurance
    Then the page is redirected to detailed page for that particular Insurance report
    And all the details for that Insurance are displayed
    
  @tag5
  Scenario: Validate redirection to Insurance page from a particular record
  	Given User is logged-in to Validate redirection to Insurance page from a particular record
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Insurance
    Then the page is redirected to detailed page for that particular record
    And all the details for that record are displayed
    Then click on Back button
    And the page is redirected to Insurance page