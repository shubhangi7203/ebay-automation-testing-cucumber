Feature: Swaglabs scenario

  @S1
  Scenario Outline: Login Page
    Given User is on swagLabs page
    When User login to swaglabs with '<Username>' and '<Password>'
    Then Page with title Swag Labs should be open
    When User click on logout
    Then Page with title Swag Labs should be open

    Examples: 
      | Username                | Password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | problem_user            | secret_sauce |
