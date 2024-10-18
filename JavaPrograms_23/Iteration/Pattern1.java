package Iteration;
class Pattern1 {
    public static void main() {
        int i, j, n = 5, k = 5, p, x = 0;
        for(i = 1; i<=5; i++) {
            for(j = 5; j>=i; j--) {
                System.out.print(n+" ");
                n--;
            }
            n=k-1;
            k--;
            System.out.println();
            x+=1;
        }
    }
}