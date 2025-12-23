package Set;

//Find unique characters in a String using Set

import java.util.LinkedHashSet;
import java.util.Set;

public class Prog_10 {
    public static void main(String[] args) {

        String str = "programming";

        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            uniqueChars.add(ch);
        }

        System.out.println(uniqueChars);
    }
}

