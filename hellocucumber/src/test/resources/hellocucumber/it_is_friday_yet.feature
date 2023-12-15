Feature: It is Friday yet ?
    Scenario: Sunday isn't Friday
        Given today is Sunday
        When I ask if today is Friday
        Then the response is "Nope"

    Scenario Outline: Friday is Friday
        Given today is Friday
        When I ask wether it's Friday yet
        Then I should be told "TGIF"
        Examples:
        | day            | answer |
        | Friday         | TGIF   |
        | Sunday         | Nope   |
        | anything else! | Nope   |