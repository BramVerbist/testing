Feature: Login
  As a user
  I want to login
  In order to find my personal data

  Scenario Outline: Frank logs in
    Given Frank is not logged in
    And Frank is on the login page
    And Frank has an account
    When Frank fills in his username: "<username>" and corresponding password: "<password>"
    Then Frank gets logged in

    Examples:
      | username          |
      | Frank             |
      | Frank             |
      | Frank             |
      |                   |
      |                   |
      | Fred              |

    Examples:
      | password          |
      | 123               |
      | 321               |
      |                   |
      | 123               |
      |                   |
      | 123               |