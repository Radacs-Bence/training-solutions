package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    List<String> titles = new ArrayList<>();

    public void add(String book){
        titles.add(book);
    }

    public List<String> findAllByPrefix(String prefix){
        List<String> containsPrefix = new ArrayList<>();
        for (int i = 0; i < titles.size(); i++){
            String element = titles.get(i);
            if(element.indexOf(prefix) != -1){
                containsPrefix.add(element);
            }
        }
        return containsPrefix;
    }

    public List<String> getTitles() {
        return titles;
    }

    public static void main(String[] args) {

        Books books = new Books();
        books.add("Mi lenne, ha?");
        books.add("Pusztító vihar");
        books.add("London folyói");
        books.add("Harry Potter és a bölcsek köve");
        books.add("Amerikai istenek");
        books.add("Az ezerarcú hős");
        books.add("Harry Potter és a titkok kamrája");

        System.out.println(books.getTitles());

        System.out.println(books.findAllByPrefix("Potter"));



    }
}
