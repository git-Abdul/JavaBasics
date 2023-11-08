import java.util.*;
public class spcNumb2 {
    public static void main(){
        int a;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number 1");
        a = num.nextInt();
        int t = a/10;
        int o = a-(t*10);
        int sum = t+o;
        int pr = t*o;
        int add = sum+pr;
        if (add==a)
            System.out.println("Special Number "+a);
        else
            System.out.println("Non special number "+a);
        }
    }