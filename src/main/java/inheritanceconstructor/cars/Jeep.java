package inheritanceconstructor.cars;

public class Jeep extends Car{

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        tooMuchFuel(extraCapacity, extraFuel);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public void modifyFuelAmount(double fuel){
        super.modifyFuelAmount(fuel);
    }

    public void drive(int km){
        double used = (km * getFuelRate()) / 100.0;
        runOutOfFuel(getTankCapacity() + extraFuel, used);
        extraFuel -= used;
        if (extraFuel < 0){
            modifyFuelAmount(extraFuel);
            extraFuel = 0;
        }
    }

    public double calculateRefillAmount(){
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
