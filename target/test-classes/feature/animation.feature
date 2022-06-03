Feature: Operation on Animation button
  I want to use this file to check the Animation button internal features are working properly

 @animation 
  Scenario: Verify Hiding of buttons
  
    Given Already on the API demo app
    When Click on animation button
    And Click on hide show animation
    And Click on custom Animation
    And Click on hide rangeButton
    And Click on Show Button
    And Click on custom Animation
    Then Validate if the button working

  @animation
  Scenario: Verify Showing of buttons
  
       Given already on animation/Hide show
       And Click on hide 
       And Click on hide rangeButton
       And Click on Show Button
       Then Valiadte if button hide working
    
