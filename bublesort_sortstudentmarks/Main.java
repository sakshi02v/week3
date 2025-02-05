package bublesort_sortstudentmarks;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create the scanner object
        Scanner input = new Scanner(System.in);

        // input the number of students
        System.out.println("Enter number of students");
        int numberOfStudents = input.nextInt();

        // input the student marks
        int[] marks = new int[numberOfStudents];

        System.out.println("Enter marks of each student: ");
        for(int i=0; i< marks.length; i++){
            marks[i] = input.nextInt();
        }

        // Call method to get the output
        Object sortStudents;
        int[] sortedMarks = sortStudents.sortStudent(marks);

        // Output
        for(int mark:sortedMarks) {
            System.out.println(mark);
        }
    }
}
