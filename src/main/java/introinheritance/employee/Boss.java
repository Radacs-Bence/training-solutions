package introinheritance.employee;

public class Boss extends Employee {

    public static final double LEADERSHIP_FACTOR = 0.1;
    private int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, bossSalaryCalculator(salary, numberOfEmployees));
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getSalary() {
        return super.getSalary();
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    private static double bossSalaryCalculator(double salary, int numberOfEmployees) {
        return salary + (salary * LEADERSHIP_FACTOR * numberOfEmployees);
    }


}
