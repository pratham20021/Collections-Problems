package Streams_program;
import java.util.Arrays;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 45, 20, 5, 90, 30);

        int min = list.stream().min(Integer::compareTo).get();
        int max = list.stream().max(Integer::compareTo).get();

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}

