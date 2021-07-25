Feature: Examples of Cucumber data table implementation

  @wip
  Scenario: Something happens
    #Given user does some stuff
    Then user should see below words displayed
      | Apple      |
      | Kiwi       |
      | Orange     |
      | Strawberry |
      | Mango      |
      | Tomato     |
  # TO FIX PIPES' ORDER
    #COMMAND + OPTION + L



  Scenario: Library login example using data table
    Given user is on the login page of library app
    When  user enters username and password as below
      | username | librarian48@library |
      | password | LB8QnOmU            |
    Then user should see title is Library

#comand optioin l to make nice ooking
  @datatable
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |