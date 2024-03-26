Feature: Scenario Outline Feature

  Scenario Outline:
    Given I am on the google homepage
    And I search for "<search key>" on google
    Then I should see "<search key>" on the results
    And  I close the browser
    Examples:
      | search key |
      | x        |
      | Youtube  |