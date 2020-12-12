package abstractclass.gamecharacter;

public class Point {

    final private long x;
    final private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point target){
        long xDistance = Math.abs(x - target.x);
        long yDistance = Math.abs(y - target.y);
        return (long) Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
}
