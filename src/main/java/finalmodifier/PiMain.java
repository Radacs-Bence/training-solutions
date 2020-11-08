package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        CircleCalculator circleCalculator = new CircleCalculator();
        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();

        System.out.println(circleCalculator.PI);
        System.out.println(circleCalculator.calculatePerimeter(3.0));
        System.out.println(circleCalculator.calculateArea(3.0));
        System.out.println(cylinderCalculator.calculateSurfaceArea(3.0, 5.0));
        System.out.println(cylinderCalculator.calculateVolume(3.0, 5.0));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(3.0, 5.0));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(3.0, 5.0));


    }

}
