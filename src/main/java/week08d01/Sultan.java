package week08d01;

import java.util.ArrayList;
import java.util.List;

public class Sultan {

    public static final int NUMBER_OF_DOORS = 100;
    public static final int NUMBER_OF_DAYS = 100;

    private List<Door> jail;

    public Sultan() {
        this.jail = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_DOORS + 1; i++){          //0. cella csak számolás miatt
            jail.add(new Door(i));
        }
    }

    public List<Door> birthday(){
        for (int i = 1; i < NUMBER_OF_DAYS + 1; i++){
            turnKeys(i);
        }
        return findOpens();
    }

    private void turnKeys(int nthDoors){
        for(int i = 0; i < jail.size(); i += nthDoors){
            jail.get(i).turnKey();
        }
    }

    private List<Door> findOpens(){
        List<Door> open = new ArrayList<>();
        for (Door door: jail) {
            if (door.getDoorState() == DoorState.OPEN && door.getIndex() != 0){
                open.add(door);
            }
        }
        return open;
    }


}
