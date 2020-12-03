package methodstructure.pendrives;



public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(int percent){
        price += price * percent /100;
    }

    public int comparePricePerCapacity(Pendrive pendrive){
        int compare = 2;
        double subtract = ((double) price / capacity) - ((double) pendrive.getPrice() / pendrive.getCapacity());
        if (subtract == 0){
            compare = 0;
        } else {
            compare = (int) ((subtract) / Math.abs(subtract));
        }
        return compare;
    }

    public boolean cheaperThan(Pendrive pendrive){
        return price < pendrive.getPrice();
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
