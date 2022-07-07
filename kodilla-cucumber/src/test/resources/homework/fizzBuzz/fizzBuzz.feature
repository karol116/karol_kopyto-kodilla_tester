Feature: FizzBuzz
  Is number divisible by 3 and/or 5

  Scenario Outline: Number is divisible by 3 and/or 5, or not
    Given entered number is <number>
    When I ask is number divisible by 3 or 5
    Then returned message is <message>
    Examples:
      | number  | message    |
      | -12     | "Fizz"     |
      | 1002675 | "FizzBuzz" |
      | 0       | "FizzBuzz" |
      | 9       | "Fizz"     |
      | -9675   | "FizzBuzz" |
      | -197867 | "None"     |
      | -200    | "Buzz"     |
