import java.util.*;
public class Multiplication {
    public static void main() {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired number: ");
        int n = sc.nextInt();
        for (i=1; i<=100; i++) {
            int m  = n*i;
            System.out.println(n + " x " + i + " = "+ m);
        }
    }
}