Feature: Update Contact Info
  Scenario: Update Contact Info With New Name
    Given Navigate to Parabank
    When Enter username and password and click login button
    Then User Should Click Contact Info
    When Enter new first name and click update profile
    Then Success message should be displayed
    Then User should logout