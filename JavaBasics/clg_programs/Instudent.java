package clg_programs;

interface Instudent{
    public void display();
    default void SetName(String name)//Institute can display this method if needed or can ignore
    {
        System.out.println(name);//implements only one time in program
    }
}