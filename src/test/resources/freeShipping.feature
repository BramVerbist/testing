Feature: Free shipping above 20
  As a seller
  I want to give free shipping for orders above 20 Euros
  In order attract customers

  Background:
    Given Frank is on the checkout

  Scenario: Frank buys items with a subtotal equal to or higher than 20 euros
    And the subtotal of the items is equal to or higher than 20 euro
    When Frank pays for the items
    Then the shipping is free

  Scenario: Frank buys items with a subtotal less than 20 euros
    And the subtotal of the items is less than 20 euro
    When Frank pays for the items
    Then the shipping is not free
