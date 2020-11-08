package debug;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args){
        Employee firstEmployee = new Employee("Gipsz Jakab", 1984);
        Employee secondEmployee = new Employee("Gipsz József", 2004);
        Employee thirdEmployee = new Employee("Kovács Piroska", 1995);
        Employee fourthEmployee = new Employee("Kis Mária", 1989);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(firstEmployee);
        company.addEmployee(secondEmployee);
        company.addEmployee(thirdEmployee);
        company.addEmployee(fourthEmployee);

        System.out.println(company.listEmployeeNames());
        Employee searchedEmployee = company.findEmployeeByName("Gipsz József");
        System.out.println(searchedEmployee.getName());

    }

}
