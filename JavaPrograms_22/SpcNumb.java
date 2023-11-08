import java.util.*;
public class SpcNumb {
    public static void main(){
        int a,b;
        System.out.println("Enter number 1");
        Scanner num = new Scanner(System.in);
        a = num.nextInt();
        System.out.println("Enter number 2");
        b = num.nextInt();
        int c = ((a*10)+b);
        if ((a*b)+(a+b)==c) {
            System.out.println("Special number "+a+""+b); 
        }
        else 
            System.out.println("No special number");
        }
    }