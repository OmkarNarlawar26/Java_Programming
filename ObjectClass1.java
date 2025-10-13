class Demo
{}

class ObjectClass1      // It comes from Extends Object
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        System.out.println(dobj.hashCode());
        System.out.println(dobj.getClass());
    }
}