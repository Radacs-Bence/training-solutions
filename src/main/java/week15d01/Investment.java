package week15d01;

public class Investment {

    private final int buyDayRate;
    private final int sellDayRate;
    private final int difference;

    public Investment(int buyDayRate, int sellDayRate, int difference) {
        this.buyDayRate = buyDayRate;
        this.sellDayRate = sellDayRate;
        this.difference = difference;
    }

    public int getBuyDayRate() {
        return buyDayRate;
    }

    public int getSellDayRate() {
        return sellDayRate;
    }

    public int getDifference() {
        return difference;
    }
}
