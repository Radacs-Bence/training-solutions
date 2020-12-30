package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<BankAccount> accountList = new ArrayList<>();

    public void uploadListFromFile(String filePath) {
        List<String> accountLines = null;
        try {
            accountLines = Files.readAllLines(Path.of(filePath));
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
        this.accountList = convertAccountLines(accountLines);
    }

    private List<BankAccount> convertAccountLines(List<String> accountLines) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        for (String line : accountLines) {
            String[] parts = line.split(";");
            bankAccounts.add(new BankAccount(parts[0], parts[1], Double.parseDouble(parts[2])));
        }
        return bankAccounts;
    }

    public void makeTransactions(String filePath) {
        List<String> transactionLines = null;
        try {
            transactionLines = Files.readAllLines(Path.of(filePath));
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
        transactionExecutor(transactionLines);
    }


    private void transactionExecutor(List<String> transactionLines) {
        String[] transactionParts = null;
        for (String line : transactionLines) {
            transactionParts = line.split(";");
            for (BankAccount bankAccount : accountList) {
                if (bankAccount.getAccountNumber().equals(transactionParts[0])) {
                    bankAccount.setBalance(Double.parseDouble(transactionParts[1]));
                }
            }
        }
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }
}
