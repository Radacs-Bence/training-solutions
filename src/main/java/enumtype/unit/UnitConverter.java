package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {

     public BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target){

        return length.multiply(new BigDecimal(source.getAmountInMM())).divide(new BigDecimal(target.getAmountInMM()), 4, RoundingMode.HALF_UP);
    }

    public List<LengthUnit> siUnits(){
        List<LengthUnit> SIUnits = new ArrayList<>();
        for (LengthUnit unit: LengthUnit.values()) {
            if (unit.isSIMesure()) {
                SIUnits.add(unit);
            }
        }
        return SIUnits;
     }
        

}


