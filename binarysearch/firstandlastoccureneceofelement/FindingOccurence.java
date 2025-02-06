package binarysearch.firstandlastoccureneceofelement;

class FindingOccurrence {

    // Binary search to find the first occurrence of the target
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Update result
                right = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Binary search to find the last occurrence of the target
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Update result
                left = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Function to find both the first and last occurrence of the target
    public static int[] findFirstAndLast(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = findFirstOccurrence(arr, target);  // First occurrence
        result[1] = findLastOccurrence(arr, target);   // Last occurrence

        // If target is not found at all
        if (result[0] == -1) {
            return new int[]{-1, -1}; // Return -1, -1 if not found
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 4, 5, 6};
        int target = 2;

        int[] result = findFirstAndLast(arr, target);
        System.out.println("First Occurrence: " + result[0]); // Output: 1
        System.out.println("Last Occurrence: " + result[1]);  // Output: 3

    }
}
