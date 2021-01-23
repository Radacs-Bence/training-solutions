package iofilestest.library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    public static final String SEPARATOR = ": ";
    private List<Book> books = new ArrayList<>();

    public void add(Book... newBooks) {
        List<Book> newBooksList = Arrays.asList(newBooks);
        newBooksList.removeAll(books);
        books.addAll(newBooksList);
    }

    public void saveBooks(Path path) {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Book book : books) {
                writer.write(book.getAuthor() + SEPARATOR + book.getTitle() + "\n");
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not open file!", ioException);
        }
    }

    public void loadBooks(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(SEPARATOR);
                add(new Book(parts[0], parts[1]));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not open file!", ioException);
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
