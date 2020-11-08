package math;


import java.util.Random;

public class RoundingAnomaly {

    Random rnd = new Random();

    public double[] randomNumbers(int size, double max, int scale){
        double[] numbers = new double[size];
        double increase = Math.pow(10, scale);
        for (int i = 0; i < size; i ++) {
            double number = Math.round(rnd.nextDouble() * max * increase) / increase;
            numbers[i] = number;
        }
        return numbers;

    }

    public double roundAfterSum(double[] numbers){
        double sum =0;
        for (int i = 0; i < numbers.length; i ++) {
            sum += numbers[i];
        }
        return Math.round(sum);
    }

    public double sumAfterRound (double[] numbers){
        double sum =0;
        for (int i = 0; i < numbers.length; i ++) {
            sum += Math.round(numbers[i]);
        }
        return sum;
    }

    public double difference(int size, double max, int scale){
        double[] numbers = randomNumbers(size, max, scale);
        double sumFirst = roundAfterSum(numbers);
        double roundFirst = sumAfterRound(numbers);

        return Math.abs(sumFirst-roundFirst);
    }

    public static void main(String[] args) {

        RoundingAnomaly roundingAnomaly = new RoundingAnomaly();
        double differenceSum = 0;

        for (int i = 0; i < 100; i++){
            double difference = roundingAnomaly.difference(1000, 1_000_000, 5);
            differenceSum += difference;
        }

        System.out.println("Átlag: " + differenceSum/100);


    }

}
