package insertionsort_sortemployeesid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner object to take the input
        Scanner input = new Scanner(System.in);

        // input the size of the array
        System.out.println("Enter the size of array:");
        int size = input.nextInt();

        // Declare array
        int[] arr = new int[size];

        // input array
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Call method of IsertionSort class to get the sorted array
        int[] ans = InsertionSort.insertionSort(arr);

        // Output
        for(int n:arr) {
            System.out.println(n);
        }
    }
}
