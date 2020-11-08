package math.game;

import java.util.Random;

public class Warrior {

    Random rnd = new Random();


    private String name;
    private Point position;
    private int stamina;
    private double skill;

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        stamina = rnd.nextInt(81) + 20;
        skill = rnd.nextDouble();
    }

    public Point getPosition() {
        return position;
    }

    public void move (Warrior enemy){
        int yDifference = position.getY() - enemy.position.getY();
        int xDifference = position.getX() - enemy.position.getX();
        int moveY;
        int moveX;
        if (yDifference == 0) {
            moveY =0;
        } else {
            moveY = (yDifference) / Math.abs(yDifference);
        }
        if (xDifference == 0) {
            moveX =0;
        } else {
            moveX = (xDifference) / Math.abs(xDifference);
        }
        int newY =position.getY() - moveY;
        int newX =position.getX() - moveX;
        position = new Point(newX, newY);

    }

    public void attack (Warrior enemy){
        if (rnd.nextDouble() < skill) {
            enemy.stamina -= rnd.nextInt(3) + 1;
        }
    }

    public double distance(Warrior enemy) {
        return position.distance(enemy.position);
    }

    public boolean isAlive (){
        return stamina >0;
    }

    public String toString(){
        return name + ": (" + position.getX() + ":" + position.getY() + ") " + stamina;
    }



}
