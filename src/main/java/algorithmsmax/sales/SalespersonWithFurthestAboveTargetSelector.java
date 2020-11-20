package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson selectSalesPersonWithFurthestAboveTarget (List<Salesperson> salespeople){
        Salesperson maxSalesperson = null;
        for (Salesperson salesperson: salespeople) {
            if(maxSalesperson == null || salesperson.getDifferenceFromTarget() > maxSalesperson.getDifferenceFromTarget()){
                maxSalesperson = salesperson;
            }
        }
        return maxSalesperson;
    }

}
