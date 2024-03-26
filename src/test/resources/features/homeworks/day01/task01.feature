@hooks
Feature: Name of the feature file

  @samsung
  Scenario: task01 samsung
    Given user goes to google page
    When user searches for "samsung"
    Then test that hte page title contains the word "samsung"
    And close the page

  @cucumber
  Scenario: task01 cucumber
    Given user goes to google page
    When user searches for "cucumber"
    Then test that hte page title contains the word "cucumber"
    And close the page