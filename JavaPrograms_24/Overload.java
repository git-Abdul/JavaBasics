import java.util.*;
class Overload {
    void series(int x) {
        double s = 0.0;
        double n = 0.0;
        for(int i = 1; i<=20; i++) {
            n = Math.pow(x,i);
            if(i%2 == 0) {
                s-=n;
            }
            else {
                s+=n;
            }
        }
        System.out.println(s);
    }
    void series(int a, int n) {
        int k = 2;
        double s = 0.0;
        double f = 0.0;
        for(int i = 1; i<=n; i++) {
            f = 1/Math.pow(a,k);
            k+=2;
            s+=f;
        }
        System.out.println(s);
    }
    public static void main(int x, int a, int n) {
        Scanner sc = new Scanner(System.in);
    }
}
