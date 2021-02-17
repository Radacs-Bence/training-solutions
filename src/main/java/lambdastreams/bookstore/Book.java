package lambdastreams.bookstore;

public class Book {

    private final String title;
    private final int yearOfPublish;
    private final int price;
    private final int number;

    public Book(String title, int yearOfPublish, int price, int number) {
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.price = price;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
