package clg_programs;

public class Institute implements Instudent
{
    int icode;
    public static String iname = null;
    public final String location = "CHARUSAT";
    
    public Institute(){
        this(0); // Call parameterized constructor with default value
        System.out.println("Welcome to CSPIT, CHARUSAT");
    }
    
    public Institute(int icode) {
        this.icode = icode;
        System.out.println("Institute created with code: " + icode);
    }
    
    public Institute(int icode, String iname) {
        this(icode); // Call constructor with icode
        Institute.iname = iname;
        System.out.println("Institute created with name: " + iname);
    }
    
    public void display() 
    {
        System.out.println("Institute Code: " + icode);
        System.out.println("Institute Name: " + iname);
        System.out.println("Location: " + location);
    }

    public void SetName(String name);
}