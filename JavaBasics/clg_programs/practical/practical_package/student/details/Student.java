package student.details;

public class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    // Display method
    public void displayStudent() {
        System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }
}