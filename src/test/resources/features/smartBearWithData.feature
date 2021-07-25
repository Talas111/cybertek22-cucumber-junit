Feature: Smart Bear Order process
  User Story: As  a user I should be able to input different data
  to create order list


  @outline
  Scenario Outline: Smart Bear order process verification

    Given  User is logged into SmartBear Tester account and on Order page

    When User selects "<product>" from product dropdown
    And  User enters "<quantity>" to quantity
    Then  User enters "<customer Name>"to costumer name
    Then User enters "<street>" to street
    Then User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zip>"
    And  User selects "<cardType>" as card type
    And User enters "<card Number>" to card number
    Then User enters "<expiration date>" to expiration date
    Then User clicks process button
    And User verifies "<costumer name>" is in the list


    Examples: All data are provided below:

      | product     | quantity | customer Name   | street      | city        | state | zip   | cardType | card Number  | expiration date | costumer name  |

      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60004 | visa     | 313313133315 | 12/22           | Ken Adams       |
      | FamilyAlbum | 4        | Joey Tribbiani  | State st    | Chicago     | IL    | 60656 | visa     | 123433533336 | 11/22           | Joey Tribbiani  |
      | ScreenSaver | 5        | Rachel Green    | Michigan st | Chicago     | IL    | 60056 | visa     | 335333337234 | 10/22           | Rachel Green    |
      | MyMoney     | 5        | Chandler Bing   | Erie st     | Chicago     | IL    | 60345 | visa     | 433353333825 | 10/22           | Chandler Bing   |
      | FamilyAlbum | 9        | Dr DrakeRamoray | Dale st     | Arl Hgths   | IL    | 60452 | visa     | 532333353345 | 10/22           | Dr DrakeRamoray |
      | ScreenSaver | 10       | Monica Geller   | Euclid ave  | Arl Hgths   | IL    | 60321 | visa     | 833435363732 | 10/22           | Monica Geller   |
      | MyMoney     | 3        | Ross Geller     | River rd    | Des Plaines | IL    | 60435 | visa     | 933533333333 | 12/22           | Ross Geller     |