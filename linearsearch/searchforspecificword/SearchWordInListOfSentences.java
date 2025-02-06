package linearsearch.searchforspecificword;

import java.util.Scanner;
public class SearchWordInListOfSentences {
    public static String searchWord(String[] arr, String target) {
        for (String sentence:arr) {
            String[] words = sentence.split("\\s+");
            for (String s : words) {
                if (s.equals(target)) {
                    return sentence;
                }
            }
        }
        return "not found";
    }
}
