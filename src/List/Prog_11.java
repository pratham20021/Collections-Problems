package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prog_11 {
    public static void main(String[] args) {

        // Create a List
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("API");
        list.add("Micro");

        // Convert List to Map
        Map<String, Integer> map = new HashMap<>();

        for (String value : list) {
            map.put(value, value.length());
        }

        // Print Map
        System.out.println(map);
    }
}
