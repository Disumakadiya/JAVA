package class_programs;
import java.util.Scanner;

interface intvalue {
    double getAmount();  // all fuel types will return their refuelled amount
}

class f95 implements intvalue {
    private double amount;

    f95(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class f98 implements intvalue {
    private double amount;

    f98(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class diesel implements intvalue {
    private double amount;

    diesel(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

public class Task10 {

    static double total = 0;
    static double total95 = 0;
    static double total98 = 0;
    static double totalDiesel = 0;

    // Instance method for refuelling
    public void refuel(int choice, double amount) {
        intvalue fuel;

        switch (choice) {
            case 1:
                fuel = new f95(amount);
                total95 += fuel.getAmount();
                break;
            case 2:
                fuel = new f98(amount);
                total98 += fuel.getAmount();
                break;
            case 3:
                fuel = new diesel(amount);
                totalDiesel += fuel.getAmount();
                break;
            default:
                System.out.println("Invalid fuel type.");
                return;
        }
        total += amount;
    }

    // Class methods to print usage
    public static void printTotal() {
        System.out.println("Total used fuel: " + total);
    }

    public static void printF95() {
        System.out.println("Total used 95 octane fuel: " + total95);
    }

    public static void printF98() {
        System.out.println("Total used 98 octane fuel: " + total98);
    }

    public static void printDiesel() {
        System.out.println("Total used diesel fuel: " + totalDiesel);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Task10 meter = new Task10();

        while (true) {
            System.out.print("What do you want: 1=95, 2=98, 3=Diesel (type any other number to quit): ");
            int choice = sc.nextInt();
            if (choice < 1 || choice > 3) break;

            System.out.print("How much do you want to refuel: ");
            double amount = sc.nextDouble();

            meter.refuel(choice, amount);
        }

        System.out.println("\n===== Fuel Usage Summary =====");
        printTotal();
        printF95();
        printF98();
        printDiesel();
    }
}
