package attributes.book;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Az ezerarcú hős");
        System.out.println(book.getTitle());
        book.setTitle("Sosehol");
        System.out.println(book.getTitle());

    }
}
