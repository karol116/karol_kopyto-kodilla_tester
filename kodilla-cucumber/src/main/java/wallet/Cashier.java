package wallet;

public class Cashier {
    private CashSlot cashslot;

    public Cashier(CashSlot cashSlot) {
        this.cashslot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            wallet.debit(amount);
            cashslot.dispense(amount);
        }
        else System.out.println("withdraw has not been processed ");
    }
}