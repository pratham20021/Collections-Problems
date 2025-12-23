package Streams_program;

import java.util.Arrays;
import java.util.List;

public class SecondSmallest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 5, 20, 8, 5, 30);

        int secondSmallest = list.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondSmallest);
    }
}
