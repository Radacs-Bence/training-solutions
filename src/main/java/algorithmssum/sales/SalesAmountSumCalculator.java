package algorithmssum.sales;

import java.util.Arrays;
import java.util.List;

public class SalesAmountSumCalculator {

    List<Salesperson> salespeople = Arrays.asList();

    public int sumSalesAmount(List<Salesperson> salespeople){
       int sum = 0;
        for (Salesperson person: salespeople) {
            sum += person.getAmount();
        }
        return sum;
    }

}
