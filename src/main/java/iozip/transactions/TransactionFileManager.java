package iozip.transactions;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {

    public void saveTransactions(Path file, List<Transaction> transactions) {
        try (ZipOutputStream outputStream = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))) {
            for (Transaction transaction : transactions) {
                outputStream.putNextEntry(new ZipEntry(String.valueOf(transaction.getId())));
                outputStream.write((transaction.getTime() + "\n" + transaction.getAccount() + "\n" + transaction.getAmount()).getBytes());
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write file", ioException);
        }
    }

}
