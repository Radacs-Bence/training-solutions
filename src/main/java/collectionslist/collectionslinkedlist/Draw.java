package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {


    private List<Integer> lotteryCreator(int ballCount){
        List<Integer> lottery = new LinkedList<>();
        for (int i = 1; i <= ballCount; i++){
            lottery.add(i);
        }
        Collections.shuffle(lottery);
        return lottery;
    }

    public Set<Integer> drawNumbers(int drawCount, int maxNumber){
        if (maxNumber <= drawCount) {
            throw new IllegalArgumentException(String.format("drawCount must be less then %d!", maxNumber));
        }
        return new TreeSet<>(lotteryCreator(maxNumber));
    }

}
