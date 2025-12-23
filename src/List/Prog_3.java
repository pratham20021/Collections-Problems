package List;
//Find Frequency of Elements
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prog_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(10);

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer value : list) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        System.out.println(map);
    }
}

