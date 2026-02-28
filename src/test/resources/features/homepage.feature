Feature: Home Page Navigation

  Scenario: Positive - Navigate to Login page
    Given User launches the application
    When User clicks Learn dropdown
    And User clicks Learning Materials
    Then Login page should be displayed

  Scenario: Negative - Learning Materials should not be visible without dropdown click
    Given User launches the application
    Then Learning Materials should not be visible