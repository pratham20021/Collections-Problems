package Map;

//Count frequency of elements in an array using Map

import java.util.HashMap;
import java.util.Map;

public class Prog_4 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
