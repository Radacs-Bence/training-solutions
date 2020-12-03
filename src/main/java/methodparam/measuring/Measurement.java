package methodparam.measuring;

public class Measurement {

    private double[] measurement;

    public Measurement(double[] measurement) {
        this.measurement = measurement;
    }

    public double findFirstIndexInLimit(int lower, int upper){
        for (double number: measurement) {
            if (lower < number && number < upper){
                return number;
            }
        }
        return -1.0;
    }

    public double minimum(){
        double min = Double.MAX_VALUE;
        for (double number: measurement) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public double maximum(){
        double max = Double.MIN_VALUE;
        for (double number: measurement) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public ExtremValues minmax(){
        return new ExtremValues(minimum(), maximum());
    }

}
