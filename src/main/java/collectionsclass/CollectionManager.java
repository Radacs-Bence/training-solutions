package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

    private List<Book> library;

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> getLibrary() {
        return library;
    }

    public List<Book> createUnmodifiableLibrary() {
        return Collections.unmodifiableList(library);
    }

    public List<Book> reverseLibrary() {
        List<Book> reverse = new ArrayList<>(library);
        Collections.sort(reverse);
        Collections.reverse(reverse);
        return reverse;
    }

    public Book getFirstBook() {
        return Collections.min(library);
    }

    public Book getLastBook() {
        return Collections.max(library);
    }

}
