package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int amount){
        int counter = 0;
        for (BankAccount bankAccount:bankAccounts) {
            if (bankAccount.getBalance() > amount){
                counter++;
            }
        }
        return counter;
    }

}
