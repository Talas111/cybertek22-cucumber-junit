

Feature: Etsy search feature
  Agile story: search functionality

  Background:
    Given user is on the Etsy landing page




  Scenario: Etsy default verification
    Then user should see Etsy title as expected

# expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


Scenario: Etsy Search Functionality Title Verification
  When user types Wooden spoon in the search bar
  And user clicks to search button
  Then user title is Wooden spoon |Etsy
