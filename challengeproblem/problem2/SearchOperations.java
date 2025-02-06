package challengeproblem.problem2;

public class SearchOperations {

    // Function to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap to place elements in correct positions
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    // Binary Search Function
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1}; // Example input for missing positive number
        int[] arr = {2, 3, 5, 7, 11, 13}; // Example sorted array for binary search
        int target = 7; // Target to find

        // Finding the first missing positive integer
        int missing = findFirstMissingPositive(nums);
        System.out.println("First missing positive integer: " + missing);

        // Performing binary search
        int index = binarySearch(arr, target);
        System.out.println("Index of target " + target + ": " + index);
    }
}
