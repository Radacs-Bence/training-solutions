package week15d02;

import java.time.LocalTime;

public class Order {

    private final String currier;
    private final String address;
    private final LocalTime time;

    public Order(String currier, String address, LocalTime time) {
        this.currier = currier;
        this.address = address;
        this.time = time;
    }

    public String getCurrier() {
        return currier;
    }

    public String getAddress() {
        return address;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "currier='" + currier + '\'' +
                ", address='" + address + '\'' +
                ", time=" + time +
                '}';
    }
}
