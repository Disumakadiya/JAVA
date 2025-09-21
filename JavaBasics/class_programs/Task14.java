import java.util.Scanner;

class myexce extends Exception {
    myexce(String msg) {
        super(msg);
    }
}

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 16)
             {
                throw new myexce("No eligible for license");
            }
             else if (age > 60) 
            {
                throw new myexce("No need for license");
            } else 
            {  // between 16 and 60
                throw new myexce("license is mandatory");
            }
        } catch (myexce e) {
            System.out.println("Exception caught: " + e.getMessage());
        }finally{
            sc.close();
        }
            
        sc.close();
    }
}
