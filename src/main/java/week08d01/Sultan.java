package week08d01;

import java.util.ArrayList;
import java.util.List;

public class Sultan {

    private List<Door> jail;

    public Sultan() {
        this.jail = new ArrayList<>();
        for (int i = 0; i < 101; i++){          //0. cella csak számolás miatt
            jail.add(new Door(i));
        }
    }

    public List<Door> birthday(){
        for (int i = 1; i < 101; i++){
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
