package ioreadwritebytes;

public class Temperatures {

    public static final int YEAR = 365;

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double sum = 0;
        for (byte temperature : data) {
            sum += temperature;
        }
        return sum / YEAR;
    }

    public double getMonthAverage() {
        double sum = 0;
        for (int i = 0; i < 30; i++ ) {
            sum += data[YEAR - (i + 1)];
        }
        return sum / 30;
    }
}
