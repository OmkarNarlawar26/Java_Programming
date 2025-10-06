class Demo
{
    public int i;
    static public int j = 21;

    public Demo()
    {
        this.i = 11;
    }

    public void fun()           // Instance Method (Non static)
    {
        System.out.println("fun i : " +this.i);
        System.out.println("fun j : " +Demo.j);
    }

    public static void gun()           // Class Method (Static)
    {
        // System.out.println("fun i : " +this.i);              // Not Allowed
        System.out.println("gun j : " +Demo.j);                 // Allowed (static can access static)
    }

}

class StaticMethod
{
    public static void main(String A[])
    {
        Demo.gun();
        System.out.println(Demo.j);

        Demo dobj = new Demo();

        System.out.println(dobj.i);
        dobj.fun();
    }
}