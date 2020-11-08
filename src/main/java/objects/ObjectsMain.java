package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {
        new Book();

        System.out.println(new Book());

        Book emptyBook = null;

        System.out.println(emptyBook);

        Book book = new Book();

        System.out.println(book);

        book = null;

        System.out.println(book);

        book = new Book();

        System.out.println(book);

        Book anotherBook = new Book();

        System.out.println(book == anotherBook);

        anotherBook = book;

        System.out.println(anotherBook);
        System.out.println(book == anotherBook);

        System.out.println(anotherBook instanceof Book);

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book5 = new Book();
        book6 = null;

        Book[] books = {new Book(), new Book(), new Book()};

        List<Book> books1 = Arrays.asList(new Book(), new Book());

        List<Book> books2 = new ArrayList<>();
        books2.add(new Book());
        books2.add(new Book());
        books2.add(new Book());

    }

}
