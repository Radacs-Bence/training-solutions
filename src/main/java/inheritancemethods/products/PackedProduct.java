package inheritancemethods.products;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product{

    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeigth, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeigth, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public BigDecimal totalWeight(int pieces){
        int boxes = pieces / packingUnit;
        if (pieces % packingUnit != 0){
            boxes++;
        }
        return super.totalWeight(pieces).add(new BigDecimal(String.valueOf(boxes)).multiply(weightOfBox)).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }
}
