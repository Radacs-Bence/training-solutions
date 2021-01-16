package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private final List<String> authors;
    private final int numberOfPages;
    private final String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors ) {
        if (Validators.isBlank(title) || Validators.isEmpty(authors) || numberOfPages < 0) {
            throw new IllegalArgumentException("Empty title");
        }
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }


    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
