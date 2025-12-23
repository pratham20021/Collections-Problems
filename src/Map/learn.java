package Map;

import java.util.HashMap;
import java.util.Map;

public class learn {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();

        map.put("icecream", 20);
        map.put("pencil", 10);
        map.put("pen", 25);
        map.put("coffee", 10);
        map.put("cherry", 10);
        map.put("apple", 10);
        map.put("orange", 10);

        System.out.println(map);
        System.out.println(map.get("pen"));
        System.out.println(map.get("coffee"));

        for (String name : map.keySet()) {
            System.out.println(name);
        }

        for(Integer value : map.values()) {
            System.out.println(map.get(value));
        }

        // fimd highest stock
          int result = map.values().stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(result);

        //filter all the stocks whose price is greater than 1 lakh
        System.out.println("stock price >20");
        map.entrySet().stream().filter(e -> e.getValue() > 20).forEach(e-> System.out.println(e.getKey()+"HAS PRICE OF "+e.getValue()));


    }
}
