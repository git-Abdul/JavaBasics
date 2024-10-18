import java.util.*;
class Patterns {
    void pattern1() {
        int n = 65;
        int m = 65;
        for(int i = 5; i>=1; i--) {
            for(int j=i; j>=1; j--) {
                System.out.print((char)n+" ");
                n++;
            }
            System.out.println();
            m++;
            n=m;
        }
        System.out.println();
    }

    void pattern2() {
        int n = 65;
        for(int i = 1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print((char)n+" ");
                n++;
            }
            System.out.println();
        }
        System.out.println();
    }

    void pattern3() {
        int n = 65;
        int m = 65;
        int k = 65;
        for(int i = 5; i>=1; i--) {
            for(int j=i; j>=1; j--) {
                System.out.print((char)n+" ");
                n++;
            }
            if(i!=5) {
                for(int j=1; j<=5-i; j++) {
                    System.out.print((char)k+" ");
                    k++;
                }
                k=m;
            }
            System.out.println();
            n=m;
        }
        System.out.println();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        Patterns ob = new Patterns();
        ob.pattern1();
        ob.pattern2();
        ob.pattern3();
    }
}
