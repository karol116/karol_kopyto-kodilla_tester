package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank;
    CashMachine aATM, bATM, cATM;

    @BeforeEach
    public void setUp() {

        aATM = new CashMachine();
        bATM = new CashMachine();
        cATM = new CashMachine();
        bank = new Bank();
    }

    //Test typical cases:
    @Test
    public void shouldHaveZeroLength() {
        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(0, cashMachines.length);
    }

    @Test
    public void shouldAddThreeElementsToArray() {
        bank.addCashMachine(aATM);
        bank.addCashMachine(bATM);
        bank.addCashMachine(cATM);

        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(3, bank.getNumberOfCashMachines());
        assertEquals(aATM, cashMachines[0]);
        assertEquals(bATM, cashMachines[1]);
        assertEquals(cATM, cashMachines[2]);
    }

    @Test
    public void shouldReturnCorrectValueOfCashMachinesSumNumber() {
        bank.addCashMachine(aATM);
        bank.addCashMachine(bATM);
        bank.addCashMachine(cATM);

        assertEquals(3, bank.getNumberOfCashMachines());
    }

    @Test
    public void shouldReturnCorrectCashMachine() {

        bank.addCashMachine(aATM);
        assertEquals(aATM, bank.getCashMachine());
    }

    @Test
    public void shouldIncreaseCashMachinesArraySizeByOneWhenCashMachineIsAdded() {
        bank.addCashMachine(aATM);
        assertEquals(1, bank.getNumberOfCashMachines());
    }

    @Test
    public void shouldCorrectCalculateAllCashMachinesBalance() {

        aATM.addTransaction(200);
        aATM.addTransaction(-5200);
        aATM.addTransaction(3200);
        aATM.addTransaction(-4200);
        aATM.addTransaction(0);
        aATM.addTransaction(200);
        aATM.addTransaction(2200);
        aATM.addTransaction(200);
        aATM.addTransaction(3200);

        bATM.addTransaction(433);
        bATM.addTransaction(600);
        bATM.addTransaction(-344);
        bATM.addTransaction(-5000);
        bATM.addTransaction(-44);

        cATM.addTransaction(900);
        cATM.addTransaction(-788);
        cATM.addTransaction(-9);
        cATM.addTransaction(5000);

        bank.addCashMachine(aATM);
        bank.addCashMachine(bATM);
        bank.addCashMachine(cATM);

        assertEquals(548, bank.getAllCashMachinesBalance());
    }

    @Test
    public void shouldReturnCorrectNumberOfWithdrawals() {
        aATM.addTransaction(-408);
        bATM.addTransaction(-540);
        cATM.addTransaction(-20);

        bank.addCashMachine(aATM);
        bank.addCashMachine(bATM);
        bank.addCashMachine(cATM);
        assertEquals(3, bank.getAllCashMachinesNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnCorrectNumberOfPayments() {


        aATM.addTransaction(40);
        bATM.addTransaction(540);
        cATM.addTransaction(20);

        bank.addCashMachine(aATM);
        bank.addCashMachine(bATM);
        bank.addCashMachine(cATM);
        assertEquals(3, bank.getAllCashMachinesNumberOfPayments());
    }

    @Test
    public void shouldReturnAverageValueOfWithdrawal() {

        double average = (-540 - 40 + -20) / 3.0;

        bATM.addTransaction(-540);
        aATM.addTransaction(-40);
        cATM.addTransaction(-20);

        bank.addCashMachine(aATM);
        bank.addCashMachine(bATM);
        bank.addCashMachine(cATM);

        assertEquals(average, bank.getAllCashMachinesAverageWithdrawals(), 0.01);
    }

    @Test
    public void shouldReturnAverageValueOfPayment() {

        double average = (405 + 205 + 5460) / 3.0;

        aATM.addTransaction(405);
        cATM.addTransaction(205);
        bATM.addTransaction(5460);

        bank.addCashMachine(aATM);
        bank.addCashMachine(bATM);
        bank.addCashMachine(cATM);

        assertEquals(average, bank.getAllCashMachinesAveragePayments(), 0.01);
    }
}