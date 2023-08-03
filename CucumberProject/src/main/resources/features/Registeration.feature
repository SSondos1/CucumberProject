Feature: Registration feature
  Background: A user Navigates to registeration page
    Given  A user Navigates to registration URL
    @regression
   Scenario: As a user, I can register with  valid credentials
      When A user inserts valid Data
      Then A registration Msg is appeared
