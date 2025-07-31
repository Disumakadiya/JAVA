import calc.Task9_Divide;
import calc.Task9_Mul;
import calc.Task9_Sub;
import calc.Task9_add;

public class Main
{
    public static void main(String[] args)
     {
        Task9_add a = new Task9_add();
        System.out.println("Addition: " + a.add(4, 3));

        Task9_Sub s = new Task9_Sub();
        System.out.println("Subtraction: " + s.sub(4, 3));

        Task9_Mul m = new Task9_Mul();
        System.out.println("Multiplication: " + m.mul(4, 3));

        Task9_Divide d = new Task9_Divide();
        System.out.println("Division: " + d.divide(4, 2));
    }
}