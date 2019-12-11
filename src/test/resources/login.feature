Feature: Login
  As a user
  I want to login
  In order to find my personal data

  Scenario Outline: a customer logs in
    Given the customer is not logged in
    And the customer is on the login page
    And the customer has an account
    When the user fills in his username: "<username>" and corresponding password: "<password>"
    Then the user gets logged in

    Examples:
      | username          |
      | bestaand          |
      | bestaand          |
      | bestaand          |
      |                   |
      |                   |
      | onbestaand        |

    Examples:
      | password          |
      | 123               |
      | 321               |
      |                   |
      | 123               |
      |                   |
      | maakt niet uit    |