package collectionsequalshash;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book searched = new Book(title, author);
        int index = books.indexOf(searched);
        Book found = null;

        if (index >= 0) {
            found = books.get(index);
        }
        return found;
    }

    public Book findBook(List<Book> books, Book book) {
        int index = books.indexOf(book);
        Book found = null;

        if (index >= 0) {
            found = books.get(index);
        }
        return found;
    }

    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> bookSet = new HashSet<>();
        for (Book book : books) {
            bookSet.add(book);
        }
        return bookSet;
    }


}
