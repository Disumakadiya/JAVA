package class_programs;

interface A
{ 
    int display(int a);
}

interface B extends A{
    @Override
    public int display(int a);
    
    float display (int b);
}

interface C extends A{

}

interface D implements  B,C
{

}

class E implements D{

}


