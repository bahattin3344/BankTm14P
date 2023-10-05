Feature: Pay Bill

  Background:
    Given Navigate to parabank
    When Send keys on the element
      | inputUsername | lakers14@mail.com |
      | inputPassword | 12345678          |
    Then Click on the element
      | logInButton |
    And Verify from web element
      | logOutButton |

  Scenario: Pay Bill to parabank
    When Click on the element
      | billPayButton |
    Then Send keys on the element
      | inputPayeeName     | Mepas Elektrik Dagitim A.S. |
      | inputPayeeAddress  | Meram                       |
      | inputPayeeCity     | Konya                       |
      | inputPayeeState    | Turkey                      |
      | inputPayeeZipCode  | 42100                       |
      | inputPayeeNumber   | 01231231234                 |
      | inputPayeeAccount  | 13455                       |
      | inputVerifyAccount | 13455                       |
      | inputBillAmount    | 150                         |
    And Click on the element
      | sendPaymentButton |
    Then Verify from text
      | successfullBill |

