package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Gipsz Jakab", 1996, 210000);

        System.out.println(employee);

        employee.raiseSalary(34000);

        System.out.println(employee);

        employee.setName("Gipsz József");
        System.out.println("Név: " + employee.getName());
        System.out.println("Felvétel éve: " + employee.getHiringYear());
        System.out.println("Fizetés: " + employee.getSalary());

    }

}
