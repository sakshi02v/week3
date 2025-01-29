package single_linkedlist.studentrecord;

public class MainClass {
    public static void main(String[] args) {
        StudentRecordList manager = new StudentRecordList();

        // Adding students
        manager.addStudent(1, "Alice", 20, 'A', "beginning", 0);
        manager.addStudent(2, "Bob", 22, 'B', "end", 0);
        manager.addStudent(3, "Charlie", 21, 'C', "end", 0);
        manager.addStudent(4, "Diana", 23, 'A', "specific", 2);

        // Display all students
        manager.displayStudents();

        // Search for a student
        manager.searchStudent(3);

        // Update a student's grade
        manager.updateGrade(2, 'A');

        // Delete a student record
        manager.deleteStudent(1);

        // Display all students after updates
        manager.displayStudents();
    }
}
