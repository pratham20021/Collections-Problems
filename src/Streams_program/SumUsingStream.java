package Streams_program;

import java.util.Arrays;
import java.util.List;

public class SumUsingStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}

