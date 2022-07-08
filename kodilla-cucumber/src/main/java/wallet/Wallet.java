package wallet;

public class Wallet {
    private int sum;

    public Wallet() {
    }

    public void deposit(int money) {
        sum += money;
    }

    public int getBalance() {
        return sum;
    }
}