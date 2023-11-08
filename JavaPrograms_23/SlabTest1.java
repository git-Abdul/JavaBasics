/** WAP program to input electricity unit charges and calculate total electricity bill according to the given condition:

For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill
*/
import java.util.*;
public class SlabTest1 {
    public static void main(String args[]) {
        double bill = 0.0;
        double taxed = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units consumed: ");
        int u = sc.nextInt();
        if (u>=1 && u<=50){
            bill = u*0.5;
        }
        else if (u>=50 && u<=150){
            bill = (50*0.5) + (u-50)*0.75;
        }
        else if (u>=150 && u<=250){
            bill = (50*0.5) + (100*0.75) + (u-150)*1.2;
        }
        else if (u>250){
            bill = (50*0.5) + (100*0.75) + (100*1.20) + (u-250)*1.5;
        }
        taxed = (120*bill)/100.0;
        System.out.println("Bill: "+taxed);
    }
}