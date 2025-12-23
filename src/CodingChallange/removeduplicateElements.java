package CodingChallange;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//remove duplicate elements in a List
public class removeduplicateElements {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);

        Set<Integer> set = new HashSet(list);
        System.out.println(list);
        System.out.println(set);

    }
}
