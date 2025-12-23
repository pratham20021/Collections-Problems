package List;


//Sort a list
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog_4{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);

        Collections.sort(list);

        System.out.println(list);
    }
}
