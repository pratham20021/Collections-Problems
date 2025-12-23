package List;


//Remove Duplicates From a List


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prog_1 {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(4);
       list.add(5);

        Set<Integer> set = new HashSet<>(list);
        List<Integer> res = new ArrayList(set);
        System.out.println(res);
        System.out.println(list);
        System.out.println(res.size());

    }
}
