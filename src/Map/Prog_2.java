package Map;

//Find first non-repeating character
import java.util.LinkedHashMap;
import java.util.Map;

public class Prog_2 {
    public static void main(String[] args) {
        String str = "amanm";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
