package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });
        Given("I have deposited $0 in my wallet", () -> {
            wallet.deposit(0);
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });
        Given("I have deposited -$200 in my wallet", () -> {
            wallet.deposit(-200);
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });
        Given("I have deposited $1200 in my wallet", () -> {
            wallet.deposit(1200);
            Assert.assertEquals("Incorrect wallet balance", 1200, wallet.getBalance());
        });
        Given("I have deposited $10 in my wallet", () -> {
            wallet.deposit(10);
            Assert.assertEquals("Incorrect wallet balance", 10, wallet.getBalance());
        });
        Given("I have deposited $600 in my wallet", () -> {
            wallet.deposit(600);
            Assert.assertEquals("Incorrect wallet balance", 600, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        When("I request $120", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 120);
        });
        When("I request $0", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 0);
        });
        When("I request $2000", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 2000);
        });
        When("I request $10", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 10);
        });
        When("I request -$300", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, -300);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContests());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContests());
        });
        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });

        Then("the balance of my wallet should be -$200", () -> {
            Assert.assertEquals("Incorrect wallet balance", -200, wallet.getBalance());
        });

        Then("the balance of my wallet should be $1200", () -> {
            Assert.assertEquals("Incorrect wallet balance", 1200, wallet.getBalance());
        });


        Then("$10 should be dispensed", () -> {
            Assert.assertEquals(10, cashSlot.getContests());
        });

        Then("the balance of my wallet should be $600", () -> {
            Assert.assertEquals("Incorrect wallet balance", 600, wallet.getBalance());
        });
    }
}