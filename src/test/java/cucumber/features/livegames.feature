Feature: Betway live games

Scenario: Check live games are dispplayed
	Given I am on https://sports.betway.com/ website
	When I find all betway live games
	Then I check that the list is not empty
	And I print it to the command line