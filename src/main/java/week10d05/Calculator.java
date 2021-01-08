package week10d05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {


    public void findMinMaxSum(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("A megadott tömb null!");
        }
        int minSum = 0;
        int maxSum = 0;
        for (int number : findFourMin(arr)) {
            minSum += number;
        }
        for (int number : findFourMax(arr)) {
            maxSum += number;
        }
        System.out.print("Minimum: " + minSum + ", Maximum: " + maxSum);
    }

    private int[] findFourMin(int[] arr) {
        int[] mins = {arr[0], arr[1], arr[2], arr[3]};

        for (int number : arr) {
            int maximumIndex = findMaximumIndex(mins);
            if (number < mins[maximumIndex]) {
                mins[maximumIndex] = number;
            }
        }
        return mins;

    }

    private int[] findFourMax(int[] arr) {
        int[] maxs = {arr[0], arr[1], arr[2], arr[3]};

        for (int number : arr) {
            int minimumIndex = findMinimumIndex(maxs);
            if (number > maxs[minimumIndex]) {
                maxs[minimumIndex] = number;
            }
        }
        return maxs;
    }

    private int findMinimumIndex(int[] mins) {
        int minimumIndex = 0;
        for (int i = 0; i < 4; i++) {
            if (mins[minimumIndex] > mins[i]) {
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }

    private int findMaximumIndex(int[] mins) {
        int maximumIndex = 0;
        for (int i = 0; i < 4; i++) {
            if (mins[maximumIndex] < mins[i]) {
                maximumIndex = i;
            }
        }
        return maximumIndex;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány számot szeretne?");
        int size = scanner.nextInt();
        scanner.nextLine();

        if (size <= 0) {
            throw new IllegalArgumentException("0 vagy annál kissebb számot nem lehet!");
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Adjon meg egy számot!");
            numbers.add(scanner.nextInt());
        }

        while (numbers.size() < 4) {
            numbers.add(0);
        }

        int[] arr = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            arr[i] = numbers.get(i);
        }

        calculator.findMinMaxSum(arr);

    }

}
