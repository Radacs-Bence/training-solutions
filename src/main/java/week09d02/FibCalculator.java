package week09d02;

public class FibCalculator {

    public long sumEvens(int bound){
        long sum = 0;
        int result1 = 1;
        int result2 = 1;
        int next = 0;
        while (bound >= next){
            if (result2 % 2 == 0){
                sum += result2;
            }
            next = result1 + result2;
            result1 = result2;
            result2 = next;
        }
        return sum;
    }

}
