public class greatest 
{
    public static void main(int a, int b, int c)
    {
        if ((a>b)&&(a>c))
        {
            System.out.println(a+" Is the greatest");
        }
        else if ((b>c)&&(b>a))
        {
            System.out.println(b+" Is the greatest");
        }
        else
        {
            System.out.println(c+" Is the greatest");
        }
    }
}