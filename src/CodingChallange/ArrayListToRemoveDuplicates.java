package CodingChallange;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListToRemoveDuplicates {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("2");
        list.add("3");

        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);

    }
}
