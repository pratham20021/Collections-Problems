package Map;

/*
Iterate over keys and values in a Map

Check if a key exists in a Map
*/

import java.util.HashMap;
import java.util.Map;

public class Prog_5{
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Java", 90);
        map.put("Spring", 80);
        map.put("SQL", 85);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        boolean exists = map.containsKey("Java");
        System.out.println(exists);
        if(map.containsKey("Spring")){
            map.remove("Spring");
        }
        System.out.println(map.size());
    }
}
