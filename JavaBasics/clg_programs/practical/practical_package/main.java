import student.services.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        // Register Students
        service.registerStudent(1, "Nobita", 92);
        service.registerStudent(2, "Shizuka", 78);
        service.registerStudent(3, "", 105);  // Invalid

        // List Students
        System.out.println("\n Student List:");
        service.listStudents();

        // Search Student
        System.out.println("\n Searching Student:");
        service.searchStudent(2);
        service.searchStudent(10);
    }
}