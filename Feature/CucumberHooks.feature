Feature: Test Hooks

	@ABC
  Scenario Outline: This scenario is to test hooks functionality
    Given this is the first step
    When this is the second step
    Then this is the third step

    Examples: 
      | Index  |
      | First  |
      | Second |

	@Abc
  Scenario: Tagged hooks _ FIRST
    Given this is the first step
    When this is the second step
    Then this is the third step
	
	@First
  Scenario: Tagged hooks _ SECOND
    Given this is the first step
    When this is the second step
    Then this is the third step
	