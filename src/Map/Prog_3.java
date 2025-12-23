package Map;

import java.util.*;

public class Prog_3 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Banana");
        map.put(2, "Apple");
        map.put(3, "Mango");
        map.put(4, "Grapes");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));

        Map<Integer, String> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);
    }
}
