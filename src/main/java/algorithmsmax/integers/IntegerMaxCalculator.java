package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {

    public Integer max(List<Integer> integers) {
        Integer maximum = Integer.MIN_VALUE;
        for (Integer i: integers) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

}
