package LabWeek7Exercises.EmployeeManagementSystem;

import java.util.List;

public class NewestMain {
    public static void main(String[] args) {

        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

        List<Employee> employees = List.of(
                new Employee(1, "Orhan Huseinbegovic", 50000.0),
                new Employee(2, "Dalila Jasarevic", 60000.0),
                new Employee(3, "Imran Mezit", 75000.0)
        );

        double minSalary = 60000.0;
        List<Employee> filteredEmployees = employeeManagementSystem.filterEmployeesBySalary(employees, minSalary);

        double totalSalary = employeeManagementSystem.calculateTotalSalary(employees);

        System.out.println("Filtered Employees with Minimum Salary $" + minSalary + ":");
        employeeManagementSystem.displayEmployeeDetails(filteredEmployees);

        System.out.println("\nTotal Salary of All Employees: $" + totalSalary);
    }
}

