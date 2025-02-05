package hashmapsandfunctions.twosumproblem;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists in map, return indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        return new int[]{};  // Return empty array if no solution
    }

}

