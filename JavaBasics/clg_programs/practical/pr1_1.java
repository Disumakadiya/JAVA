package clg_programs.practical;
import java.util.Scanner;

class pr1_1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Management System");
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        file1_1 count = new file1_1();
        file1_1[] emp = new file1_1[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nEnter the details of employee " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // consume newline

            emp[i] = new file1_1(id, name, department, salary);
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Employee " + (i + 1) + ":");
            emp[i].display();
        }

        count.Total_Employee();

        sc.close();
    }
}
