Feature: Hesap Detaylarına Erişim

  Background:
    Given Navigate to parabank
    When Send keys on the element
      | inputUsername | kobebryant_81 |
      | inputPassword | 12345678      |
    Then Click on the element
      | logInButton |
    And Verify from web element
      | logOutButton |

  Scenario: Hesap Detaylarına Erişim
    When Click on the element
      | accountsOverview |
    Then Verify from account info
    And Click on the element
      | firstAccount |
    Then Verify from account details
    And Click on the element
      | hesapIslemleri |
    Then Check transactions ID