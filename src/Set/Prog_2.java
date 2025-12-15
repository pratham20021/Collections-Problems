package Set;
//Count number of elements in a Set
import java.util.HashSet;
import java.util.Set;

public class Prog_2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        int count = set.size();
        System.out.println(count);
    }
}