package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class OrderedArrayLibrary {

    private Book[] bookArray;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    public Book[] sortingById(){
        Book[] booksById = bookArray.clone();
        Arrays.sort(booksById);
        return booksById;
    }

    public Book[] sortingByTitle(){
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };
        Book[] booksByTitle = bookArray.clone();
        Arrays.sort(booksByTitle, comparator);
        return booksByTitle;
    }

}
