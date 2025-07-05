package patterns;
public class Pattern6
{
    // FloydTriangle 
    public static void main(String[] args) 
    {
        int n = 5;  
        int num = 1;

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.printf("%02d ", num);
                num++;
            }
            System.out.println(); 
        }
    }
}
