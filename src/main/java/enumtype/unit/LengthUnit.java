package enumtype.unit;

public enum LengthUnit {

    METER(1000, true),
    CENTIMETER(100, true),
    MILLIMETER(1, true),
    YARD(9144, false),
    FOOT(3048, false),
    INCH(254, false);

    private final int amountInMM;

    private final boolean SIMesure;

    LengthUnit(int inMillimeter, boolean siUnit) {
        this.amountInMM = inMillimeter;
        this.SIMesure = siUnit;
    }

    public int getAmountInMM() {
        return amountInMM;
    }

    public boolean isSIMesure() {
        return SIMesure;
    }

}
