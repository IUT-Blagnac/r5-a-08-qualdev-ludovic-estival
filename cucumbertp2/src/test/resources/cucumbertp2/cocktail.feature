Feature: Cocktail ordering
As Romeo, I want to offer a drink to Juliette so that we can discuss together

Scenario: Creating an empty order
    Given "Romeo" who wants to buy a drink
    When an order is declared for "Juliette"
    Then there is 0 cocktail in the order