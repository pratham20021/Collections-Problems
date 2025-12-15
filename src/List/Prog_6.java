package List;


//Common ELements in the List

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prog_6 {
    public static void main(String[] args) {

        // First list
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        // Second list
        List<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        // Convert first list into a Set
        Set<Integer> set = new HashSet<>(list1);

        // Retain only common elements
        set.retainAll(list2);

        // Print common elements
        System.out.println(set);
    }
}
