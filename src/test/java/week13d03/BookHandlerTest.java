package week13d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookHandlerTest {

    @Test
    void mostPagesAuthor() {

        List<Book> books = new ArrayList<>();
        books.add(new Book("a", "a", 1));
        books.add(new Book("b", "a", 2));
        books.add(new Book("a", "a", 1));
        books.add(new Book("a", "a", 1));

        BookHandler bookHandler = new BookHandler();

        assertEquals("a", bookHandler.mostPagesAuthor(books));

    }
}