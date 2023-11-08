import java.util.*;
public class Equation{
    public static void main() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of a: ");
       int a = sc.nextInt();
       System.out.println("Enter value of b: ");
       int b = sc.nextInt();
       System.out.println("Enter value of c: ");
       int c = sc.nextInt();
       double x = 1/a*a;
       double y = b/2*a;
       double z = 1/4*a*c;
       System.out.println("Answer= "+(x+y+z));
    }
}