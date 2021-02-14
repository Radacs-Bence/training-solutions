package week15d01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExchangeRate {

    public Investment bitcoin(List<Integer> rate) {
        Investment result = new Investment(0, 0, Integer.MIN_VALUE);
        int actualMin = Integer.MAX_VALUE;
        for (int i = 0; i < rate.size() - 1; i++) {
            if (rate.get(i) < actualMin) {
                actualMin = rate.get(i);
                result = bestSellAfterDay(i, rate, result);
            }
        }
        return result;
    }

    private Investment bestSellAfterDay(int i, List<Integer> rate, Investment result) {
        int maxDifference = result.getDifference();
        int buyDayRate = result.getBuyDayRate();
        int sellDayRate = result.getSellDayRate();
        for (int k = i + 1; k < rate.size(); k++) {
            int tempDiff = rate.get(k) - rate.get(i);
            if (tempDiff > maxDifference) {
                maxDifference = tempDiff;
                buyDayRate = rate.get(i);
                sellDayRate = rate.get(k);
            }
        }
        return new Investment(buyDayRate, sellDayRate, maxDifference);
    }


}
