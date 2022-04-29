package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.numberOfCashMachines = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.numberOfCashMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfCashMachines];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.numberOfCashMachines - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public int getAllCashMachinesBalance() {
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += cashMachines[i].getCashMachineBalance();
        }
        return sum;
    }

    public int getAllCashMachinesNumberOfWithdrawals() {
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += cashMachines[i].getNumberOfWithdrawals();
        }
        return sum;
    }

    public int getAllCashMachinesNumberOfPayments() {
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += cashMachines[i].getNumberOfPayments();
        }
        return sum;
    }

    public int getAllCashMachinesAverageWithdrawals() {
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += cashMachines[i].getAverageWithdrawal();
        }
        return sum/this.cashMachines.length;
    }
    public int getAllCashMachinesAveragePayments() {
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += cashMachines[i].getAveragePayment();
        }
        return sum/this.cashMachines.length;
    }
}