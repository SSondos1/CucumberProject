Feature: Sliders feature
  Background: A user Navigates to nopcommerce page
    Given  A user Navigates to nopcommerce URL
  @regression
  Scenario: First Slider is Clickable on homepage
    When A user open Nokia Slider Url
    Then the expected nokia Url like "https://demo.nopcommerce.com/nokia-lumia-1020"
  @regression
  Scenario: second Slider is Clickable on homepage
    When A user open IPhone Slider Url
    Then the expected iphone  Url like "https://demo.nopcommerce.com/iphone-6"