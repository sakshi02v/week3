package single_linkedlist.studentrecord;

class StudentRecordList {
    private Student head;

    // Add a new student
    public void addStudent(int rollNo, String name, int age, char grade, String position, int posIndex) {
        Student newStudent = new Student(rollNo, name, age, grade);

        if (position.equals("beginning")) {
            newStudent.next = head;
            head = newStudent;
        } else if (position.equals("end")) {
            if (head == null) {
                head = newStudent;
            } else {
                Student current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newStudent;
            }
        } else if (position.equals("specific")) {
            if (posIndex <= 0) {
                System.out.println("Invalid position.");
                return;
            }
            Student current = head;
            int count = 1;
            while (current != null && count < posIndex - 1) {
                current = current.next;
                count++;
            }
            if (current != null) {
                newStudent.next = current.next;
                current.next = newStudent;
            } else {
                System.out.println("Position out of bounds.");
            }
        }
    }

    // Delete a student by roll number
    public void deleteStudent(int rollNo) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student with Roll Number " + rollNo + " deleted.");
            return;
        }

        Student current = head;
        while (current.next != null && current.next.rollNo != rollNo) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Student with Roll Number " + rollNo + " deleted.");
        } else {
            System.out.println("Student with Roll Number " + rollNo + " not found.");
        }
    }

    // Search for a student by roll number
    public void searchStudent(int rollNo) {
        Student current = head;
        while (current != null) {
            if (current.rollNo == rollNo) {
                System.out.println("Student Found: Roll No: " + current.rollNo + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNo + " not found.");
    }

    // Display all students
    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("Student Records:");
        Student current = head;
        while (current != null) {
            System.out.println("Roll No: " + current.rollNo + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }

    // Update a student's grade
    public void updateGrade(int rollNo, char newGrade) {
        Student current = head;
        while (current != null) {
            if (current.rollNo == rollNo) {
                current.grade = newGrade;
                System.out.println("Grade updated for Roll Number " + rollNo + ". New Grade: " + newGrade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNo + " not found.");
    }
}