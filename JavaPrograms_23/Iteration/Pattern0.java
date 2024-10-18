package Iteration;
class Pattern0 {
    public static void main() {
        int i, j, a=0;
        for(i = 7; i>=1; i=i-2) {
            for(j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}