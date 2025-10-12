class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside Main method");
        String name = Thread.currentThread().getName();
        System.out.println("name of current Thread is : "+name);
    }
}