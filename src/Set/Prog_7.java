package Set;

//Main insertion-order using set

import java.util.LinkedHashSet;
import java.util.Set;

public class Prog_7 {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(10);

        System.out.println(set);
    }
}
