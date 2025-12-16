package CodingChallange;

import java.lang.reflect.Array;
import java.util.*;

//convert list to map
public class ListToMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 70);


        Map<Integer,String> map = new HashMap<>();

        for (Integer value : list) {
            map.put(value, value.toString());
        }

        System.out.println(map);
    }
}
