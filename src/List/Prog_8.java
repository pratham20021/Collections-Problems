package List;

//Find Second-Largest Element

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog_8 {
    public static void main(String[] args) {

        // Create a list
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(30);
        list.add(50);

        // Sort the list in ascending order
        Collections.sort(list);

        // Second largest element
        int secondLargest = list.get(list.size() - 2);

        // Print result
        System.out.println(secondLargest);
    }
}
