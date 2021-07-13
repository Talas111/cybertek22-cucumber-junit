
@regression @smoke
Feature: Library app Login future
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.  And dashboard should be displayed.
  Accounts are: librarian, student, admin


  # this is how we comment in feature files



@Librarian @employee
  Scenario: Login as Librarian
    Given user is on Login page
    When user  enters valid Librarian username
    And user  enters valid Librarian password
    Then  user  should see the  Dashboard

  @student
    Scenario: Login as a Student
      Given  user is on Login page
      When user enters student username
      And user enters student password
    Then user  should see the  Dashboard
@admin @employee
  Scenario: Login as a admin
    Given  user is on Login page
    When user enters admin username
    And user enters admin password
    Then user  should see the  Dashboard


