Feature: Credit application
  Scenario: apply for credit
    Given Navigate to Parabank
    When Enter username and password and click login button
    Then User Should Click Request Loan
    When Enter loan and down
    And  Select from account
    Then Click Apply Now
    Then User should logout