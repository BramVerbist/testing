Feature: Item search
  As a user
  I want to search for an item
  In order to find it

  Scenario Outline: Frank searches a specific item and gets the corresponding item
    Given Frank is on the search page
    When the user searcher for "<searchTerm>"
    Then the user gets to see the item "<searchTerm>"

    Examples:
      | searchTerm        |
      | barbiepop Ken     |
      | tesla flametrower |
      | banana split      |

  #Wat als element niet beschikbaar is?