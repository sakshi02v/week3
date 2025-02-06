package binarysearch.indexofsmallestelement;

public class SmallestElementIndex {
    public static int rotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return left; //smallest element's index
    }
}