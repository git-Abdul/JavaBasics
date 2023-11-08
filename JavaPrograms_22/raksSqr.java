import java.util.*;
public class raksSqr {
    public static void main() {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        a = in.nextInt();
        double sqr = Math.sqrt(a);
        int c  = (int)sqr;
        if (sqr == c)
            System.out.println("Perfect Square!");
        else 
            System.out.println("Non perfect square");
    }
}