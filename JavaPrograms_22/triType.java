import java.util.*;
public class triType { 
    public static void main() {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter angle 1:");
        a = in.nextInt();
        System.out.println("Enter angle 2:");
        b = in.nextInt();
        System.out.println("Enter angle 3:");
        c = in.nextInt();
        if (((a+b)>c)&&((b+c)>a)&&((c+a)>b))
         {
             System.out.println("Triangle is possible");
            if ((a==b)&&(b==c)&&(c==a))
                System.out.println("Equilateral triangle");
            else if ((a==b)||(b==c)||(c==a))
                System.out.println("Isosceles triangle");
            else if ((a!=b)&&(b!=c)&&(c!=a))
                System.out.println("Scalene triangle");
         }
         else
             System.out.println("Triangle is not possible");
    }
}