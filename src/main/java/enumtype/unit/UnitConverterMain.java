package enumtype.unit;

import java.math.BigDecimal;
import java.util.Arrays;

public class UnitConverterMain {
    public static void main(String[] args) {
        UnitConverter unitConverter = new UnitConverter();

        System.out.println(unitConverter.convert(new BigDecimal(5321), LengthUnit.METER, LengthUnit.METER));
        System.out.println(unitConverter.convert(new BigDecimal(53), LengthUnit.METER, LengthUnit.MILLIMETER));
        System.out.println(unitConverter.convert(new BigDecimal(20), LengthUnit.METER, LengthUnit.YARD));
        System.out.println(unitConverter.convert(new BigDecimal(3), LengthUnit.CENTIMETER, LengthUnit.YARD));
        System.out.println(unitConverter.convert(new BigDecimal(417), LengthUnit.INCH, LengthUnit.METER));

        System.out.println(Arrays.toString(LengthUnit.values()));
        System.out.println(unitConverter.siUnits());
    }
}
