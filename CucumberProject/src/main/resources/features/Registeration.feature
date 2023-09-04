Feature: Registration feature
  Background: A user Navigates to registeration page
    Given  A user Navigates to registration URL
    @regression
   Scenario: As a user, I can register with  valid credentials
      When A user inserts valid Data "female" "Sondos" "Nasser" "mahmoudNasser@gmail.com" "1" "1" "2000" "Vois" "27863686" "27863686"
      Then A registration Msg is appeared and his color is green "#4cb17c"
