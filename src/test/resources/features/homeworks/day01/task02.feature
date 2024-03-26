Feature: Name of the feature file

  HW:2
  By using Cucumber framework:
  Go to https://testpages.eviltester.com/styled/dynamic-buttons-simple.html
  Click buttons to see message 'All Buttons Clicked!

  @task02
  Scenario: task02
    Given go to provided url page
    When click on start button
    And click on one button
    And click on two button
    And click on three button
    Then All Buttons Clicked message appears
    And I close the browser