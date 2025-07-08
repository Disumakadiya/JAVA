package patterns;
import java.util.Scanner;

public class checkboard
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // Create Scanner

        System.out.print("Enter the size of the checkerboard: ");
        int n = sc.nextInt(); 

        for (int i=1; i<=n;i++) 
        {
            for (int j = 1; j <= n; j++)
             {
                if ((i + j)%2==0)//alternate row column odd=0 and even =1
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println(); //each new line 
        }
    }
}