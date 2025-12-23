package List;
//Reverse a List
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog_7 {
    public static void main(String[] args) {

        // Create a list
        List<String> list = new ArrayList<>();
        list.add("Prathamesh");
        list.add("Aman");
        list.add("Subodh");
        list.add("Harsh");

        // Reverse the list
        Collections.reverse(list);

        // Print reversed list
        System.out.println(list);
    }
}
