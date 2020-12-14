package week08d01;

public class Door {

    private int index;
    private DoorState doorState;

    public Door(int index) {
        this.index = index;
        this.doorState = DoorState.CLOSED;
    }

    public void turnKey(){
        doorState = doorState.turnKey();
    }

    public int getIndex() {
        return index;
    }

    public DoorState getDoorState() {
        return doorState;
    }

    @Override
    public String toString() {
        return index + ". ajtó";
    }
}
