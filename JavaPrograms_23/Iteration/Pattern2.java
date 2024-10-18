package Iteration;
class Pattern2 {
    public static void main() {
        int i,j,k, x = 65;
        for(i=1; i<=5; i++) {
            for(j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            for(k=5; k>=i; k--) {
                System.out.print((char)x+" ");
            }
            System.out.println();
            x++;
        }
    }
}