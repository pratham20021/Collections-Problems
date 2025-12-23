package CodingChallange;

import java.util.*;

public class Reversenames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Prathamesh",
                "Amit",
                "Rohit",
                "Suresh",
                "Neha"
        );

        names.sort(Collections.reverseOrder());

        for (String name : names) {
            System.out.println(name);
        }
    }
}
