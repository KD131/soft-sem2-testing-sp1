Feature: Convert to Roman numeral

  Scenario: Convert 1 to I
    Given I have started the converter
    When I convert 1
    Then I should see I