import java.util.*;
public class scCircle
{
    public static void main()
    {
        int r;
        Scanner pi = new Scanner(System.in);
        System.out.println("Input radius of the circle:");
        r = pi.nextInt();
        double a = 3.14*r*r;
        double p = 2*3.14*r;
        System.out.println(":=======================================================================================:");
        System.out.println("Area: "+a);
        System.out.println("Perimeter: "+p);
        System.out.println(":=======================================================================================:");
    }
}
