package methodpass.troopers;

public class Trooper {

    private final String name;
    private Position position;

    public Trooper(String name) {
        validator(name);
        this.name = name;
        this.position = new Position(0, 0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target) {
        validator(target);
        this.position = target;
    }

    public double distanceFrom(Position target){
        validator(target);
        return position.distanceFrom(target);
    }

    private void validator(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name must not be empty.");
        }
    }

    private void validator(Position position){
        if (position == null){
            throw new IllegalArgumentException("Position must not be null.");
        }
    }
}
