package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    public Book getFirstBook(List books){
        if (books == null){
            throw new NullPointerException();
        }
        if (books.isEmpty()){
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        if (books.get(0).getClass() != Book.class){
            throw new ClassCastException("Not a book");
        }
        return (Book) books.get(0);
    }

}
