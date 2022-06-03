
Feature: Operation on App Button and alarm
  I want to use this template for my App Button and alarm validations 
  

  Scenario: Checking on Alarm
    Given In API demo app
    When click on App button
    And click on Alarm 
    And click on Alarm Controller
    And click on One shot alarm
    And click on Repeating alarm
    And click on Stop alarm
    Then Alarm will set
