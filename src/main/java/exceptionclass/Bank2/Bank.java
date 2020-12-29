package exceptionclass.Bank2;

import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Accounts is null");
        }
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void payment(String accountNumber, double amount) throws InvalidBankOperationException {
        accountFinder(accountNumber).subtract(amount);
    }

    public void deposit(String accountNumber, double amount) throws InvalidBankOperationException {
        accountFinder(accountNumber).deposit(amount);
    }

    private Account accountFinder(String accountNumber) throws InvalidBankOperationException {
        Account found = null;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                found = account;
            }
        }
        if (found == null){
            throw new InvalidAccountNumberBankOperationException();
        }
        return found;
    }
}
