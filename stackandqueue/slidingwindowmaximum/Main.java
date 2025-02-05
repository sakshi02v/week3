package stackandqueue.slidingwindowmaximum;
import  java.util.*;
import static stackandqueue.slidingwindowmaximum.slidingWindow.maxSlidingWindow;

public class Main {
public static void main(String[] args) {
    int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;

    int[] result = maxSlidingWindow(nums, k);
    System.out.println("Sliding Window Maximum: " + Arrays.toString(result));
}
}