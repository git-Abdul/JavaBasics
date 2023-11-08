import java.util.*;
public class Days {
    public static void main () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int d = sc.nextInt();
        int y = d/365;
        int ry = d%365;
        int m = ry/30;
        int rd = ry%30;
        System.out.println("==========================================================================================");
        System.out.println("Years: "+y);
        System.out.println("Months: "+m);
        System.out.println("Remaining days: "+rd);
        System.out.println("==========================================================================================");
    }
}