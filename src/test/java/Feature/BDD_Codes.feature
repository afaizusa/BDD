
Feature: Qatar airways
  I want to search for a flight

	Background:
		Given I close cookie warning window
		When I give number of passengers
		And I click on 'Show flights' button
		
  Scenario Outline: Searching for a flight with valid data    
    When I input <departure> city in the From textbox
    And I input <destination> city in the To textbox    
    Then I check for the search result page for valid results
  
  Examples:
  |departure|destination|
  |IAD|DAC|
  |ABC|DEF|
  
	Scenario: Searching for a flight with invalid data   
    When I input wrong departure city in the 'From' textbox
    And I input wrong destination city in the 'To' textbox    
    Then I check for the search result page for invalid results