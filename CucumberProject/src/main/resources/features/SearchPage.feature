Feature: SearchPage feature
  Background: A user Navigates to Search page
    Given  A user Navigates to The Search URL
  @regression
  Scenario Outline: : As a user, I can Find the product after searching successfully
    When A user searching to <productname> successfully
    Then The result of searching contains <keyword>


    Examples:
      |productname|keyword|
      |"laptop"|"laptop"|
      |"book"|"book"|
  @regression
  Scenario Outline: : As a user, I can Find the product by sku after searching successfully
    When A user searching to a product using <skutext> successfully
    Then The result of searching contains that <skukeyword>
    Examples:
      |skutext|skukeyword|
      |"AP_MBP_13"|"AP_MBP_13"|
      |"APPLE_CAM"|"APPLE_CAM"|
      |"SCI_FAITH"|"SCI_FAITH"|
      |"SF_PRO_11"|"SF_PRO_11"|
