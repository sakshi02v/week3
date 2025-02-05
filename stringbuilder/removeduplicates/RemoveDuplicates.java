package stringbuilder.removeduplicates;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> duplicate = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!duplicate.contains(currentChar)) {
                result.append(currentChar);
                duplicate.add(currentChar);
            }
        }
        return result.toString();
    }

}

