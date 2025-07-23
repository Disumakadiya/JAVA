package class_programs;

interface A
{ 
    void display(int a);
}

interface B extends A{
    void display (float b);
}

interface C extends A{
    void display (double c);
}

interface D extends B,C
{
    void display (long d);
}

class E implements D{
    private int a ;
    private float b;
    private double c;
    private long d;

    @Override
    public void display(int a) {
        this.a = a;
        System.out.println("Display from interface A: " + a);
    }
    @Override
    public void display(float b) {
        this.b = b;
        System.out.println("Display from interface B: " + b);
    }
    @Override
    public void display(double c) {
        this.c = c;
        System.out.println("Display from interface C: " + c);
    }
    @Override
    public void display(long d) {
        this.d = d;
        System.out.println("Display from interface D: " + d);
    }

    public void display() {
        System.out.println("Display from class E");
    }
    public void display(String s) {
        System.out.println("Display from class E with String: " + s);
    }

     public void calculate() {
        double result = a * b * c * d;
        System.out.println("Result of a * b * c * d = " + result);
    }
}

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Interfaces and Inheritance Example");

        E e = new E();
        e.display(10);
        e.display(10.5f);
        e.display(20.5);
        e.display(100L);  
        e.display(); 
        e.calculate();
     // Calls the method with no parameters
    }
}
