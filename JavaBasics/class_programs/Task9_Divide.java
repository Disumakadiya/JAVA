package calc;

public class Task9_Divide {
    public int divide(int a, int b)
     {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
