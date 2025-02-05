package quicksort_sortproductprices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Object of Scanner
        Scanner input = new Scanner(System.in);

        // Input size of array
        System.out.println("Enter the number of product");
        int size = input.nextInt();

        // Array to store the price of product
        int[] productsPrice = new int[size];

        System.out.println("Enter the prices of each product");
        for(int i=0; i<productsPrice.length; i++) {
            productsPrice[i] = input.nextInt();
        }

        // call mehtod to sort the array
        SortProductPrices.quickSort(productsPrice, 0, productsPrice.length-1);

        // output
        for(int n:productsPrice) {
            System.out.println(n);
        }
    }
}