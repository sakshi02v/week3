package stackandqueue.slidingwindowmaximum;

import java.util.*;

public class slidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1]; // Output array
        Deque<Integer> deque = new LinkedList<>(); // Stores indices of useful elements

        for (int i = 0; i < n; i++) {
            // Remove elements that are out of this window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove all elements smaller than the current element (they won't be needed)
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add current index to deque
            deque.offer(i);

            // Store the max in result array (only when we reach at least index k-1)
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        return result;
    }
}
