package Iteration;
class FloydTriangle {
    public static void main() {
        int i, j, n = 1;
        for(i = 1; i<=4; i++) {
            for(j = 1; j<=i; j++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}