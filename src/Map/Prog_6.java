package Map;

//Sort Map by keys

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Prog_6 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Banana", 20);
        map.put("Apple", 10);
        map.put("Orange", 30);

        Map<String, Integer> sortedMap = new TreeMap<>(map);

        System.out.println(sortedMap);
    }
}
