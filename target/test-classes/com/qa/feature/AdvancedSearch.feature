Feature: Ebay advanced search page

  @T21
  Scenario: ebay logo on advanced search page
    Given I am on ebay advanced search page
    When I click on logo
    Then I  am navigate to ebay home page

	@T22
  Scenario: Advance search item
    Given I am on ebay advanced search page
    When I advanced search an item
      | keyword    | exclude | min | max  |
      | headphones | wired   | 500 | 1500 |
