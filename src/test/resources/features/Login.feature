@login @regression

Feature: WebDriver University - Login page

  Background:
    Given I access the web driver university login page


  Scenario Outline: Validate - successful & unsuccessful Login
    When I enter a username <username>
    And  I enter a password <password>
    And I click on the login button
    Then I should be presented with the following login validation message <loginValidationMessage>

    Examples:
      | username    | password      | loginValidationMessage |
      | webdriver   | webdriver123  | validation succeeded   |
      | dummyName   | dummyPassword | validation failed      |
      | justForTest | 1             | validation failed      |