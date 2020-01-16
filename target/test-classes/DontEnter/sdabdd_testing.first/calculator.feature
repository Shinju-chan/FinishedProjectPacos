Feature: calculator
  Scenario: Adding two nambers
    Given I have a calculator
    Then I add 1 and 2
    When I should get 3

    Scenario: Divide two nambers
      Given I have a calculator
      Then I dive 10 by 5
      When I should get 2

      Scenario: Increase two nambers
        Given I have a calculator
        Then I incred 2 and 5
        When I should get 10