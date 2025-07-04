package patterns;
import java.util.Scanner;
public class Pattern5
{
    public static void main(String[] args) 
    {
        try (java.util.Scanner input = new Scanner(System.in))
        {
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt();

            for(int i=1;i<=rows;i++)
            {
                for(int j=1;j<=rows ;j++)
                {
                    if(i==1||i==rows||j==1||j==rows)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}