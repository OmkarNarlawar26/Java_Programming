class ThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("Inside Main method");
        Thread tobj = Thread.currentThread();
        String name = tobj.getName();
        System.out.println("name of current Thread is : "+name);
        int Priority = tobj.getPriority();
        System.out.println("Priority of current is : "+Priority);
        tobj.setPriority(10);
        Priority = tobj.getPriority();
        System.out.println("Priority of current is : "+Priority);
    }
}