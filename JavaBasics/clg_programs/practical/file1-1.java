package practical;

class file1 {

    public int ID;
    public String name;
    public String department;
    private double salary;

    static int count_emply = 0;

    public file1() {
        this.ID = 0;
        this.name = "not given";
        this.department = "not specified";
        this.salary = 0.0;
      
        // this(0, "Not Given", "Not Specified", 0.0);
        // System.out.println("Default constructor called!\n");
    }

    public file1(int ID, String name, String department, double salary) {
        this();
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        count_emply++;
    }
    //this () when used both default and parameterized constructor

    public int getID()
    {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void Total_Employee()
     {
        System.out.println("Total number of employees: " + count_emply);
    }
}
