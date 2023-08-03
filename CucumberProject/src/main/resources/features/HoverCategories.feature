Feature: HoverCategories feature
  Background: A user Navigates to main page
    Given  A user Navigates to Nop commerce URL
  @regression
  Scenario: As a user, i can select a random category
    When A user hover on random category And select random item from this random category
    Then the sub category title is contains what i select