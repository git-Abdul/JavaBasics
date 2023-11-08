public class testProgram
{
    public static void main()
    {
        int p = 10, q = 14;
        System.out.println("Result:"+p++);
        p++;
        System.out.println("Result:"+p);
        q=++q;
        System.out.println("Result:"+q);
        System.out.println("Result:"+(p++ + q));
    }
}