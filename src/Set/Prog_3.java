package Set;
/* Find duplicate elements using Streams + Set */
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Prog_3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 50);

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates =
                list.stream()
                        .filter(e -> !seen.add(e))
                        .collect(Collectors.toSet());

        System.out.println(duplicates);
    }
}
