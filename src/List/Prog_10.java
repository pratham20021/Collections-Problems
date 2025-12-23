package List;

//Count word frequency

import java.util.HashMap;
import java.util.Map;

public class Prog_10 {
    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful";

        String[] words = sentence.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
