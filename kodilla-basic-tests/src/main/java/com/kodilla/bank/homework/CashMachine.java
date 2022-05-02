package com.kodilla.bank.homework;

public class CashMachine {
    private int[] completedTransactions;
    private int numberOfTransactions;

    public CashMachine() {
        this.numberOfTransactions = 0;
        this.completedTransactions = new int[0];
    }

    public void addTransaction(int completedTransaction) {
        if (completedTransaction != 0) {
            this.numberOfTransactions++;
            int[] newTab = new int[this.numberOfTransactions];
            System.arraycopy(completedTransactions, 0, newTab, 0, completedTransactions.length);
            newTab[this.numberOfTransactions - 1] = completedTransaction;
            this.completedTransactions = newTab;
        } else {
            System.out.println("Transaction not added. Enter the correct value ");
        }
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public int getValueOfTransaction() {
        int i = completedTransactions.length - 1;
        return completedTransactions[i];
    }

    public int[] getValuesOfTransactions() {
        return completedTransactions;
    }

    public int getCashMachineBalance() {
        int sum = 0;
        for (int i = 0; i < this.completedTransactions.length; i++) {
            sum += completedTransactions[i];
        }
        return sum;
    }

    public int getNumberOfWithdrawals() {
        int sum = 0;
        for (int i = 0; i < this.completedTransactions.length; i++) {
            if (completedTransactions[i] > 0) {
                continue;
            }
            sum++;
        }
        return sum;
    }

    public int getNumberOfPayments() {
        int sum = 0;
        for (int i = 0; i < this.completedTransactions.length; i++) {
            if (completedTransactions[i] < 0) {
                continue;
            }
            sum++;
        }
        return sum;
    }

    public double getAveragePayment() {
        double sum = 0;
        for (int i = 0; i < this.completedTransactions.length; i++) {
            if (completedTransactions[i] < 0) {
                continue;
            }
            sum += completedTransactions[i];
        }
        return sum / this.numberOfTransactions;
    }

    public double getAverageWithdrawal() {
        double sum = 0;
        for (int i = 0; i < this.completedTransactions.length; i++) {
            if (completedTransactions[i] > 0) {
                continue;
            }
            sum += completedTransactions[i];
        }
        return sum / this.numberOfTransactions;
    }
}