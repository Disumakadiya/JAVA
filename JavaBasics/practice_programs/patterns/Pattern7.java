	// Pyramid Alphabet Pattern
    package patterns;
    import java.util.Scanner;

public class Pattern7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: "); 

        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for( int sp=1;sp<=n-i;sp++)
            {
                System.out.print("  "); 
            }

            char ch='A';
            for(int j=1;j<=i;j++)//forr increasing the character
            {
                System.out.print(ch + " "); 
                ch++; 
            }

            ch-=2;
            for(int j=1;j<i;j++)//for decreasing the character
            {
                System.out.print(ch + " "); 
                ch--; 
            }
            System.out.println();
        }

    }
}