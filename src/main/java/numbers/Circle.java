package numbers;

public class Circle {


    private int diameter;

    private double piTwoDigits;

    public Circle(int diameter) {
        this.diameter = diameter;
        this.piTwoDigits = 3.14;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getPiTwoDigits() {
        return piTwoDigits;
    }

    public double perimeter() {
        return diameter * piTwoDigits;
    }

    public double area() {
        return  Math.pow((diameter/2.0), 2) * piTwoDigits;
    }

}
