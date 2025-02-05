package hashmapsandfunctions.arraypairforgivensum;

import static hashmapsandfunctions.arraypairforgivensum.PairWithGivenSum.hasPairWithSum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        if (hasPairWithSum(arr, target)) {
            System.out.println("Pair exists.");
        } else {
            System.out.println("No pair found.");
        }
    }
}


