package inheritanceconstructor.cars;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        tooMuchFuel(tankCapacity, fuel);
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        runOutOfFuel(this.fuel, fuel);
        this.fuel += fuel;
    }

    public void drive(int km) {
        double used = (km * fuelRate) / 100.0;
        runOutOfFuel(fuel, used);
        fuel -= used;
    }

    public double calculateRefillAmount(){
        return tankCapacity - fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void tooMuchFuel(double capacity, double fuel){
        if (capacity - fuel < 0){
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
    }

    public void runOutOfFuel(double fuel, double used){
        if (fuel - used < 0 || fuel + used < 0){
            throw new RuntimeException("Not enough fuel available!");
        }
    }

}
