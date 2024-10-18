package Iteration;
import java.util.*;
public class Sum {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: 1 - Fibbonacci series; 2 - Sum of digits;");
        int o = sc.nextInt();
        switch(o) {
            case 1:
                int a = 0;
                int b = 1;
                int c;
                System.out.println("Enter number of terms: ");
                int n = sc.nextInt();
                System.out.print(a+" "+b+" ");
                for(int i = 1; i<=n; i++) {
                    c = a+b;
                    a=b;
                    b=c;
                    System.out.print(c+" ");
                }
                break;
            case 2: 
                System.out.println("Enter the number: ");
                int nn = sc.nextInt();
                int r;
                int s = 0;
                while(nn>0) {
                    r=nn%10;
                    nn/=10;
                    s+=r;
                }
                System.out.println("Sum of digits: "+s);
                break;
        }
    }
}