Feature: Item in shopping cart
  As a user
  I want to place an item in my shopping cart
  In order to buy it

  Scenario Outline: a customer moves an item to his shopping cart
    Given the customer is on the "<Item>" page
    When the user moves the "<Item>" to the shopping cart
    Then the "<Item>" is added to his shopping cart

    Examples:
      | Item              |
      | barbiepop Ken     |
      | tesla flametrower |
      | banana split      |


