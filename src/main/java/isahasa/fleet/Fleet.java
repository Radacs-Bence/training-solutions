package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> fleet = new ArrayList<>();
    private int waitingCargo;
    private int waitingPersons;

    public void addShip(Ship ship){
        fleet.add(ship);
    }

    public void loadShip(int persons, int cargoWeight){
        int leftPersons = persons;
        int leftCargo = cargoWeight;
        for (Ship ship: fleet) {
            if (ship instanceof CanCarryPassengers){
                leftPersons = ((CanCarryPassengers) ship).loadPassenger(leftPersons);
            }
            if (ship instanceof CanCarryGoods){
                leftCargo = ((CanCarryGoods) ship).loadCargo(leftCargo);
            }
        }
        waitingCargo = leftCargo;
        waitingPersons = leftPersons;
    }

    public List<Ship> getFleet() {
        return List.copyOf(fleet);
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }


}
