package inheritancemethods.bankaccount;

public class DebitAccount {

    private String accountNumber;
    private long balance;
    private static final double PERCENT = 3.0;
    private static final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public static double getPERCENT() {
        return PERCENT;
    }

    public static long getMinCost() {
        return MIN_COST;
    }

    public final long costOfTransaction(long amount) {
        long cost = (long) (amount * PERCENT / 100.0);
        if (cost < MIN_COST) {
            cost = MIN_COST;
        }
        return cost;
    }

    public boolean transaction(long amount) {
        boolean success = false;
        long transaction = amount + costOfTransaction(amount);
        if (transaction <= balance){
            balance -= transaction;
            success = true;
        }
        return success;
    }

    public void balanceToZero() {
        this.balance = 0;
    }


}
