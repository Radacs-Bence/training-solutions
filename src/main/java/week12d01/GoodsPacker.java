package week12d01;

import java.util.Arrays;
import java.util.Comparator;

public class GoodsPacker {

    public int packGoods(int[][] types, int capacity) {
        int result = 0;
        Arrays.sort(types, comparatorCreator());
        int remaining = capacity;
        for (int i = 0; i < types.length; i++) {
            int weight = types[i][0];
            int price = types[i][1];
            int amount = remaining / weight;
            result += amount * price;
            remaining = remaining % weight;
        }
        return result;
    }

    private Comparator<int[]> comparatorCreator() {
        return new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] / o2[0] - o1[1] / o1[0];
            }
        };
    }

}
