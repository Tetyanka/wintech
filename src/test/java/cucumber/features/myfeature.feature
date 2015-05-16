Feature: To test contact form works when there are no errors
	
#Scenario: Check headlines are written to file
#	Given I am on http://news.google.com/ website
#	When I write all headlines to file
#	Then File size should not be null
	
Scenario: Check headlines are written to file
	Given I am on https://sports.betway.com/ website
	When I write all live games to file
	Then File size should not be null