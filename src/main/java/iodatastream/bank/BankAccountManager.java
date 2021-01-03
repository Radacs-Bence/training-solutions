package iodatastream.bank;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {

    public void saveAccount(BankAccount account, Path folder) {
        Path file = folder.resolve(account.getAccountNumber() + ".dat");
        try (DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))) {
            outputStream.writeUTF(account.getAccountNumber());
            outputStream.writeUTF(account.getOwner());
            outputStream.writeDouble(account.getBalance());
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write", ioException);
        }
    }

    public BankAccount loadAccount(InputStream inputStream) {
        BankAccount bankAccount = null;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream))) {
            String accountNumber = dataInputStream.readUTF();
            String owner = dataInputStream.readUTF();
            double balance = dataInputStream.readDouble();
            bankAccount = new BankAccount(accountNumber, owner, balance);
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read", ioException);
        }
        return bankAccount;
    }

}
