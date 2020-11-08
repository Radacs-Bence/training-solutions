package finalmodifier;

public class TaxCalculator {

    public static final double TAX_RATE = 27;

    public double tax(double price) {
        return price * (TAX_RATE / 100);
    }

    public double priceWithTax(double price) {
        return price + (tax(price));
    }

    public static void main(String[] args) {
        System.out.println(new TaxCalculator().tax(20000));
        System.out.println(new TaxCalculator().priceWithTax(20000));
    }

}
