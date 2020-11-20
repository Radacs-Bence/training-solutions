package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespeople){
        Salesperson maxSalesperson = null;
        for (Salesperson salesperson: salespeople) {
            if(maxSalesperson == null || salesperson.getAmount() > maxSalesperson.getAmount()){
                maxSalesperson = salesperson;
            }
        }
        return maxSalesperson;
    }
}
