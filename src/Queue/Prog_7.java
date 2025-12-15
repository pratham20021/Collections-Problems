package Queue;
//Find first non-repeating character in a String using Queue
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
import java.util.Map;

public class Prog_7 {
    public static void main(String[] args) {

        String str = "Prathamesh";

        Queue<Character> queue = new LinkedList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            queue.add(ch);
        }

        while (!queue.isEmpty()) {
            char ch = queue.poll();
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
