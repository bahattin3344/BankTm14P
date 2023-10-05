Feature: New Bank Account
  Scenario: Register New Bank Account
    Given Navigate to Parabank
    When Enter username and password and click login button
    Then Click Open New Account
    And  Select Checking
    Then Click Succes Button
    Then Success message should be displayed Account
