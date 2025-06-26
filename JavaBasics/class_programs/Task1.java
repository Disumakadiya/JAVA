package class_programs;

class Interest
{
    int principalAmount;
    float rate;
    float t;
    float interest(int principalAmount,float rate,float t)
    {
        return (principalAmount*rate*t)/100;
    }
}
class Maximum
{
    int a,b,c;
    int max(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
         else if(b>a && b>c)
         {
            return b;
        }
        else
        {
            return c;
        }
    }

}
public class Task1 
{
    public static void main(String[] args)
    {
        Interest I = new Interest();
        I.principalAmount = 100;
        I.rate = 2.4f;
        I.t = 3f;
        System.out.println(I.interest(I.principalAmount,I.rate,I.t));

        Maximum m = new Maximum();
        m.a = 11;
        m.b = 29;
        m.c = 7;
        System.out.println(m.max(m.a,m.b,m.c)); 
    }
}