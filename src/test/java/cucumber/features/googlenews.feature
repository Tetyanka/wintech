Feature: Google news page
	
Scenario: Check headlines are dispplayed
	Given I am on http://news.google.com/ website
	When I find all google news headlines
	Then I check that the list is not empty
	And I print it to the command line
