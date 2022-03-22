Feature: Book Appointment

Scenario: Check valid status of Doctor is available

    Given user can view Doctors List
    Then valid status is availability 
    
Scenario: Profile Redirection on selecting Doctor profile

	Given Doctor is available
	And user can click on profile
	Then user is redirected to doctor profile


Scenario: User redirection to Appointment page 

    Given user has selected a Doctor
    And book appointment button is clicked
    And user is logged-in
    Then user can view appointment form

Scenario: Display of valid timeslot

    Given appointment form is accessable
    Then user can view all valid timeslot
    
Scenario: Display of invalid timeslot

    Given appointment form is accessable
    Then user cannot view all invalid timeslot


Scenario: Display of valid dates

    Given appointment form is accessable
    And valid dates are available
    Then user can view all valid dates

Scenario: Display of invalid dates

    Given appointment form is accessable
    And invalid dates are available
    Then user can view all invalid dates

Scenario: Disabled Book button when timeslot is not selected

    Given user is loggedin
    And appointment form is accessable
    But timeslot is not selected
    Then Book button is Disabled


Scenario: Enabled Book button on valid entry

    Given user is loggedin
    And appointment form is accessable
    And user selected valid dates and timeslots
    Then Book button is Enabled