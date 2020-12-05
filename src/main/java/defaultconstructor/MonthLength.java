package defaultconstructor;

public enum MonthLength {

    JAN(31),
    FEB(28), //29 in leap year
    MAR(31),
    APR(30),
    MAY(31),
    JUN(30),
    JUL(31),
    AUG(31),
    SEP(30),
    OCT(31),
    NOV(30),
    DEC(31);

    private int numOfDays;

    MonthLength(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public int getNumOfDays() {
        return numOfDays;
    }
}
