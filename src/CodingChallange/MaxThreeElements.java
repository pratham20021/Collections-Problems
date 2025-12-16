package CodingChallange;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxThreeElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 70);

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
