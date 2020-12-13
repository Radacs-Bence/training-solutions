package virtualmethod;

public class FerryBoat extends Vehicle{

    public static final int MAX_CARRY_WEIGHT = 2000;

    private Car car = null;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    public boolean canCarry(Car car){
        return car.getGrossLoad() < MAX_CARRY_WEIGHT;
    }

    public boolean load(Car car){
        boolean loaded = false;
        if (canCarry(car)){
            this.car = car;
            loaded = true;
        }
        return loaded;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + car.getGrossLoad();
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car.toString() +
                '}';
    }
}
