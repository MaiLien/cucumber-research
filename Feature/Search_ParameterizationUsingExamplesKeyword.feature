Feature: Search products

Scenario Outline: User can search product with name
	Given user is on Home Page
	When user inputs "<name>" into search product field and press Enter Key
	But there is not product with name
	Then the message is displayed

	Examples: 
		|	name	|
		|	QWERTYUI |