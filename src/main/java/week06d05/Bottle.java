package week06d05;

public class Bottle {

    private BottleType type;
    private int filledUntil;

    public Bottle(BottleType type, int filledUntil) {
        this.type = type;
        this.filledUntil = filledUntil;
    }

    public static Bottle of(BottleType type){
        return new Bottle(type, type.getMaximumAmount());
    }

    public void fill(int fillAmount){
        filledUntil -= fillAmount;
        if (filledUntil < 0){
            throw new IllegalArgumentException("The bottle overflows if it's filled by " + fillAmount);
        }
    }

    public BottleType getType() {
        return type;
    }

    public int getFilledUntil() {
        return filledUntil;
    }
}
