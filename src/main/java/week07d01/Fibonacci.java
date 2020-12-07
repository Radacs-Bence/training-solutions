package week07d01;

public class Fibonacci {

    public long fib(int n){
        long resultOne = 1;
        long resultTwo = 1;
        for (int i = 2; i < n ; i++){
            if (i % 2 == 0){
                resultOne += resultTwo;
            } else {
                resultTwo += resultOne;
            }
        }
        if (n == 0){
            return 0;
        }
        if (n % 2 == 0){
            return resultTwo;
        }
        return resultOne;
    }
}
