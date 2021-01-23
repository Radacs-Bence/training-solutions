package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {

    List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle() {
        List<Book> booksByTitle = new ArrayList<>(libraryBooks);
        Collections.sort(booksByTitle);
        return booksByTitle;
    }

    public List<Book> orderedByAuthor() {
        List<Book> booksByAuthor = new ArrayList<>(libraryBooks);
        Collections.sort(booksByAuthor, new AuthorComparator());
        return booksByAuthor;
    }

    public List<String> orderedByTitleLocale(Locale locale) {
        List<String> titles = new ArrayList<>();
        for (Book book : libraryBooks) {
            titles.add(book.getTitle());
        }
        Collections.sort(titles, Collator.getInstance(locale));
        return titles;
    }

}
