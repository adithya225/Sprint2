Feature: Access User Appointments List

Scenario: Valid Results for User Appointment
    Given user is logged in
    And Appointment page is accessed 
    Then all booked Appointments will be visible

Scenario: Error message for empty User Appointment list
    Given user is logged in
    And Appointment page is accessed 
    Then error message is displayed when no history