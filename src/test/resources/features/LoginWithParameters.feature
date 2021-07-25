Feature: Login with Parameters

  @librarian
  Scenario: Librarian login feature
    Given user is on the home page
    When user enters valid "userName" and "password" credentials
    Then user should able to see "dashboard"
    Then user sees "5572"  "users"


  Scenario: Student login feature
    Given user is on the home page
    When user enters valid "userName" and "password" credentials
    Then user should able to see "books"