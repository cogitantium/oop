public class bankAccount {
    private int balance;
    private double rateSavings;
    private double rateBorrow;


    public bankAccount(int balance, double rateSavings, double rateBorrow) {
        this.balance = balance;
        this.rateSavings = rateSavings;
        this.rateBorrow = rateBorrow;
    }

    boolean deposit(int amount) {
        if (amount > 0 && (amount + this.balance) <= 250000) {
            this.balance += amount;
            return true;
        }
        return false;
    }
}
