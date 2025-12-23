package Streams_program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeMax {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 45, 20, 70, 30, 90, 60);

        List<Integer> top3 = list.stream()
                .sorted((a, b) -> b - a)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(top3);
    }
}


