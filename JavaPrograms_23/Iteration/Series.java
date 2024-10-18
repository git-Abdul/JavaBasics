package Iteration;
class Series {
    void Pattern0(int n) {
        long a  = 4;
        int i;
        long s = 0;
        for(i=1; i<=n; i++) {
            s=s*10+a;
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println();
    }
    void Pattern1() {
        int i, j;
        for(i = 5; i>=1; i--) {
            for(j = 1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    void Pattern2() {
        int i, j, ch= 65;
        for(i = 4; i>=1; i--) {
            ch = 65;
            for(j = 1; j<=i; j++) {
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();
    }
    void Pattern3(){ 
        int i, j;
        for(i = 1; i<=5; i++) {
            for(j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main() {
        Series pattern = new Series();
        pattern.Pattern0(10);
        pattern.Pattern1();
        pattern.Pattern2();
        pattern.Pattern3();
    }
}