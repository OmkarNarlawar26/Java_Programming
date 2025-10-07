class Hello
{
    public int i;

    public Hello(int no)
    {
        System.out.println("Inside Hello Constructor");
        this.i = no + 1;
    }

    public void Display()
    {
        System.out.println("Inside Hello Display");
    }

}

class Demo extends Hello
{
    public int i;

    public Demo(int a)
    {
        super(a);               // first use
        System.out.println("Inside Demo Constructor");
        this.i = a;
    }

    public void Display()
    {
        int i = 0;
        System.out.println("Insdie Display "+i);                // 0
        System.out.println("Insdie Display "+this.i);          // 51
        System.out.println("Insdie Display "+super.i);         // 52     // Second use
        super.Display();                                       // Third use
    }
}

class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();

    }
}