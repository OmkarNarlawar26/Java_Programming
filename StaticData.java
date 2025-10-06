
class Demo
{
    public int i;
    static public int j = 21;

    public Demo()
    {
        this.i = 11;
        // this.j = 21;                //ERROR not allowed in java
    }

}

class StaticData
{
    public static void main(String A[])
    {
        System.out.println(Demo.j);
        Demo dobj = new Demo();
        System.out.println(dobj.i);
    }
}