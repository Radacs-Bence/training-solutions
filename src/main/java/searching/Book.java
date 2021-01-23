package searching;

public class Book implements Comparable<Book> {

    private final int id;
    private final String author;
    private final String title;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title) {
        this(0, author, title);
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        int i = this.author.compareTo(o.author);
        if (i == 0) {
            i = this.title.compareTo(o.title);
        }
        return i;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", id, author, title);
    }
}
