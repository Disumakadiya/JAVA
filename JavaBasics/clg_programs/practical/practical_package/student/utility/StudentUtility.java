package student.utility;

public class StudentUtility {

    // Grade calculation based on marks
    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A"; 
        }else if (marks >= 75) {
            return "B"; 
        }else if (marks >= 50) {
            return "C"; 
        }else {
            return "Fail";
        }
    }

    // Simple validation (name not empty, marks between 0-100)
    public static boolean validateStudent(String name, int marks) {
        return (name != null && !name.isEmpty() && marks >= 0 && marks <= 100);
    }
}
