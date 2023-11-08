/**
   Define a class called Mobike; Accept the input as bike number,ph number, name of customer and days of rent of the bike;
   Charge to calculate and store rental charges, the rent of a mobike is charged on the following:
   
   First 5 days          500rs/day
   Next 5 days           400rs/day
   Rest of the days      200rs/day
   
   Display the data in following format: Bike no    Phone No    Customer name    No of days    Charge*/
  
import java.util.*;
public class BillingTest {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer details: ");
        String name = sc.nextLine();
        long phno = sc.nextLong();
        int bn = sc.nextInt();
        System.out.println("Enter due days: ");
        int d = sc.nextInt();
        double fine = 0.0;
        if (d>=1 && d<=5) {
            fine = d*500;
        }
        else if (d>=5 && d<=10) {
            fine = (d-5)*400 + 5*500;
        }
        else {
            fine = 5*500 + 5*400 + (d-10)*200;
        }
        System.out.println("Bike number \t Ph Number \t Customer name \t No of days due \t Charge \t");
        System.out.println(bn+"\t"+phno+"\t"+name+"\t"+d+"\t"+fine);
    }
}