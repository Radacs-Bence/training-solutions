package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> bankAccounts, int amount){
        boolean contains = false;
        for (BankAccount account: bankAccounts) {
            if (account.getBalance() > amount){
                contains = true;
            }
        }
        return contains;
    }

}
