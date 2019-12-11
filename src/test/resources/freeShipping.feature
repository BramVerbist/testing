Feature: Free shipping above 20
  As a seller
  I want to give free shipping for orders above 20 Euros
  In order attract customers

  Background:
    Given the customer is on the checkout

  Scenario: a customer buys items with a subtotal equal to or higher than 20 euros
    When the customer pays for the items
    Then the shipping is free

  Scenario: a customer buys items with a subtotal less than 20 euros
    When the customer pays for the items
    Then the shipping is not free
