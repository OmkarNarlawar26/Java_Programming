class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method");
    }
}

class ThreadUserDefined2
{
    public static void main(String A[])
    {
        System.out.println("Inside main Thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.start();                  // Here start calls directly run
        dobj2.start();                  

        System.out.println("End of main Thread");
   }
}