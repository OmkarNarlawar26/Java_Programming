
interface Demo
{
    int No = 11;
    void Display();
}

abstract class Hello implements Demo
{
    // ERROR 
}

class InterfaceDemo2
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
    }
}