package patterns;
import java.util.Scanner;

//reverse inverted alphabet input pattern
public class Pattern8 {
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) 
        {
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt();
            char alpha = 'Z';
            for (int i = 0; i < rows; i++)
             {
                for (int j = 0; j < rows - i; j++)
                {
                    System.out.print(alpha + " ");
                    alpha--;    
                }
                System.out.println();
                alpha = (char) ('Z' - i - 1);
            }
        }
    }
}
