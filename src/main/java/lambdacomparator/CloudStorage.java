package lambdacomparator;

public class CloudStorage implements Comparable<CloudStorage> {

    private static final int STANDARD_PERIOD = 1000;
    private static final int STANDARD_SIZE = 12;

    private String provider;
    private int space;
    private PayPeriod period;
    private double price;

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public CloudStorage(String provider, int space, PayPeriod period, double price) {
        this(provider, space);
        this.period = period;
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public PayPeriod getPeriod() {
        return period;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(CloudStorage o) {
        if (this.period != null  && o.period != null){
            return Double.compare(this.price * STANDARD_PERIOD / this.period.getLength() / this.space * STANDARD_SIZE,
                    o.price * STANDARD_PERIOD / o.period.getLength() / o.space * STANDARD_SIZE);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "CloudStorage{" +
                "provider='" + provider + '\'' +
                ", space=" + space +
                ", period=" + period +
                ", price=" + price +
                '}';
    }
}
