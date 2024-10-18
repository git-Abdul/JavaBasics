public class Pattern {
    public static void main() {
        int i,j,k,m=2,n=2;
        for(i = 1; i<=6; i++) {
            for(j=1; j<=i; j++) {
                System.out.print(i);
            }
            for(k=5; k>=i; k--) {
                System.out.print(m);
                m++;
            }
            n=n+1;
            m=n;
            System.out.println();
        }
    }
}