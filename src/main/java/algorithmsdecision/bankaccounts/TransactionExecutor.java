package algorithmsdecision.bankaccounts;

import java.util.List;

public class TransactionExecutor {

    public void executeTransactions( List<Transaction> transactions, List<BankAccount> bankAccounts){
        for (BankAccount bankAccount: bankAccounts) {
            for (Transaction transaction: transactions) {
                if (transaction.getAccountNumber().equals(bankAccount.getAccountNumber())){
                    if (transaction.isCredit()){
                        bankAccount.deposit(transaction.getAmount());
                        transaction.setStatus(TransactionStatus.SUCCEEDED);
                    }
                    if (transaction.isDebit()){
                        if (bankAccount.withdraw(transaction.getAmount())) {
                            transaction.setStatus(TransactionStatus.SUCCEEDED);
                        } else {
                            transaction.setStatus(TransactionStatus.PENDING);
                        }
                    }

                }
            }
        }
    }

}
