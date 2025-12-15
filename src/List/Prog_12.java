package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog_12 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(60);

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
