import java.util.*;
public class RandInt {
    public static void main() {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter loop number:");
        int l = sc.nextInt();
        for (i=1; i<=l; i++) {
            int x = (int)((Math.random()*n)+1);
            System.out.println("Random Integer between 1 and "+n+": "+x);
        }
    }
}