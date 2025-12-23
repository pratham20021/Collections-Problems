package CodingChallange;

import java.util.*;

// Find duplicate elements in a List
public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(4);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer i : list) {
            if (!seen.add(i)) {
                duplicates.add(i);
            }
        }

        System.out.println(duplicates);


    }
}
