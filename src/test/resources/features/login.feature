
@login
Feature: Library app Login future
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.  And dashboard should be displayed.
  Accounts are: librarian, student, admin


  # this is how we comment in feature files

Background: Assuming user is on the login page
   I CAN WRITE MORE DETAIL HERE UNTIL I USE KEYWORD
  YOU NEED TO GIVE A KEY WORD SO IT WILL READ AS A STEP
  Given  user is on Login page
 @employee
  Scenario: Login as Librarian
    When user  enters valid Librarian username
    And user  enters valid Librarian password
    Then  user  should see the  Dashboard

  @student
    Scenario: Login as a Student
      When user enters student username
      And user enters student password
    Then user  should see the  Dashboard
@admin @employee
  Scenario: Login as a admin
    When user enters admin username
    And user enters admin password
    Then user  should see the  Dashboard


