package mergesort_sortbookpricesarray;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Object of Scanner
        Scanner input = new Scanner(System.in);

        // Input the size of the array
        System.out.println("enter the number of books");
        int numberOfBooks = input.nextInt();

        int[] booksPrice = new int[numberOfBooks];
        System.out.println("Enter the price of each book: ");
        for(int i=0; i<booksPrice.length; i++) {
            booksPrice[i] = input.nextInt();
        }

        SortPrices.divide(booksPrice,0,booksPrice.length-1);

        // Output
        for(int n:booksPrice) {
            System.out.println(n);
        }
    }
}