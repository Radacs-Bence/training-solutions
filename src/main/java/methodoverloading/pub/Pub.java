package methodoverloading.pub;

import methodoverloading.Time;

public class Pub {

    private String name;
    private Time openFrom;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        this.openFrom = new Time(hours, minutes);
    }

    @Override
    public String toString() {
        return String.format("%s;%d:%d", name, openFrom.getHours(), openFrom.getMinutes());
    }

    public String getName() {
        return name;
    }

    public Time getOpenFrom() {
        return openFrom;
    }
}
