 package class_programs;
 
 class Bank {
    float rate = 2;
}

class Branch extends Bank {
    int n;
    int t;

    Branch(float rate, int n, int t) {
        this.rate = rate;
        this.n = n;
        this.t = t;
    }
}

class Client extends Branch {
    float A;
    int p = 10000;

    Client(int n, int t, float rate) {
        super(rate, n, t);
    }

    void calculate() {
        // Compound Interest: A = P * (1 + r/n)^(nt)
        A = (float)(p * Math.pow((1 + rate / n), (n * t)));
        System.out.println("The amount is: " + A);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Client c = new Client(5, 3, 2);
        c.calculate();
    }
}
