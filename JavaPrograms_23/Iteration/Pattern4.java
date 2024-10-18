package Iteration;
class Pattern4 {
    public static void main() {
        int i, j;
        for(i = 1; i<=5; i+=2) {
            for(j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}