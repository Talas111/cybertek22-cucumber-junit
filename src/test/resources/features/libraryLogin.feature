Feature: Library Login Functionality
  User story: As a user should be able to log in with valid credentials


  Scenario: Librarian login feature
    Given user is on the home page
    When user enters valid librarian  credentials
    Then user should able to see dashboard



  Scenario: Librarian login feature
    Given user is on the home page
    When user enters valid "userName" and "password" credentials
    Then user should able to see "books"