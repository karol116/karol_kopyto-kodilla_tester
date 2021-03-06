package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine;

    @BeforeEach
    public void setUp() {
        cashMachine = new CashMachine();
    }

    //Test typical cases:
    @Test
    public void shouldHaveZeroLength() {
        int[] completedTransactions = cashMachine.getValuesOfTransactions();
        assertEquals(0, completedTransactions.length);
    }

    @Test
    public void shouldAddThreeElementsToArray() {
        cashMachine.addTransaction(3400);
        cashMachine.addTransaction(2100);
        cashMachine.addTransaction(-1600);

        int[] completedTransactions = cashMachine.getValuesOfTransactions();
        assertEquals(3, completedTransactions.length);
        assertEquals(3400, completedTransactions[0]);
        assertEquals(2100, completedTransactions[1]);
        assertEquals(-1600, completedTransactions[2]);
    }

    @Test
    public void shouldReturnCorrectValueOfTransactionNumber() {
        cashMachine.addTransaction(-532);
        cashMachine.addTransaction(5432);
        cashMachine.addTransaction(-2);
        cashMachine.addTransaction(33332);
        assertEquals(4, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldReturnCorrectValueOfTransaction() {
        cashMachine.addTransaction(6000);
        assertEquals(6000, cashMachine.getValueOfTransaction());
    }

    @Test
    public void shouldIncreaseArraySizeByOneWhenTransactionIsAdded() {
        cashMachine.addTransaction(400);
        assertEquals(1, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldCalculateAverageWithdrawals() {
        cashMachine.addTransaction(-40);
        cashMachine.addTransaction(-540);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-430);

        assertEquals(-257.5, cashMachine.getAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldCalculateAveragePayments() {
        cashMachine.addTransaction(40);
        cashMachine.addTransaction(540);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(430);

        assertEquals(257.5, cashMachine.getAveragePayment(), 0.01);
    }

    @Test
    public void shouldReturnCorrectCashMachineBalance() {
        int sum = -40 - 540 + 20 + 430;

        cashMachine.addTransaction(-40);
        cashMachine.addTransaction(-540);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(430);

        assertEquals(sum, cashMachine.getCashMachineBalance());
    }

    //Test edge cases:
    @Test
    public void shouldNotAddedZeroTransactionToArray() {
        int a = cashMachine.getNumberOfTransactions();
        cashMachine.addTransaction(0);
        int b = cashMachine.getNumberOfTransactions();
        assertEquals(a, b);
    }
}