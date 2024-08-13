Feature: Ebay home page scenario

  @T1
  Scenario Outline: Advanced search link
    Given I am on ebay home page
    When I click on '<Link>'
    Then I validate the page navigate to '<Url>'

    Examples: 
      | Link     | Url                                    |
      | Advanced | https://www.ebay.com/sch/ebayadvsearch |

  @T2_Parameter
  Scenario: Search an item
    Given I am on ebay home page
    When I search for 'Adidas shoes'
    Then I validate atleast 10000 search item present

  @T3_Parameter
  Scenario: Search an item
    Given I am on ebay home page
    When I search for 'sony headphones'
    Then I validate atleast 100 search item is present

  @T11_DataTable
  Scenario Outline: Home page links
    Given I am on ebay home page
    When I click on '<Link>'
    Then I validate the page navigate to '<Url>' and title contain '<Title>'

    Examples: 
      | Link            | Url                                                   | Title                    |
      | Electronics     | https://www.ebay.com/b/Electronics/bn_7000259124      | Electronics              |
      | Fashion         | https://www.ebay.com/b/Fashion/bn_7000259856          | Fashion products         |
      | Health & Beauty | https://www.ebay.com/b/Health-Beauty/26395/bn_1865479 | Health & Beauty products |
