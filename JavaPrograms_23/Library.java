import java.util.*;
/* Define a class library to calculate a fine as per the given table: *
 * 1-5 day: 1.5rs p/day
 * Next 5 day: 1.75rs p/day
 * Rest of the day: 2rs p/day
*/
public class Library {
    public static void main() {
        double fine;
        int i;
        for (i=1; i<=100; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter book title: ");
            String name = sc.nextLine();
            System.out.println("Enter author name: ");
            String auth = sc.nextLine();
            System.out.println("Enter book number: ");
            long bnum = sc.nextLong();
            System.out.println("Enter due days: ");
            int d = sc.nextInt();
            System.out.println("============================================================");
            System.out.println("");
            //===================================================================//
            if (d<=5) {
                fine = d*1.5;
            }
            else if(d>5 && d<=10) {
                int rd = d-5;
                fine = (5*1.5)+(rd*1.75);
            }
            else {
                int rd1 = d-5;
                int rd2 = d-10;
                fine = (5*1.5)+(rd1*1.75)+(rd2+2.0);
            }
            System.out.println("Book name: "+name);
            System.out.println("Book num: "+bnum);
            System.out.println("Author name: "+auth);
            System.out.println("Due days: "+d);
            System.out.println("Fine: "+fine+"₹");
            System.out.println("");
            System.out.println("============================================================");
            System.out.println("");
        }
    }
}