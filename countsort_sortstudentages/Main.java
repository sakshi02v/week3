package countsort_sortstudentages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // input the number of students
        System.out.println("Enter the number of students whose age is to be stored: ");
        int size = input.nextInt();

        System.out.println("Enter the age of each student: ");
        int[] ages = new int[size]; // Store ages of student

        for(int i=0; i<size ;i++) {
            ages[i] = input.nextInt();
        }

        // Call method to sort the array
        SortStudentsAge.ageSort(ages);

        // Output
        for(int age:ages) {
            System.out.println(age);
        }
    }
}