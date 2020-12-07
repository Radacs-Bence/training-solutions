package week07d01;

public class Fibonacci {

    private static Long[] results;

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

    public long fibBonus(int n){
        if (n < 0){
            throw new IllegalArgumentException("Index cannot be negative!");
        }
        results = new Long[n+1];
        return bonusRecursive(n);
    }

    private long bonusRecursive(int n){
        if (n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if (results[n] == null){
            results[n] = bonusRecursive(n-1) + bonusRecursive(n-2);
        }
        return results[n];
    }

}
