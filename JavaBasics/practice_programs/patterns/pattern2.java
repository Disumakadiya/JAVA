package patterns;  // ✅ Add this if your file is in the "patterns" folder

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { 
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt();

            for (int i = rows; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
