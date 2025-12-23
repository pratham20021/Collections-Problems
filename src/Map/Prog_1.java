package Map;
//iterate through the map
import java.util.HashMap;
import java.util.Map;

public class Prog_1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Java");
        map.put(102, "Spring");
        map.put(103, "MongoDB");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
