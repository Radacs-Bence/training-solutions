package week05d04;

public class Product {

    private long price;
    private Currency currency;

    public Product(long price, Currency currency) {
        if (currency == null){
            throw new IllegalArgumentException("Currency cannot be null");
        }
        this.price = price;
        this.currency = currency;
    }

    public double convertPrice (Currency currency){
        double newPrice = 0.0;

        if (currency == this.currency) {
            newPrice = price;
        } else {
            if (currency == Currency.HUF) {
                newPrice = price * 300.0;
            }

            if (currency == Currency.USD) {
                newPrice = price / 300.0;
            }
        }
        return newPrice;
    }

}
