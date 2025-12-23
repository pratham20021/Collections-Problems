package Streams_program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class MaxEmployeesDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("A", "IT"),
                new Employee("B", "HR"),
                new Employee("C", "IT"),
                new Employee("D", "Finance"),
                new Employee("E", "IT"),
                new Employee("F", "HR")
        );

        String department =
                employees.stream()
                        .collect(java.util.stream.Collectors.groupingBy(e -> e.department,
                                java.util.stream.Collectors.counting()))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .get()
                        .getKey();

        System.out.println(department);
    }
}
