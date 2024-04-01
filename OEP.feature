Feature: OddEvenPrime Game Play

Scenario: Play the OEP to get ODDPRIME
    Given Create an OEP Game Play object
    When I Play the Game with number 3
    Then The result is ODD and PRIME

Scenario: Play the OEP to Even
    Given Create an OEP Game Play object
    When I Play the Game with number 4 
    Then The result is EVEN

Scenario: Play the OEP to ODD
    Given Create an OEP Game Play object
    When I Play the Game with number 15
    Then The result is ODD
