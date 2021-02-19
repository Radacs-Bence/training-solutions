package lambdaprimitives;

public class Product {

    private final String name;
    private final double price;
    private final int pieces;

    public Product(String name, double price, int pieces) {
        this.name = name;
        this.price = price;
        this.pieces = pieces;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPieces() {
        return pieces;
    }
}
