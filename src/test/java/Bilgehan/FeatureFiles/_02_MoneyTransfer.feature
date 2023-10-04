Feature: Money Transfer From account to account

  Scenario: Money Transfer
    Given Navigate to parabank
    When Send keys on the element
      | inputUsername | raptors81@mail.com |
      | inputPassword | 12345678          |
    Then Click on the element
      | logInButton |
    And Verify from web element
      | logOutButton |
    Then Click on the element
      | moneyTransferButton |
    And Send keys on the element
      | inputAmount | 500 |
    Then Select by the web element
      | selectFromAccount | 0 |
      | selectToAccount   | 1 |
    And Click on the element
      | transferButton |
