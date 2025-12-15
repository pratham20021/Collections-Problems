

//Convert List to Set & Set to List
package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prog_1 {
    public static void main(String[] args) {

        // Create a List with duplicate elements
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        // Convert List to Set (removes duplicates)
        Set<Integer> set = new HashSet<>(list);

        // Convert Set back to List
        List<Integer> newList = new ArrayList<>(set);

        // Print results
        System.out.println("Original List : " + list);
        System.out.println("Converted Set : " + set);
        System.out.println("Converted List: " + newList);
    }
}

