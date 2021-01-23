package searching;

import java.util.Arrays;

public class BookArraySearch {

    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title){
        stringValidator(author);
        stringValidator(title);
        int index = Arrays.binarySearch(bookArray, new Book(author, title));
        if (index < 0){
            throw new IllegalArgumentException(String.format("No book found by %s with title %s", author, title));
        }
        return bookArray[index];
    }

    private void stringValidator(String parameter){
        if (parameter == null || parameter.isBlank()){
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
    }

}
