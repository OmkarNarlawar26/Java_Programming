class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of : "+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinSerialAlive
{
    public static void main(String A[])
    {
        System.out.println("Inside main Thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        // Checked Exception
        try
        {
            dobj1.start();
            System.out.println("Is First Thread alive ? : "+dobj1.isAlive());
            dobj1.join();
            System.out.println("End of first Thread");

            System.out.println("Is First Thread alive ? : "+dobj1.isAlive());
            dobj2.start();                       
            dobj2.join();
            System.out.println("End of Second Thread");

        }
        catch(InterruptedException iobj)
        {
            
        }

        System.out.println("End of main Thread");
   }
}