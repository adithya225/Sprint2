@tag
Feature: Billing Records

  @tag1
  Scenario: Valid results of Billing records till date for the logged-in profile
    Given User is logged-in for Valid results of Billing records till date for the logged-in profile
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects Bills
    Then all the previous Bills are displayed
    
  @tag2
  Scenario: Validate error message in case of No data available
  	Given User is logged-in to Validate error message in case of No data available for Billing Records
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects Bills
    Then No Data Available is displayed !!!
    
  @tag3
  Scenario: Validate the redirection to a particular Bill
  	Given User is logged-in to Validate the redirection to a particular Bill
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Bills
    Then the page is redirected to detailed page for that particular bill
    
  @tag4
  Scenario: Check the details of a particular Bill
  	Given User is logged-in to Check the details of a particular Bill
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Bills
    Then the page is redirected to detailed page for that particular bill
    And all the details for that bill are displayed
    
  @tag5
  Scenario: Validate redirection to Bills page from a particular record
  	Given User is logged-in to Validate redirection to Bills page from a particular record
    And Health Records page is accessible
    When the user clicks on View Health Records
    And selects a record under Bills
    Then the page is redirected to detailed page for that particular record
    And all the details for that record are displayed
    Then click on Back button
    And the page is redirected to Bills page