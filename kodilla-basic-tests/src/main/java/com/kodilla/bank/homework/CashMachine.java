package com.kodilla.bank.homework;

public class CashMachine {
    private double[]  completedTransaction = new double[] {1220, 4324, -4333, 2333, -3000, -302, 4300, 9000, 221, -50};
    private double numberOfElements = completedTransaction.length;

    private double[] getCashMachineBalance(){
        return completedTransaction;
    }

    private double numberOfTransaction(){
        return numberOfElements;
    }
}