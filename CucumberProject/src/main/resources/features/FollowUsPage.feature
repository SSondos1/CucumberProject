Feature: FollowUs feature
  Background: A user Navigates to page
   Given  A user Navigates to  URL
  @regression
 Scenario: As a user, i can handel between facebook and nopcommerce Url
    When A user click to facebook follow us links
    Then the current facebook Url like "https://www.facebook.com/nopCommerce"
  @regression
  Scenario: As a user, i can handel between twitter and nopcommerce Url
    When A user click to twitter follow us links
    Then the current twitter Url like "https://twitter.com/nopCommerce"
  @regression
  Scenario: As a user, i can handel between news and nopcommerce Url
    When A user click to news follow us links
    Then the current news Url like "https://demo.nopcommerce.com/new-online-store-is-open"
  @regression
  Scenario: As a user, i can handel between youtube and nopcommerce Url
    When A user click to youtube follow us links
    Then the current youtube Url like "https://www.youtube.com/user/nopCommerce"


