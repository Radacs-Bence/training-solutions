package week12d02;

public class House implements Comparable<House> {

    private int address;
    private int width;
    private String fence;

    public House(int address, int width, String fence) {
        this.address = address;
        this.width = width;
        this.fence = fence;
    }

    public int getAddress() {
        return address;
    }

    public int getWidth() {
        return width;
    }

    public String getFence() {
        return fence;
    }

    @Override
    public int compareTo(House o) {
        return width - o.getWidth();
    }
}
