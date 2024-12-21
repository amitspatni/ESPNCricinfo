Feature: Feature to test hopepage of ESPNCricinfo

  @HomepageTest
  Scenario: Verify user can see Live Scores tab after clicking on Live score link
    Given User is on website
    And User looks for title
    When User clicks on Live Scores
    Then User can see Live Scores tab on the page


