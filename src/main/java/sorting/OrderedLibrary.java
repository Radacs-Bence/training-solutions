package sorting;

import java.util.Iterator;
import java.util.Set;

public class OrderedLibrary {

    private Set<Book> library;

    public OrderedLibrary(Set<Book> library) {
        this.library = library;
    }

    public Book lendFirstBook() {
        Book book = null;
        Iterator<Book> iterator = library.iterator();
        if (iterator.hasNext()){
            book = iterator.next();
        }
        if (book == null){
            throw new NullPointerException("Libray is empty!");
        }
        return book;
    }

}
