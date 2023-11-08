import java.util.*;
public class split {
    public static void main() {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a desired number: ");
        a = in.nextInt();
        int t = a/10;
        int o = a%10;
        if (t<o)
        {
            double cube = Math.pow(t,3);
            double sqr = Math.pow(o,2);
            System.out.println("");
            System.out.println("============================================================");
            System.out.println("");
            System.out.println("Cube of first number: "+cube);
            System.out.println("Square of second number: "+sqr);
        }
        else if (t>o)
        {
            double sqr = Math.pow(t,2);
            double cube = Math.pow(o,3);
            System.out.println("");
            System.out.println("============================================================");
            System.out.println("");
            System.out.println("Square of first number: "+sqr);
            System.out.println("Cube of second number: "+cube);
        }
        else
        {
            System.out.println("");
            System.out.println("============================================================");
            System.out.println("");
            System.out.println("The number has same digits");
        }
    }
}