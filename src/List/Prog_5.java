package List;


// Convert Array to list

import java.util.Arrays;
import java.util.List;

public class Prog_5
{
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};
        Integer[] nums = {1, 2, 3, 4, 5};

        List<String> list = Arrays.asList(arr);
        List<Integer> list2 = Arrays.asList(nums);

        System.out.println(list);
        System.out.println(list2);
    }
}
