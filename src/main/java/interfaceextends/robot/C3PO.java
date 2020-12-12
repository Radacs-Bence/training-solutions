package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class C3PO implements MovableRobot{


    private Point position;
    private int angle = 0;
    private List<Point> path = new ArrayList<>();

    public C3PO(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    private void walkTo(Point target){
        position = target;
        path.add(position);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        walkTo(position);
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
}
