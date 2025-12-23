package ScenarioBased;
//Employee management – search employee by ID using Map
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(101, new Employee(101, "Amit", "IT", 60000));
        employeeMap.put(102, new Employee(102, "Neha", "HR", 50000));
        employeeMap.put(103, new Employee(103, "Rahul", "Finance", 55000));

        int searchId =  input.nextInt();
        System.out.println(employeeMap.get(searchId));

        if (employeeMap.containsKey(searchId)) {
            System.out.println(employeeMap.get(searchId));
        } else {
            System.out.println("Employee not found");
        }
    }
}

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}
