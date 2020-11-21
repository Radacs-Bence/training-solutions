package recursion;

public class FactorialCalculator {

    public long getFactorial(int number){
        long result = 1;
        if (number > 1){
            result = number * getFactorial(number-1);
        }
        return result;
    }

}
