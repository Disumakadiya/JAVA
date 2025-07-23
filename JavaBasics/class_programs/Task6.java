package class_programs;

interface Example
{
    boolean pass(int marks);
}

interface Classify
{
    String Division(float average);
}

class Result implements Example,Classify
{
    int m1,m2,m3;
    Result (int m1, int m2, int m3){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
     @Override
     public boolean pass(int marks)
      {
        return marks >= 50;
    }

    @Override
    public String Division(float average)
     {
        if (average >= 60) 
        {
            return "First Division";
        } 
        else if (average >= 50) 
        {
            return "Second Division";
        }
        else
        {
            return "no Division";
        }
    }

    public void display()
    {
        float average = (m1 + m2 + m3) / 3.0f;
        System.out.println("Average: " + average);
        System.out.println("Division: " + Division(average));
        System.out.println("Pass Status: " + (pass((int) average) ? "Passed" : "Failed"));
    }
}

public class Task6
{
    public static void main(String[] args) 
    {
        Result result = new Result(70, 80, 90);
        result.display();
    }
}


