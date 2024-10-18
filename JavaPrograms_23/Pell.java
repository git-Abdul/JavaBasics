public class Pell {
    public static void main() {
        int a=0,b=1,c=0;
        System.out.print(a+",");
        System.out.print(b+",");
        for(int i = 3; i<=15; i++) {
            c=2*b+a;
            System.out.print(c+",");
            a=b;
            b=c;
            c=0;
        }
    }
}