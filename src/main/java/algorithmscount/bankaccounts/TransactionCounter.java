package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int amount){
        int counter = 0;
        for (Transaction transaction: transactions) {
            if (transaction.getAmount() < amount){
                counter++;
            }
        }
        return counter;
    }

}
