package Streams_program;

import java.util.*;
import java.util.stream.Collectors;

public class AvgSalaryByDept {

    static class Employee {
        int id;
        String dept;
        double salary;

        Employee(int id, String dept, double salary) {
            this.id = id;
            this.dept = dept;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "IT", 50000),
                new Employee(2, "HR", 40000),
                new Employee(3, "IT", 60000),
                new Employee(4, "HR", 50000),
                new Employee(5, "Finance", 45000)
        );

        Map<String, Double> avgSalary =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                e -> e.dept,
                                Collectors.averagingDouble(e -> e.salary)
                        ));

        System.out.println(avgSalary);
    }
}

