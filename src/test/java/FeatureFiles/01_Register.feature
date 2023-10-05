Feature: Register

  Scenario: Register
    Given Navigate to parabank
    When Click on the element
      | register |
    Then Send keys on the element
      | inputFirstName   | Kobe          |
      | inputLastName    | Bryant        |
      | inputAddress     | Beverly Hills |
      | inputCity        | Los Angeles   |
      | inputState       | California    |
      | inputZipCode     | 65245         |
      | inputPhoneNumber | 08248248248   |
      | inputSSN         | 652455845     |
      | inputUsername2   | kobebryant_08 |
      | inputPassword2   | 12345678      |
      | inputConfirm     | 12345678      |
    And Click on the element
      | registerButton |