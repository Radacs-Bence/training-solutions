package math.game;

public class Point {

    private int y;
    private int x;

    public Point(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public double distance(Point other){
        double yDistance = getY()-other.getY();
        double xDistance = getX()-other.getX();

        return Math.sqrt(Math.pow(yDistance, 2) + Math.pow(xDistance, 2));
    }
}
