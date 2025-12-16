package CodingChallange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Sort a List
public class SortaList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(4);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);
    }
}
