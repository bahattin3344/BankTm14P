Feature: Money Transfer Check

  Background:
    Given Navigate to parabank
    When Send keys on the element
      | inputUsername | kobebryant_81 |
      | inputPassword | 12345678      |
    Then Click on the element
      | logInButton |
    And Verify from web element
      | logOutButton |

  Scenario: Money Transfer Check
    When Click on the element
      | moneyTransferButton |
    Then Send keys on the element
      | inputAmount | 500 |
    And Select by the web element
      | selectFromAccount | 0 |
      | selectToAccount   | 1 |
    Then Click on the element
      | transferButton |
    And Verify from text
      | successTransfer |
    When Click on the element
      | accountsOverview |
      | firstAccount     |
      | hesapIslemleri   |
    Then Save transactions ID and check
