
Feature: Login feature

   @regression
   Scenario: As a user, I can Login with valid credentials
      Given A user registered successfully for this  valid scenario
      When A user registered successfully for this valid scenario
      Then The URL is true and My account tab is displayed
   @regression
   Scenario: As a user, I can Login with invalid credentials
      Given A user registered successfully for this in valid scenario
      When A user inserts valid user name and in valid password after registration
      Then An error Message is displayed and his color is red


