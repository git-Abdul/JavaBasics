import java.util.*;
public class scHp {
    public static void main() {
        Scanner side = new Scanner(System.in);
        int s1,s2;
        System.out.println("Enter side 1");
        s1 = side.nextInt();
        System.out.println("Enter side 2");
        s2 = side.nextInt();
        double sqr = (s1*s1) + (s2*s2);
        double hy = Math.sqrt(sqr);
        System.out.println("Hypotenuse: "+hy);
    }
}