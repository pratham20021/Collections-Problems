package Set;


//Check if a List contains duplicates


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prog_8 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40,20);

        Set<Integer> set = new HashSet<>(list);

        boolean hasDuplicates = list.size() != set.size();

        System.out.println(hasDuplicates);
    }
}
