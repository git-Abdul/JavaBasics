public class Swap
{
    public static void main(int a, int b)
    {
        int c = a;
        a = b;
        b = c;
        System.out.println("New value of a = "+a);
        System.out.println("New value of b = "+b);
    }
}