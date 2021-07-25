Feature: Smart Bear order process
  User Story: As a user, I should be able
  to create my account and  order successfully
  and see my name in order list.

@SmartBear
  Scenario: Smart Bear Order list Verification
    Given User is logged into SmartBear Tester account and on Order page
    And User selects "FamilyAlbum" from product dropdown
    And User enters "4" to quantity
    And User enters "JohnWick"to costumer name
    And User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And User enters "60056"
    And User selects "Visa" as card type
    And User enters "1111222233334444" to card number
    And User enters "12/22" to expiration date
    And User clicks process button
    Then User verifies "JohnWick" is in the list