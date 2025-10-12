class ThreadDemo2
{
    public static void main(String A[])
    {
        System.out.println("Inside Main method");
        Thread tobj = Thread.currentThread();
        String name = tobj.getName();
        System.out.println("name of current Thread is : "+name);
    }
}