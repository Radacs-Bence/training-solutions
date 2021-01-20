package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    private List<Integer> lotteryCreator(int ballCount){
        List<Integer> lottery = new ArrayList<>();
        for (int i = 1; i <= ballCount; i++){
            lottery.add(i);
        }
        Collections.shuffle(lottery);
        return lottery;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }

        List<Integer> lottery = lotteryCreator(ballCount);
        List<Integer> results = lottery.subList(0, lotteryType);
        Collections.sort(results);

        return results;
    }

}
