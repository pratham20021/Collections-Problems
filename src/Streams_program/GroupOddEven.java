package Streams_program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOddEven {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        Map<String, List<Integer>> result =
                list.stream()
                        .collect(Collectors.groupingBy(
                                n -> n % 2 == 0 ? "Even" : "Odd"
                        ));

        System.out.println(result);
    }
}

