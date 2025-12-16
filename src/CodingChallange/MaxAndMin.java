package CodingChallange;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 70);

        int max = list.get(0);
        int min = list.get(0);

        for (Integer value : list) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
