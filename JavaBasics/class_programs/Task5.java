package class_programs;

interface Add {

    int add(int a, int b);
}

interface Subtract {

    int sub(int a, int b);
}

interface Multiply {

    int mul(int a, int b);
}

interface Divide {

    int div(int a, int b);
}

class Calculator implements Add, Subtract, Multiply, Divide {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class Task5 {

    public static void main(String args[]) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(3, 4));
        System.out.println(c1.sub(7, 3));
        System.out.println(c1.mul(7, 8));
        System.out.println(c1.div(40, 8));
    }
}
