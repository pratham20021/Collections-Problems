package CodingChallange;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupEmployeeByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", "IT"),
                new Employee(2, "Rahul", "HR"),
                new Employee(3, "Sneha", "IT"),
                new Employee(4, "Neha", "Finance"),
                new Employee(5, "Rohit", "HR")
        );

        Map<String, List<Employee>> map =
                employees.stream()
                        .collect(Collectors.groupingBy(e -> e.department));

        System.out.println(map);
    }
}
