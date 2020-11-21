package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecisionMaker {

    public boolean containsCreditEntryGreaterThan (List<Transaction> transactions, LocalDateTime startTime, LocalDateTime endTime, int amount){
        boolean contains = false;
        for (Transaction transaction: transactions) {
            if (transaction.isDebit() && transaction.getDateOfTransaction().isAfter(startTime) && transaction.getDateOfTransaction().isBefore(endTime) && transaction.getAmount() > amount){
                contains = true;
            }
        }
        return contains;
    }

}
