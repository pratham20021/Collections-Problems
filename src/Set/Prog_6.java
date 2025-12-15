package Set;

//Find difference between two Sets

import java.util.HashSet;
import java.util.Set;

public class Prog_6 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        Set<Integer> set2 = new HashSet<>();
        set2.add(20);
        set2.add(40);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println(difference);
    }
}
