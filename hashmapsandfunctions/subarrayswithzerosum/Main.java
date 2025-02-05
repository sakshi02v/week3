package hashmapsandfunctions.subarrayswithzerosum;

import java.util.List;
import static hashmapsandfunctions.subarrayswithzerosum.SubarrayZeroSum.findZeroSumSubarrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

        List<List<Integer>> subarrays = findZeroSumSubarrays(arr);
        System.out.println("Subarrays with zero sum:");
        for (List<Integer> subarray : subarrays) {
            System.out.println("Start: " + subarray.get(0) + ", End: " + subarray.get(1));
        }
    }
}
