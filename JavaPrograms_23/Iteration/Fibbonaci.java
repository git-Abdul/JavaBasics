package Iteration;
class Fibbonaci {
    public static void main(int n) {
        int a = 5;
        int b = 8;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i = 1; i<=n; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c+" ");
        }
    }
}