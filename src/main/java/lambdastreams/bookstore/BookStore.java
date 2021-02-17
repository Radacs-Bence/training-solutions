package lambdastreams.bookstore;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public Integer getNumberOfBooks(){
        return books.stream().reduce(0, (a, b) -> Integer.sum(a, b.getNumber()), Integer::sum);
    }

    public Optional<Book> findNewestBook(){
        return books.stream().max(Comparator.comparingInt(Book::getYearOfPublish));
    }

    public int getTotalValue(){
        return books.stream().reduce(0, (a, b) -> Integer.sum(a, b.getPrice() * b.getNumber()), Integer::sum);
    }

    public List<Book> getByYearOfPublish(int year){
        return books.stream().collect(Collectors.groupingBy(Book::getYearOfPublish)).get(year);
    }

}
