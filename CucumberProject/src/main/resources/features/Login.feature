
Feature: Login feature

   @regression
   Scenario: As a user, I can Login with valid credentials
      Given A user registered successfully for this  valid Data "female" "Sondos" "Nasser" "mahmoudNnn@gmail.com" "1" "1" "2000" "Vois" "27863686" "27863686"
      When A user registered successfully for this valid "mahmoudNnn@gmail.com" and valid "27863686"
      Then The URL is true and My account tab is displayed
   @regression
   Scenario: As a user, I can Login with invalid credentials
      Given A user registered successfully for this invalid scenario "female" "Sondos" "Nasser" "mahmoudN11m@gmail.com" "1" "1" "2000" "Vois" "27863686" "27863686"
      When A user inserts valid "mahmoudN11m@gmail.com" and invalid "12345678" after registration
      Then An error Message is displayed and his color is red "#e4434b"


