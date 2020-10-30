package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Andy Weir", "The Martian");
        book.register("6534");
        System.out.println("Könyv regisztrálva!" + "\r\n" + "Szerző: " + book.getAuthor() + "\r\n" + "Cím: " + book.getTitle() + "\r\n" + "Regisztrációs szám: " + book.getRegNumber());
    }
}