package selectionsort_sortexamscores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // input the number of students whose score is to be recorded and sorted
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();

        // Array to store the scores
        int[] scores = new int[numberOfStudents];

        System.out.println("Enter the scores for each student: ");
        for(int i=0; i<scores.length; i++) {
            scores[i] = input.nextInt();
        }

        // Call the method to sort the array
        SortExamScores.sortScores(scores);

        // output
        for(int n:scores) {
            System.out.println(n);
        }
    }
}