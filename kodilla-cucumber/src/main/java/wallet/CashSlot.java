package wallet;

public class CashSlot {
    private int contests;

    public int getContests() {
        return contests;
    }

    public void dispense(int amount){
        this.contests = amount;
    }
}