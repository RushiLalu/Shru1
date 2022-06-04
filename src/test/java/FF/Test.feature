Feature: Reset functionality on login page of Application

  @Open
  Scenario Outline: Verification of Reset button
    Given Open the "url" and launch the application
    When Enter the "<Username>" and "<Password>"
    Then Click Login button

    Examples:
      | Username | Password |
      | Rushi    | 123      |
      | Shruti   | 456      |
      | Mumma    | 789      |
