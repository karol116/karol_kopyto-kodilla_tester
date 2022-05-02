package com.kodilla.bank.homework;

public class App {
    public static void main(String[] args) {

        CashMachine aATM = new CashMachine();
        CashMachine bATM = new CashMachine();
        CashMachine cATM = new CashMachine();

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

        System.out.println(aATM.getAveragePayment());

        Bank bank = new Bank();
        bank.addCashMachine(aATM);
        bank.addCashMachine(bATM);
        bank.addCashMachine(cATM);

        System.out.println(bank.getAllCashMachinesBalance());


    }
}
