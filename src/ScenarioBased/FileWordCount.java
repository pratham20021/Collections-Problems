package ScenarioBased;

//File word count program using Map

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FileWordCount {
    public static void main(String[] args) {

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+");

                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print(wordCount);
    }
}
