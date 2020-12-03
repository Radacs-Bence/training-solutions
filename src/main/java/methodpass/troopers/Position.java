package methodpass.troopers;

public class Position {

    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position target){
        validator(target);
        double xDistance = posX - target.getPosX();
        double yDistance = posY - target.getPosY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    private void validator(Position position){
        if (position == null){
            throw new IllegalArgumentException("Position must not be null.");
        }
    }
}
