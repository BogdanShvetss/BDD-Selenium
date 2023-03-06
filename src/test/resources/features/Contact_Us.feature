@contact-us @regression

Feature: WebDriver University - Contact Us Page

  Background:
    Given I access the web driver university contact us page


  @Ignore
  Scenario: Validate successful submission - unique data
    When I enter a unique first name
    And i enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message

  Scenario: Validate successful submission - Specific data
    When I enter a specific first name John
    And I enter a specific last name Cena
    And  I enter a specific email address attitudeadjustment@gmail.com
    And  I enter a specific comment "You can't see me!"
    And I click on the submit button
    Then I should be presented with a successful contact us submission message