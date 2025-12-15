package List;

/* Remove duplicates from List without using Set */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog_14 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 50);

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer i : list) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }

        System.out.println(uniqueList);
    }
}
