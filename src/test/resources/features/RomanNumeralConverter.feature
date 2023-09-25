Feature: Convert to Roman numeral

  Scenario: Convert 1 to I
    Given I have started the converter
    When I convert 1
    Then I should see "I"

  Scenario: Convert 5 to V
    Given I have started the converter
    When I convert 5
    Then I should see "V"

  Scenario Outline: Convert Arabic to Roman
    Given I have started the converter
    When I convert <arabic>
    Then I should see <roman>
    Examples:
      | arabic | roman     |
      | 1      | "I"       |
      | 5      | "V"       |
      | 10     | "X"       |
      | 35     | "XXXV"    |
      | 996    | "CMXCVI"  |
      | 1999   | "MCMXCIX" |
      | 2008   | "MMVIII"  |