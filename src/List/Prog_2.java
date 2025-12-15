package List;


//Remove Duplicates String From a List


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prog_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("d");
        list.add("b");
        list.add("f");
        list.add("c");


        Set<String> set = new HashSet<>(list);
        List<String> res = new ArrayList(set);
        System.out.println(res);
        System.out.println(list);
        System.out.println(res.size());

    }
}
