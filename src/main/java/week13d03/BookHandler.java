package week13d03;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookHandler {

    public String mostPagesAuthor(List<Book> books) {
        Map<String, Integer> pagesByAuthor = fillMap(books);
        String maxAuthor = findMax(pagesByAuthor);

        return maxAuthor;
    }

    private Map<String, Integer> fillMap(List<Book> books){
        Map<String, Integer> pagesByAuthor = new HashMap<>();

        for (Book book : books) {
            String author = book.getAuthor();
            Integer pages = book.getNumberOfPages();
            if (!pagesByAuthor.containsKey(author)) {
                pagesByAuthor.put(author, pages);
            } else {
                Integer tempPages = pagesByAuthor.get(author) + pages;
                pagesByAuthor.put(author, tempPages);
            }
        }

        return pagesByAuthor;
    }

    private String findMax(Map<String, Integer> pagesByAuthor){
        String maxAuthor = Collections.max(pagesByAuthor.keySet());
        for (String author : pagesByAuthor.keySet()) {
            if (pagesByAuthor.get(author) > pagesByAuthor.get(maxAuthor)){
                maxAuthor = author;
            }
        }
        return maxAuthor;
    }

}
