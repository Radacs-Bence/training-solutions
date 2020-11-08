package debug.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberStatistics {

    List<Integer> numbers = new ArrayList<>();

    public NumberStatistics(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sumPositives() {
        int sum = 0;
        for(int n: numbers) {
            if(n > 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {
        int minDifference = numbers.get(0) > numbers.get(1) ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
        for(int i = 1; i < numbers.size() - 1; i++) {
            int actDifference = numbers.get(i) > numbers.get(i + 1) ? numbers.get(i) - numbers.get(i + 1) : numbers.get(i + 1) - numbers.get(i);;
            if(actDifference < minDifference) {
                minDifference = actDifference;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {

        Integer[] firstTest = {4, 8, -1, -2, 4, 5, 3};
        Integer[] secondTest = {-3,-4};
        Integer[] thirdTest = {1};
        NumberStatistics firstStatistics = new NumberStatistics(Arrays.asList(firstTest));
        NumberStatistics secondStatistics = new NumberStatistics(Arrays.asList(secondTest));
        NumberStatistics thirdStatistics = new NumberStatistics(Arrays.asList(thirdTest));

        System.out.println(firstStatistics.sumPositives());
        System.out.println(firstStatistics.minDifferenceBetweenNeighbours());
        System.out.println(secondStatistics.sumPositives());
        System.out.println(secondStatistics.minDifferenceBetweenNeighbours());
        System.out.println(thirdStatistics.sumPositives());
        System.out.println(thirdStatistics.minDifferenceBetweenNeighbours());

    }

}
