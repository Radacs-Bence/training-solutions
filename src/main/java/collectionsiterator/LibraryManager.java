package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks = new HashSet<>();

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber){
        Book found = null;
        Iterator<Book> iterator = libraryBooks.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            if (book.getRegNumber() == regNumber){
                found = book;
            }
        }
        if (found == null){
            throw new MissingBookException(String.format("No books found with regnumber: %d", regNumber));
        }
        return found;
    }

    public int removeBookByRegNumber(int regNumber){
        Book found = null;
        Iterator<Book> iterator = libraryBooks.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            if (book.getRegNumber() == regNumber){
                found = book;
                iterator.remove();
            }
        }
        if (found == null){
            throw new MissingBookException(String.format("No books found with regnumber: %d", regNumber));
        }
        return regNumber;
    }

    public Set<Book> selectBooksByAuthor(String author){
        Set<Book> booksByAuthor = new HashSet<>();
        Iterator<Book> iterator = libraryBooks.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            if (book.getAuthor() == author){
                booksByAuthor.add(book);
            }
        }
        if (booksByAuthor.isEmpty()){
            throw new MissingBookException(String.format("No books found by %s", author));
        }
        return booksByAuthor;
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }

}
