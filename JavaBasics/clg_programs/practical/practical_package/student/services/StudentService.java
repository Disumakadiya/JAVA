package student.services;

import student.details.Student;
import student.utility.StudentUtility;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    // Register student
    public void registerStudent(int id, String name, int marks) {
        if (StudentUtility.validateStudent(name, marks)) {
            Student s = new Student(id, name, marks);
            students.add(s);
            System.out.println("✅ Student Registered Successfully!");
        } else {
            System.out.println("❌ Invalid student details!");
        }
    }

    // List all students
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students registered yet.");
        } else {
            for (Student s : students) {
                s.displayStudent();
                System.out.println("Grade: " + StudentUtility.calculateGrade(s.getMarks()));
            }
        }
    }

    // Search student by ID
    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("🔍 Student Found:");
                s.displayStudent();
                return;
            }
        }
        System.out.println("❌ Student with ID " + id + " not found!");
    }
}