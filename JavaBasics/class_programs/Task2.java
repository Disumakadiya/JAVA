import java.util.Scanner;

class Student {
    int roll;
    String name;

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Name of student: " + name);
        System.out.println("Roll no is: " + roll);
    }
}

class Exam extends Student {
    int s1, s2, s3;


    Exam(int r, String n, int s1, int s2, int s3) {
        super(r, n); // calling parent constructor
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    void result() {
        float marks = (s1 + s2 + s3) / 3.0f;

        display(); 
        if (s1 < 50|| s2 < 50 || s3 < 50) {
            System.out.println("You have failed in one or more subjects.");
        } 
        else if (marks < 40) {
            System.out.println("Result: Fail");
        } 
        else
         {
            System.out.println("Result: Pass ");
            System.out.println("Percentage: " + marks + "%");
        }
    }
}

public class Task2 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks in subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks in subject 3: ");
        int s3 = sc.nextInt();

        // Creating object
        Exam ex = new Exam(roll, name, s1, s2, s3);
        ex.result();
    }
}
