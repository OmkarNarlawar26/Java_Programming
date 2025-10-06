
interface Demo
{
    int No = 11;                            // this is by default public, static, final
    void Display();                         // this is by default public, abstract
}

class Hello implements Demo
{
   public void Display() 
   {
    System.out.println("Inside Display");
   }
}

class InterfaceDemo3
{
    public static void main(String A[])
    {
        System.out.println(Demo.No);            // No is public and static
        // Demo.no = 12;                        // No is final
        Hello hobj = new Hello();

        hobj.Display();

    }
}