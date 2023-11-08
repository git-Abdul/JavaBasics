import java.util.*;
public class scTemp
{
    public static void main()
    {
        int c;
        Scanner cT = new Scanner(System.in);
        System.out.println("Enter Celcius temp:");
        c = cT.nextInt();
        double f = 9/5.0*(c+32.0);
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