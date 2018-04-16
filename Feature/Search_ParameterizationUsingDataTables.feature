Feature: Search products

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
	| Username   | Password |
  | testuser_1 | Test@153 |
  | testuser_2 | Test@154 |
	Then Error message is displayed