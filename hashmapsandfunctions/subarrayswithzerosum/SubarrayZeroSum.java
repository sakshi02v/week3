package hashmapsandfunctions.subarrayswithzerosum;

import java.util.*;

public class SubarrayZeroSum {
    // Function to find all subarrays with a sum of zero
    public static List<List<Integer>> findZeroSumSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>(); // Stores all subarrays
        Map<Integer, List<Integer>> sumMap = new HashMap<>(); // Stores sum -> list of indices
        int cumulativeSum = 0;

        // Add an initial entry for sum = 0 at index -1 (helps handle cases where subarray starts at index 0)
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i]; // Compute cumulative sum

            // If this sum has been seen before, all subarrays between previous indices and current form zero-sum subarrays
            if (sumMap.containsKey(cumulativeSum)) {
                for (int startIndex : sumMap.get(cumulativeSum)) {
                    result.add(Arrays.asList(startIndex + 1, i)); // Store start and end index of subarray
                }
            }

            // Add current index to sumMap
            sumMap.putIfAbsent(cumulativeSum, new ArrayList<>());
            sumMap.get(cumulativeSum).add(i);
        }

        return result;
    }
}


