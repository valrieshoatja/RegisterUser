Feature: Home Page Navigation

  Scenario: Navigate to Login page from Learning Materials
    Given User launches the application
    When User clicks Learn dropdown
    And User clicks Learning Materials
    Then Login page should be displayed