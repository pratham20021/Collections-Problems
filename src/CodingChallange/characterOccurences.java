package CodingChallange;
//count the character occurence
import java.util.HashMap;
import java.util.Map;

public class characterOccurences {
    public static void main(String[] args) {

        String str = "prathamesh";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);

    }
}



