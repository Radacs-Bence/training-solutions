package week08d01;

public enum DoorState {

    OPEN{
        public DoorState turnKey(){
            return DoorState.CLOSED;
        }
    },
    CLOSED{
        public DoorState turnKey(){
            return DoorState.OPEN;
        }
    };

    abstract DoorState turnKey();


}
