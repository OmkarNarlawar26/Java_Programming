interface A
{
    int no = 11;
    void fun();

    private void Display()
    {
        System.out.println("Inside Private Display");
    }
    default void gun()
    {
        System.out.println("Inside gun");
        Display();
    }
}

class Demo implements A
{
    public void fun()
    {
        System.out.println("Inside fun ");
    }
}

class InterfaceDemo9
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
        // dobj.Display();       // ERROR
    }
}