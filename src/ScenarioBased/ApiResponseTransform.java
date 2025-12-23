package ScenarioBased;


//API response transformation using List + Map

import java.util.*;

public class ApiResponseTransform {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User(1, "Amit", "IT"));
        users.add(new User(2, "Neha", "HR"));
        users.add(new User(3, "Rahul", "IT"));

        Map<Integer, User> userMap = new HashMap<>();

        for (User user : users) {
            userMap.put(user.id, user);
        }

        System.out.println(userMap);
    }
}

class User {
    int id;
    String name;
    String department;

    User(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return id + "-" + name + "-" + department;
    }
}
