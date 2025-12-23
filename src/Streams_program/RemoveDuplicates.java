package Streams_program;

//remove dupliccate


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 50);

        List<Integer> result = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
