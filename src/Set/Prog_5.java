package Set;

/* Find intersection of two Sets */

import java.util.HashSet;
import java.util.Set;

public class Prog_5 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        Set<Integer> set2 = new HashSet<>();
        set2.add(20);
        set2.add(30);
        set2.add(40);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println(intersection);
    }
}
