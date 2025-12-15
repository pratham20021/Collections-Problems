package List;

//Find size of a List without using size()

import java.util.Arrays;
import java.util.List;

public class Prog_13 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        int count = 0;

        for (Integer i : list) {
            count++;
        }

        System.out.println(count);
    }
}
