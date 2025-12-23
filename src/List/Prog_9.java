package List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prog_9 {
    public static void main(String[] args) {

        // Create a list of words
        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Spring");
        words.add("API");
        words.add("Micro");
        words.add("DB");

        // Map to group words by their length
        // Key   -> length of word
        // Value -> list of words with that length
        Map<Integer, List<String>> map = new HashMap<>();

        // Iterate through each word
        for (String word : words) {
            // Find length of the word
            int length = word.length();
            // If the length key is not present, create a new list
            if (!map.containsKey(length)) {
                map.put(length, new ArrayList<>());
            }

            // Add the word to the corresponding length group
            map.get(length).add(word);
        }

        // Print the grouped words
        System.out.println(map);
    }
}
