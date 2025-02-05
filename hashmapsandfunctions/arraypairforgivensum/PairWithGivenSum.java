package hashmapsandfunctions.arraypairforgivensum;

import java.util.*;

public class PairWithGivenSum {
    // Function to check if a pair exists
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            // If the complement is already in the set, a pair exists
            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }

            // Store the current number in the set
            seenNumbers.add(num);
        }

        // If no pair is found
        return false;
    }
}
