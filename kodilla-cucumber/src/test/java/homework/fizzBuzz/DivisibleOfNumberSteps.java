package homework.fizzBuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DivisibleOfNumberSteps implements En {
    private int number;
    private String message;

    public DivisibleOfNumberSteps() {
        Given("entered number is -12", () -> {
            this.number = -12;
        });
        Given("entered number is 1002675", () -> {
            this.number = 1002675;
        });
        Given("entered number is 0", () -> {
            this.number = 0;
        });
        Given("entered number is 9", () -> {
            this.number = 9;
        });
        Given("entered number is -9675", () -> {
            this.number = -9675;
        });
        Given("entered number is -197867", () -> {
            this.number = -197867;
        });
        Given("entered number is -200", () -> {
            this.number = -200;
        });
        When("I ask is number divisible by 3 or 5", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.message = numberChecker.divideNumberByThreeAndFive(this.number);
        });
        Then("returned message is {string}", (String string) -> {
            Assert.assertEquals(string, this.message);

        });
    }
}