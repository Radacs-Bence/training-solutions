package week12d05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFilterTest {

    @Test
    void countSeniorDevsTest() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(40, 5, "Gipsz Jakab", Arrays.asList("programming")));
        employees.add(new Employee(20, 1, "Gipsz Jónás", Arrays.asList("accounting")));
        employees.add(new Employee(30, 4, "Kis Piroska", Arrays.asList("programming", "marketing")));

        List<Employee> seniors = new EmployeeFilter().countSeniorDevs(employees);

        assertEquals("Gipsz Jakab", seniors.get(0).getName());
        assertEquals("Kis Piroska", seniors.get(1).getName());
    }
}