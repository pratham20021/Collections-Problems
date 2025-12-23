package CodingChallange;

import java.util.*;
import java.util.stream.*;

public class ListToMapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "SQL");

        Map<String, Integer> map =
                list.stream()
                        .collect(Collectors.toMap(
                                s -> s,
                                s -> s.length()
                        ));

        System.out.println(map);
    }
}

