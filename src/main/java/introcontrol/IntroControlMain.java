package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {

        IntroControl control = new IntroControl();

        System.out.println("substractTenIfGreaterThanTen");
        System.out.println(control.substractTenIfGreaterThanTen(2));
        System.out.println(control.substractTenIfGreaterThanTen(-10));
        System.out.println(control.substractTenIfGreaterThanTen(10));
        System.out.println(control.substractTenIfGreaterThanTen(1324));

        System.out.println("\r\ndescribeNumber");
        System.out.println(control.describeNumber(6));
        System.out.println(control.describeNumber(0));

        System.out.println("\r\ngreetingToJoe");
        System.out.println(control.greetingToJoe("Piroska"));
        System.out.println(control.greetingToJoe("Joe"));
        System.out.println(control.greetingToJoe("Joef"));

        System.out.println("\r\ncalculateBonus");
        System.out.println(control.calculateBonus(5));
        System.out.println(control.calculateBonus(1_000_000));
        System.out.println(control.calculateBonus(1_000_004));
        System.out.println(control.calculateBonus(5_000_000));

        System.out.println("\r\ncalculateConsumption");
        System.out.println(control.calculateConsumption(5,9999));
        System.out.println(control.calculateConsumption(5000,1));

        System.out.println("\r\nprintNumbers");
        control.printNumbers(5);
        control.printNumbers(15);

        System.out.println("\r\nprintNumbersBetween");
        control.printNumbersBetween(0,5);
        control.printNumbersBetween(5,15);
        control.printNumbersBetween(15,1);

        System.out.println("\r\nprintNumbersBetweenAnyDirection");
        control.printNumbersBetweenAnyDirection(5,10);
        control.printNumbersBetweenAnyDirection(15,10);

        System.out.println("\r\nprintOddNumbers");
        control.printOddNumbers(9);
        control.printOddNumbers(14);


    }
}
