@task03
Feature: task03

  HW3:
  Go to https://testpages.eviltester.com/styled/validation/input-validation.html
  Fill form and submit
  Do this with 3 scenarios
  Use background and scenario outline

  Background:
      * I open the browser
      Given go to task03 provided url page


  Scenario: task03_01
    When Enter first name as "Mohammed"
    And Last name as "Alqahtanisdfghjklkjhgfds"
    And Age as "23"
    And Select country as "Saudi Arabia"
    And Click on submit
    Then I should see Validation Response message
    Then I close the browser


  Scenario: task03_02
    When Enter first name as "Ali"
    And Last name as "Almutaridfghjkjhgfdsdfgh"
    And Age as "23"
    And Select country as "Saudi Arabia"
    And Click on submit
    Then I should see Validation Response message
    Then I close the browser


  Scenario: task03_03
    When Enter first name as "Abdullah"
    And Last name as "Alqahtani"
    And Age as "19"
    And Select country as "Saudi Arabia"
    And Click on submit
    Then I should see Validation Response message
    Then I close the browser