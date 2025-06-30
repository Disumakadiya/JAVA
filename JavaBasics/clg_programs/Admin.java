package clg_programs;

//import CLG.Student; // Assuming Student class is in the same package
public class Admin 
{
    
    public static void main(String[] args) 
    {
      
        System.out.println("Admin operations can be performed here.");
        Sum sum = new Sum();
        int result = sum.add(5, 10);    
        System.out.println("Sum of 5 and 10 is: " + result);
        // You can add more admin-related operations here
    }
}
//how to run java code without main method and from which version it is restricted