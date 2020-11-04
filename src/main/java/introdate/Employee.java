package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Employee {

    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginEmployment;

    public Employee(int year, int month, int day, String name) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.beginEmployment = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getBeginEmployment() {
        return beginEmployment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a nevét:");
        String name = scanner.nextLine();

        System.out.println("Adja meg a születési dátumát szóközökkel elválasztva (év hónap nap):");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("Név: " + employee.getName() +
                "\r\nSzületési dátum: " + employee.getDateOfBirth() +
                "\r\nCsatlakozás : " + employee.getBeginEmployment());

    }
}
