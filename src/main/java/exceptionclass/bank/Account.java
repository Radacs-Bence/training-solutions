package exceptionclass.bank;

public class Account {

    public static final double STARTING_MAX_SUBTRACT = 100000.0;

    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null){
            throw new  IllegalArgumentException("Account is null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = STARTING_MAX_SUBTRACT;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public static double getStartingMaxSubtract() {
        return STARTING_MAX_SUBTRACT;
    }

    public void setMaxSubtract(double maxSubtract) {
        amountChecker(maxSubtract);
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double amount) {
        amountChecker(amount);
        if (amount > maxSubtract){
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        if (amount > balance){
            throw new InvalidBankOperationException(ErrorCode.LOW_BALANCE);
        }

        balance -= amount;
        return balance;
    }

    public double deposit(double amount) {
        amountChecker(amount);
        balance += amount;
        return balance;
    }

    private void amountChecker(double amount){
        if (amount <= 0){
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
    }

}
