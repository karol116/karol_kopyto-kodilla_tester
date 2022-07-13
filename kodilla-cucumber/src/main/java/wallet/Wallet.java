package wallet;

public class Wallet {
    private int sum;

    public Wallet() {
    }

    public void deposit(int money) {
        if (money >= 0)
            sum += money;
        else System.out.println("deposit has not been processed");
    }

    public int getBalance() {
        return sum;
    }

    public void debit(int money) {
        if (getBalance() > 0 && money > 0)
            sum -= money;
    }
}