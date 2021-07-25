Feature: Wikipedia Search functionality
  As a user, I should be able to search terms and relevant information
  Case: Search for Steve Jobs, the title, the header,
  and the image header should be displayed as "Steve Jobs


  Scenario: Wikipedia Search Functionality Title verification
    Given  user is on Wikipedia Home page
    When user types "Elon Musk" in the wiki search box
    When User clicks wiki search button
    Then user sees "Elon Musk" is in the wiki title


  Scenario: Wikipedia Search Functionality Header verification
    Given  user is on Wikipedia Home page
    When user types "Steve Jobs" in the wiki search box
    When User clicks wiki search button
    Then user sees "Steve Jobs" is in the main header

@ScenarioOutline
  Scenario Outline: Wikipedia Search Functionality Header verification
    Given  user is on Wikipedia Home page
    When user types "<searchValue>" in the wiki search box
    When User clicks wiki search button
    Then user sees "<expectedMainHeader>" is in the main header
    Then user sees "<expectedTitle>" is in the wiki title




    Examples: search terms we are going to use in this template is as below
      | searchValue      | expectedMainHeader | expectedTitle    |
      | Steve Jobs       | Steve Jobs         | Steve Jobs       |
      | Albert Einstein  | Albert Einstein    | Albert Einstein  |
      | Nikola Tesla     | Nikola Tesla       | Nikola Tesla     |
      | Conor McGregor   | Conor McGregor     | Conor McGregor   |
      | Chuck Norris     | Chuck Norris       | Chuck Norris     |
      | Marie Curie      | Marie Curie        | Marie Curie      |
      | Natalie Dormer   | Natalie Dormer     | Natalie Dormer   |
      #| Ibrahim Tatlijses | Ibrahim Tatlijses   | Ibrahim Tatlijses |

