package LabWeek7Exercises.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class EmployeeManagementSystem {


    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minSalary) {
        return employees.stream()
                .filter(employee -> employee.salary() >= minSalary)
                .toList();
    }


    public double calculateTotalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::salary)
                .sum();
    }


    public void displayEmployeeDetails(List<Employee> employees) {
        employees.forEach(employee -> System.out.println("ID: " + employee.id() + ", Name: " + employee.name() + ", Salary: $" + employee.salary()));
    }
}




