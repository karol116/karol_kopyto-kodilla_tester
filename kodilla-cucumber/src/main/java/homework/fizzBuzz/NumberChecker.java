package homework.fizzBuzz;

import java.lang.invoke.SwitchPoint;

public class NumberChecker {
    public String divideNumberByThreeAndFive (int number) {
         if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else return "None";
    }
}
