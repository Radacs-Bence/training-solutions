package lambdaprimitives;

import java.util.*;

public class SportGadgetStore {

    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public int getNumberOfProducts() {
        return products.stream().mapToInt(Product::getPieces).sum();
    }

    public double getAveragePrice() {
        OptionalDouble average = products.stream().mapToDouble(Product::getPrice).average();
        if (!average.isPresent()) {
            return 0;
        }
        return average.getAsDouble();
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics summaryStatistics = products.stream()
                .filter(x -> x.getPrice() > minPrice)
                .mapToInt(Product::getPieces)
                .summaryStatistics();

        String text = "";
        if (summaryStatistics.getCount() <= 0) {
            text = "Nincs ilyen termék.";
        } else {
            text = String.format("Összesen %d féle termék, amelyekből minimum %d db, maximum %d db, összesen %d db van.",
                    summaryStatistics.getCount(),
                    summaryStatistics.getMin(),
                    summaryStatistics.getMax(),
                    summaryStatistics.getSum());
        }

        return text;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}
