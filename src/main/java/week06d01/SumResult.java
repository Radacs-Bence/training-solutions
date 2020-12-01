package week06d01;

public class SumResult {

    private final double positiveSum;
    private final double negativeSum;

    public SumResult(double positiveSum, double negativeSum) {
        this.positiveSum = positiveSum;
        this.negativeSum = negativeSum;
    }

    public double getPositiveSum() {
        return positiveSum;
    }

    public double getNegativeSum() {
        return negativeSum;
    }
}
