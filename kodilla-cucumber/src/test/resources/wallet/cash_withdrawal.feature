Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <deposit> in my wallet
    When I request <withdrawal>
    Then <dispensed> should be dispensed
    And the balance of my wallet should be <balance>
    Examples:
      | deposit | withdrawal | dispensed | balance |
      | $200    | $30        | $30       | $170    |
      | $0      | $120       | $0        | $0      |
      | $0      | $0         | $0        | $0      |
      | -$200   | $2000      | $0        | $0      |
      | $1200   | $2000      | $0        | $1200   |
      | $10     | $10        | $10       | $0      |
      | $600    | -$300      | $0        | $600    |