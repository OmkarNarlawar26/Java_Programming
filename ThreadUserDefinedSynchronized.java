class Tableprinter
{
    public void printTable(int n)
    {
        int i = 0;

        for(i = 1; i<= 10; i++)
        {
            System.out.println("Name : "+Thread.currentThread().getName()+" :"+n*i);
        }
    }
}
class Demo extends Thread
{
    public void run()
    {
        
    }
}

class ThreadUserDefinedSynchronized
{
    public static void main(String A[])
    {
        Tableprinter tobj = new Tableprinter();
        tobj.printTable(5);
        tobj.printTable(4);
    }
}