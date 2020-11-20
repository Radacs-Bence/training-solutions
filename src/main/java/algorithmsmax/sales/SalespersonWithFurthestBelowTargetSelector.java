package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {
    public Salesperson selectSalesPersonWithFurthestBelowTarget (List<Salesperson> salespeople){
        Salesperson minSalesperson = null;
        for (Salesperson salesperson: salespeople) {
            if(minSalesperson == null || salesperson.getDifferenceFromTarget() < minSalesperson.getDifferenceFromTarget()){
                minSalesperson = salesperson;
            }
        }
        return minSalesperson;
    }
}
