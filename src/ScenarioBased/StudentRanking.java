package ScenarioBased;

//Student ranking system using TreeMap

import java.util.Map;
import java.util.TreeMap;

public class StudentRanking {
    public static void main(String[] args) {

        TreeMap<Integer, String> rankMap = new TreeMap<>();

        rankMap.put(85, "Amit");
        rankMap.put(92, "Neha");
        rankMap.put(78, "Rahul");
        rankMap.put(90, "Sneha");
        rankMap.put(88, "Karan");

        for (Map.Entry<Integer, String> entry : rankMap.descendingMap().entrySet()) {
            System.out.println(entry.getValue() + " : " + entry.getKey());
        }
    }
}
