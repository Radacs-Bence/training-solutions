package week14d04;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTransformationOperations {

    public List<Employee> transformToUppercase(List<Employee> employees){
        return employees.stream().map(employee -> new Employee(employee.getName().toUpperCase())).collect(Collectors.toList());
    }

}
