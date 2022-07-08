package wallet;

public class Cashier {
    private CashSlot cashslot;

    public Cashier (CashSlot cashSlot) {
        this.cashslot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount){
        cashslot.dispense(amount);
    }
}