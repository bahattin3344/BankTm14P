Feature: Login functionality

  @SmokeTest
  Scenario: Login with valid username and password

    Given Navigate to Parabank
    When Enter username and password and click login button
    Then User should logout