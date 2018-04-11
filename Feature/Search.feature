Feature: Search products

Scenario: User can search product with name
	Given user is on Home Page
	When user inputs "Iphone" into search field and press Enter Key
	Then the related product is displayed
