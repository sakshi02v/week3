package hashmapsandfunctions.longestconsecutivesequence;

import static hashmapsandfunctions.longestconsecutivesequence.LongestConsecutiveSequence.longestConsecutive;

public class Main {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums));
    }
}

