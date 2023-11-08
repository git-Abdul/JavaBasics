public class Temperature
{
    public static void main(double c)
    {
        double f = 9.0/5.0*(c+32.0);
        System.out.println(f+"F is the temperature.");
        if (f == 96.8)
        {
            System.out.println("Normal Temperature");
        }
        else
        {
            System.out.println("Has fever ;-;");
        }
    }
}