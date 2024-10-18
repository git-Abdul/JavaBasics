import java.util.*;
class Disarium {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int nn = n;
        double r=0.0, s=0.0;
        String str = Integer.toString(n);
        int c = str.length();
        while(n>0) {
            r=n%10;
            n/=10;
            s = s+(Math.pow(r,c));
            c--;
        }
        if(s == nn) {
            System.out.println("Disarium Number");
        }
        else {
            System.out.println("Normal Number");
        }
    }
}
