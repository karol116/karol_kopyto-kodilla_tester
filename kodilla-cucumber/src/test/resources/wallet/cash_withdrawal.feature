Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <deposit> in my wallet
    When I request <withdrawal>
    Then <dispensed> should be dispensed
    Examples:
      | deposit | withdrawal | dispensed |
      | $200    | $30        | $30       |
      | $0      | $120       | $0        |
      | $0      | $0         | $0        |
      | -$200   | $2000      | $0        |
      | $1200   | $2000      | $0        |
      | $10     | $10        | $10       |
      | $600    | -$300      | $0        |

