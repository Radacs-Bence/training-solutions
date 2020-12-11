package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount {

    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public boolean transaction(long amount) {
        boolean success = false;
        long transaction = amount + costOfTransaction(amount);
        if (transaction <= getBalance()) {
            super.transaction(amount);
            success = true;
        } else if(transaction < getBalance() + overdraftLimit){
            overdraftLimit += getBalance() - amount - costOfTransaction(amount);
            balanceToZero();
            success = true;
        }
        return success;
    }
}
