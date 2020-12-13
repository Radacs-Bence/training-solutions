package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{

    private int passengers;
    private int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int left = 0;
        if (this.passengers + passengers <= maxPassengers){
            this.passengers += passengers;
        } else {
            left = (this.passengers + passengers) - maxPassengers;
            this.passengers = maxPassengers;
        }
        return left;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
