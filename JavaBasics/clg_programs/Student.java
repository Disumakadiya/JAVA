package clg_programs;

public class Student extends Institute 
{
    String sID;
    String sName;
    String sem;
    
    public Student(){
        this("", "", ""); // Call parameterized constructor with default values
        System.err.println("This is Student class");
    }
    
    public Student(String sID, String sName, String sem) {
        super(); // Call paren class default constructor
        this.sID = sID;
        this.sName = sName;
        this.sem = sem;
    }
    
    public Student(int icode, String sID, String sName, String sem) {
        super(icode); // Call parent class constructor with icode parameter
        this.sID = sID;
        this.sName = sName;
        this.sem = sem;
    }
    
    public Student(int icode, String iname, String sID, String sName, String sem) {
        super(icode, iname); // Call parent class constructor with icode and iname
        this.sID = sID;
        this.sName = sName;
        this.sem = sem;
    }
    
    public void displayStudent() {
        System.out.println("Student ID: " + sID);
        System.out.println("Student Name: " + sName);
        System.out.println("Semester: " + sem);
        display(); // Call parent class display method
    }
}