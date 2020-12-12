package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{

    public static final long ALTITUDE = 10;

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public AstroBoy(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public void walkTo(Point target){
        position = target;
        path.add(position);
    }

    public void flyTo(Point target){
        position = target;
        path.add(position);
    }



    @Override
    public void liftTo(long altitude) {
        position = new Point(position.getX(), position.getY(), altitude);
        path.add(position);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        flyTo(new Point(position.getX(), position.getY(), ALTITUDE));
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        if (this.angle + angle >= 180){
            angle -= 180;
        }
        this.angle += angle;
    }

    @Override
    public List<Point> getPath() {
        return List.copyOf(path);
    }

    public long getAltitude() {
        return position.getZ();
    }

}
