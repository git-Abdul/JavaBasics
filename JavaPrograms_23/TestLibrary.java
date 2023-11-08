/**
 * Find the amt to be paid for after due book, by taking input of days late: print late fine -
 * Cautioned money: 350rs
   Number of days late:              Fine: 
   Upto 5 days                       10rs
   Next 5 days                       5rs/day
   Next 5 days                       7rs/day
   
   Seize caution money if a book is kept after 15 days.*/
import java.util.*;
public class TestLibrary {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of days due: ");
        int d = sc.nextInt();
        double fine = 0.0;
        if (d>=1 && d<=5) {
            fine = (double)10.0;
        }
        else if (d>5 && d<=10) {
            fine = (double)10 + (d-5)*5;
        }
        else if (d>10 && d<=15) {
            fine = (double)10 + 5*5 + (d-10)*7;
        }
        else {
            System.out.println("We have seized your cautioned amount: 350rs");
        }
        if (d<=15) {
            System.out.println("Fine: "+fine);
        }
    }
}