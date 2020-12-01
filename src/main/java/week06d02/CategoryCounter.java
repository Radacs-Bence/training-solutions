package week06d02;

public class CategoryCounter {

    private int frozenNumber;
    private int dairyNumber;
    private int bakedNumber;
    private int otherNumber;

    public CategoryCounter(int frozenNumber, int dairyNumber, int bakedNumber, int otherNumber) {
        this.frozenNumber = frozenNumber;
        this.dairyNumber = dairyNumber;
        this.bakedNumber = bakedNumber;
        this.otherNumber = otherNumber;
    }

    @Override
    public String toString() {
        return "Fagyasztott: " + frozenNumber +
                ", Tejtermék: " + dairyNumber +
                ", Pékáru: " + bakedNumber +
                ", Egyébb: " + otherNumber;
    }
}
