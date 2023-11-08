import java.util.*;
public class scFvelocity {
    public static void main() {
        double u,a,s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter initial velocity: ");
        u = in.nextDouble();
        System.out.println("Enter the value of acceleration: ");
        a = in.nextDouble();
        System.out.println("Enter distance covered: ");
        s = in.nextDouble();
        double v = (u*u)+(2*a*s);
        double fv = Math.sqrt(v);
        System.out.println("=====================================================================");
        System.out.println(":FINAL VELOCITY OF THE VEHICLE:");
        System.out.println("");
        System.out.println(fv);
    }
}