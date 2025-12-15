package ScenarioBased;

//Unique username validation using Set


import java.util.HashSet;
import java.util.Set;

public class UsernameValidation {
    public static void main(String[] args) {

        Set<String> usernames = new HashSet<>();

        register(usernames, "pratham");
        register(usernames, "rahul");
        register(usernames, "pratham");
        register(usernames, "neha");
        register(usernames, "rahul");
    }

    static void register(Set<String> usernames, String username) {
        if (usernames.add(username)) {
            System.out.println(username + " registered successfully");
        } else {
            System.out.println(username + " already exists");
        }
    }
}
